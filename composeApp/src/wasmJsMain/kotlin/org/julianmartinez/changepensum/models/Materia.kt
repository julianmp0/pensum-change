package org.julianmartinez.changepensum.models


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Materia(
    @SerialName("codigo")
    val codigo: String,
    @SerialName("creditos")
    val creditos: Int,
    @SerialName("nombre")
    val nombre: String,
    @SerialName("practica")
    val practica: Int,
    @SerialName("teoria")
    val teoria: Int
)