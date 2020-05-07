package com.devansh.domain.entity

import com.devansh.domain.enum.ExerciseType

data class Exercise(
    val name:String,
    val sets: List<Set>,
    val type: ExerciseType
)