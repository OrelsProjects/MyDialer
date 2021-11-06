package com.orelzman.mydialer.domain.repository

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.orelzman.mydialer.domain.model.Call
import kotlinx.coroutines.flow.Flow

/**
 * @author Orel Zilberman, 06.11.2021
 */
interface CallRepository {
    fun getCalls(): Flow<List<Call>>
    suspend fun getCallById(callId: String)
    suspend fun updateCall(call: Call)
    suspend fun deleteCall(callId: String)
    suspend fun insertCall(call: Call)
}