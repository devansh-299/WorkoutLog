package com.devansh.domain.repository

import com.devansh.domain.ResultWrapper
import com.devansh.domain.entity.WorkoutTemplate
import java.lang.Exception

interface WorkoutTemplateRepository {

    fun getWorkoutTemplates(getCustom: Boolean): ResultWrapper<Exception, List<WorkoutTemplate>>

    fun deleteWorkoutTemplate(id: Int): ResultWrapper<Exception, Unit>

    fun updateWorkoutTemplate(updatedTemplate: WorkoutTemplate): ResultWrapper<Exception, Unit>


}