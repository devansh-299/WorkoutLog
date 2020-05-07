package com.devansh.domain.repository

import com.devansh.domain.ResultWrapper
import com.devansh.domain.entity.Workout
import com.devansh.domain.enum.DateRange
import java.lang.Exception

interface WorkoutRepository {

    fun getWorkoutsByDate(date:String, selection: DateRange):
            ResultWrapper<Exception, List<Workout>>

    fun updateWorkout(updatedWorkout: Workout): ResultWrapper<Exception, Unit>

    fun deleteWorkout(creationDateId: String): ResultWrapper<Exception, Unit>


}