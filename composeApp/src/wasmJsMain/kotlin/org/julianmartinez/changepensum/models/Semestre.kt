package org.julianmartinez.changepensum.models


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Semestre(
    @SerialName("materias")
    val materias: List<Materia>,
    @SerialName("semestre")
    val semestre: Int
)