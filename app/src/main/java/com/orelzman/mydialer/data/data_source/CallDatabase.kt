package com.orelzman.mydialer.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.orelzman.mydialer.domain.model.Call

@Database(
    entities = [Call::class],
    version = 2
)
abstract class CallDatabase : RoomDatabase() {

    abstract val callsDao: CallDao

    companion object {
        const val DATABASE_NAME = "dialer_db"
    }
}