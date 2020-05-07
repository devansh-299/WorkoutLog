package com.devansh.domain.repository

import com.devansh.domain.ResultWrapper
import com.devansh.domain.entity.ExerciseTemplate
import java.lang.Exception

interface ExerciseTemplateRepository {

    fun getExerciseTemplateByFilter(filter: String, isCustom: Boolean):
            ResultWrapper<Exception, List<ExerciseTemplate>>

    fun updateExerciseTemplateByFilter(updatedTemplate: ExerciseTemplate):
            ResultWrapper<Exception, Unit>

}