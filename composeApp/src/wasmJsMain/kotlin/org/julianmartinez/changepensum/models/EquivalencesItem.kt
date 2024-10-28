package org.julianmartinez.changepensum.models


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class EquivalencesItem(
    @SerialName("actualSubjects")
    val actualSubjects: List<String>,
    @SerialName("newSubject")
    val newSubject: String
)