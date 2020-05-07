package com.devansh.domain.entity

import com.devansh.domain.enum.ExerciseTarget

data class WorkoutTemplate(
    val id: Int,
    val name: String,
    val thumbnailRes: String,
    val description: String,
    val difficulty: Int,
    val targets: List<ExerciseTarget>,
    val workout: Workout,
    val isCustom: Boolean
)