package com.orelzman.mydialer

import android.os.Build
import android.telecom.Call
import android.telecom.CallScreeningService
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.N)
class CallScreeningServiceImpl: CallScreeningService() {
    override fun onScreenCall(call: Call.Details) {
        println()
    }
}