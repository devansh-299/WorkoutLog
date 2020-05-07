package com.devansh.domain.entity

data class Workout(
    val name:String,
    val createdOn: String,
    val exercises: List<Exercise>
)