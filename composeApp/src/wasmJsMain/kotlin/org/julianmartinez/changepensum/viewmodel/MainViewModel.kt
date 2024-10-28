package org.julianmartinez.changepensum.viewmodel

import androidx.compose.runtime.Stable
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.serialization.json.Json
import org.julianmartinez.changepensum.data.actualPensum
import org.julianmartinez.changepensum.data.equivalences
import org.julianmartinez.changepensum.data.newPensum
import org.julianmartinez.changepensum.models.EquivalencesItem
import org.julianmartinez.changepensum.models.Subject
import org.julianmartinez.changepensum.models.Pensum
import org.koin.core.component.KoinComponent

class MainViewModel: BaseViewModel(), KoinComponent {


    private val _uiState = MutableStateFlow(UiState())
    val uiState: StateFlow<UiState> = _uiState.asStateFlow()

    private var equivalentSubjects: List<EquivalencesItem>? = null

    fun loadPensum() {
        val pensum = Json.decodeFromString<Pensum>(actualPensum)
        val newPensum = Json.decodeFromString<Pensum>(newPensum)

        equivalentSubjects = Json.decodeFromString<List<EquivalencesItem>>(equivalences)

        val actualPensumStatistics = PensumStatistics(
            totalCredits = pensum.creditos,
            totalSubjects = pensum.subjects.size,
            remainingCredits = pensum.creditos,
            remainingSubjects = pensum.subjects.size
        )

        val newPensumStatistics = PensumStatistics(
            totalCredits = newPensum.creditos,
            totalSubjects = newPensum.subjects.size,
            remainingCredits = newPensum.creditos,
            remainingSubjects = newPensum.subjects.size
        )

        val actualSubjectsWithoutEquivalence = pensum.subjects.filter { actualSubject ->
            !equivalentSubjects!!.any { it.actualSubjects.contains(actualSubject.codigo) }
        }

        _uiState.value = _uiState.value.copy(
            actualPensum = pensum,
            newPensum = newPensum,
            actualPensumStatistics = actualPensumStatistics,
            newPensumStatistics = newPensumStatistics
        )
    }

    fun selectSubject(subject: Subject) {
        val _pensum = _uiState.value.actualPensum ?: return
        val actualPensum = _pensum.copy(
            subjects = _pensum.subjects.map {
                if (it.codigo == subject.codigo) {
                    it.copy(isSelected = !it.isSelected)
                } else {
                    it
                }
            }
        )

        val approvedCredits: Int = actualPensum.subjects.filter { it.isSelected }.sumOf { it.creditos }
        val approvedSubjects: Int = actualPensum.subjects.count { it.isSelected }
        val remainingSubjects: Int = actualPensum.subjects.count { !it.isSelected }
        val remainingCredits: Int = actualPensum.subjects.filter { !it.isSelected }.sumOf { it.creditos }


        val newPensum: Pensum = homologateSubjects(
            actualPensum = actualPensum,
            newPensum = _uiState.value.newPensum ?: return,
            equivalentSubjects = equivalentSubjects ?: return
        )

        val newPensumApprovedCredits: Int = newPensum.subjects.filter { it.isSelected }.sumOf { it.creditos }
        val newPensumApprovedSubjects: Int = newPensum.subjects.count { it.isSelected }
        val newPensumRemainingSubjects: Int = newPensum.subjects.count { !it.isSelected }
        val newPensumRemainingCredits: Int = newPensum.subjects.filter { !it.isSelected }.sumOf { it.creditos }



        _uiState.value = _uiState.value.copy(
            actualPensum = actualPensum,
            actualPensumStatistics = _uiState.value.actualPensumStatistics.copy(
                approvedCredits = approvedCredits,
                approvedSubjects = approvedSubjects,
                remainingCredits = remainingCredits,
                remainingSubjects = remainingSubjects
            ),
            newPensum = newPensum,
            newPensumStatistics = _uiState.value.newPensumStatistics.copy(
                approvedCredits = newPensumApprovedCredits,
                approvedSubjects = newPensumApprovedSubjects,
                remainingCredits = newPensumRemainingCredits,
                remainingSubjects = newPensumRemainingSubjects
            )
        )
    }

    private fun homologateSubjects(
        actualPensum: Pensum,
        newPensum: Pensum,
        equivalentSubjects: List<EquivalencesItem>
    ): Pensum {
        val actualSubjectsMap = actualPensum.subjects.associateBy { it.codigo }

        val newPensumWithHomologation = newPensum.copy(
            subjects = newPensum.subjects.map { newSubject ->
                val equivalentSubjectsFind = equivalentSubjects.find { it.newSubject == newSubject.codigo }
                if (equivalentSubjectsFind != null) {
                    val allEquivalentSubjectsSelected = equivalentSubjectsFind.actualSubjects.all {
                        actualSubjectsMap[it]?.isSelected ?: false
                    }
                    newSubject.copy(isSelected = allEquivalentSubjectsSelected)
                } else {
                    newSubject
                }
            }
        )

        return newPensumWithHomologation
    }

}

@Stable
data class UiState(
    val isLoading: Boolean = false,
    var error: String? = null,
    val actualPensum: Pensum? = null,
    val actualPensumStatistics: PensumStatistics = PensumStatistics(),
    val newPensum: Pensum? = null,
    val newPensumStatistics: PensumStatistics = PensumStatistics(),
    //val actualPensumSelectedSubjects: List<Materia> = emptyList(),
)


data class PensumStatistics(
    var approvedCredits: Int = 0,
    var approvedSubjects: Int = 0,
    var totalCredits: Int = 0,
    var totalSubjects: Int = 0,
    var remainingCredits: Int = 0,
    var remainingSubjects: Int = 0,
)