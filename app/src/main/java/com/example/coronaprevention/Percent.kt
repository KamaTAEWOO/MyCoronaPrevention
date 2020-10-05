package com.example.coronaprevention

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "percent")
class Percent (@PrimaryKey var id: Long?,
               @ColumnInfo(name = "date") var catName: String?,
               @ColumnInfo(name = "percent") var lifeSpan: Int,
               @ColumnInfo(name = "state") var origin: String
){
    constructor(): this(null,"", 0,"")
}