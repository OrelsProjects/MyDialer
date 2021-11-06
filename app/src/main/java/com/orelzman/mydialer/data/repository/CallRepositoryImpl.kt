package com.orelzman.mydialer.data.repository

import com.orelzman.mydialer.data.data_source.CallDao
import com.orelzman.mydialer.domain.model.Call
import com.orelzman.mydialer.domain.repository.CallRepository
import kotlinx.coroutines.flow.Flow

class CallRepositoryImpl(
    private val dao: CallDao
) : CallRepository {

    override fun getCalls(): Flow<List<Call>> = dao.getCalls()

    override suspend fun getCallById(callId: String) = dao.getCallById(callId = callId)

    override suspend fun updateCall(call: Call) = dao.updateCall(call = call)

    override suspend fun deleteCall(callId: String) = dao.deleteCall(callId = callId)

    override suspend fun insertCall(call: Call) = dao.insertCall(call = call)
}