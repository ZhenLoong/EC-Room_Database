package com.example.environmentchallenge.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="user_table")
data class User(
    @PrimaryKey(autoGenerate = true)
    val userId: Long = 0L,

    @ColumnInfo(name="user_name")
    val userName: String,

    @ColumnInfo(name="user_points")
    val userPoints: Int
)