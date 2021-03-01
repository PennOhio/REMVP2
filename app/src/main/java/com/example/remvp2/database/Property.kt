package com.example.remvp2.database

import androidx.lifecycle.LiveData
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "property_table")
data class Property(
    @PrimaryKey var address: LiveData<String>
)
