package org.julianmartinez.changepensum.models


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Pensum(
    @SerialName("semestres")
    val semestres: List<Semestre>
)