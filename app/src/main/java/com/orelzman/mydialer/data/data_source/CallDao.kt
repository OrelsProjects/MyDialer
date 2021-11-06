package com.orelzman.mydialer.data.data_source

import androidx.room.*
import com.orelzman.mydialer.domain.model.Call
import kotlinx.coroutines.flow.Flow

@Dao
interface CallDao {

    @Query("SELECT * FROM Call")
    fun getCalls(): Flow<List<Call>>

    @Update
    suspend fun updateCall(call: Call)

    @Query("UPDATE Call SET isActive=:callId")
    suspend fun deleteCall(callId: String)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCall(call: Call)

    @Query("SELECT * FROM Call WHERE callId = :callId")
    fun getCallById(callId: String): Call
}