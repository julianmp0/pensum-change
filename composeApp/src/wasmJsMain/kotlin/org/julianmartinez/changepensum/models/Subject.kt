package org.julianmartinez.changepensum.models


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Subject(
    @SerialName("codigo")
    val codigo: String,
    @SerialName("creditos")
    val creditos: Int,
    @SerialName("nombre")
    val nombre: String,
    @SerialName("practica")
    val practica: Int = 0,
    @SerialName("teoria")
    val teoria: Int = 0,
    @SerialName("semestre")
    val semestre: Int,
    val isSelected:Boolean = false
)