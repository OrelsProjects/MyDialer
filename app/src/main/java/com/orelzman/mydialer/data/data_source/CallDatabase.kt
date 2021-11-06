package com.orelzman.mydialer.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.orelzman.mydialer.data.utils.Converters
import com.orelzman.mydialer.domain.model.Call

@Database(
    entities = [Call::class],
    version = 0
)
@TypeConverters(Converters::class)
abstract class CallDatabase : RoomDatabase() {

    abstract val callsDao: CallDao

    companion object {
        const val DATABASE_NAME = "dialer_db"
    }
}