package com.devansh.domain.entity

import com.devansh.domain.enum.ExerciseTarget
import com.devansh.domain.enum.ExerciseType

data class ExerciseTemplate(
    val name: String,
    val thumbnailRes: String,
    val targets: List<ExerciseTarget>,
    val isCustom: Boolean,
    val type: ExerciseType
)