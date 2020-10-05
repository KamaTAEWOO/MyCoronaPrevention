package com.example.coronaprevention

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query

@Dao
interface PercentDao {
    @Query("SELECT * FROM percent")
    fun getAll(): List<Percent>

    /* import android.arch.persistence.room.OnConflictStrategy.REPLACE */
    @Insert(onConflict = REPLACE)
    fun insert(percent: Percent)

    @Query("DELETE from percent")
    fun deleteAll()
}