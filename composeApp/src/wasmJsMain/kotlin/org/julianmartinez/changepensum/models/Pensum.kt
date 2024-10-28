package org.julianmartinez.changepensum.models


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Pensum(
    @SerialName("materias")
    val subjects: List<Subject>,
    @SerialName("creditos")
    val creditos: Int
) {
    fun groupBySemestre(): List<Pair<Int, List<Subject>>> {

        return sortMapByKey(subjects.groupBy { it.semestre })
    }


    fun sortMapByKey(materiasMap: Map<Int, List<Subject>>): List<Pair<Int, List<Subject>>> {
        val mapList = materiasMap.toList().toMutableList() // Convertir el Map a una lista de pares (clave, valor)

        // Implementación del algoritmo de burbuja (Bubble Sort)
        for (i in 0 until mapList.size - 1) {
            for (j in 0 until mapList.size - i - 1) {
                if (mapList[j].first > mapList[j + 1].first) {
                    // Intercambiar las posiciones
                    val temp = mapList[j]
                    mapList[j] = mapList[j + 1]
                    mapList[j + 1] = temp
                }
            }
        }

        return mapList // Devolver la lista de pares ordenada
    }
}