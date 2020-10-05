package com.example.coronaprevention

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Percent::class], version = 1)
abstract class PercentDB : RoomDatabase() {
    abstract fun percentDao(): PercentDao

    companion object {
        private var INSTANCE: PercentDB? = null

        fun getInstance(context: Context): PercentDB? {
            if (INSTANCE == null) {
                synchronized(PercentDB::class) {
                    INSTANCE = Room.databaseBuilder(context.applicationContext,
                        PercentDB::class.java, "percent.db")
                        .fallbackToDestructiveMigration()
                        .build()
                }
            }
            return INSTANCE
        }

        fun destroyInstance() {
            INSTANCE = null
        }
    }
}