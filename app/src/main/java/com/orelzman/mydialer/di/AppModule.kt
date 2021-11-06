package com.orelzman.mydialer.di

import android.app.Application
import androidx.room.Room
import com.orelzman.mydialer.data.data_source.CallDatabase
import com.orelzman.mydialer.data.repository.CallRepositoryImpl
import com.orelzman.mydialer.domain.repository.CallRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
//    @Provides
//    @Singleton
//    fun provideActionDatabase(app: Application): CallDatabase {
//        return Room.databaseBuilder(
//            app,
//            CallDatabase::class.java,
//            CallDatabase.DATABASE_NAME
//        ).fallbackToDestructiveMigration()
//            .build()
//    }
//
//    @Provides
//    @Singleton
//    fun provideActionRepository(db: CallDatabase): CallRepository {
//        return CallRepositoryImpl(db.callsDao)
//    }
}