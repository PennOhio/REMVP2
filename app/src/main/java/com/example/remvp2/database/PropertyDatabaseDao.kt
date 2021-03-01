package com.example.remvp2.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface PropertyDatabaseDao {
    @Insert
    fun insert(property: Property)

    @Update
    fun update(property: Property)

    @Query("Select * from property_table")
    fun getAllProperties(): List<Property>

    @Query("DELETE FROM property_table")
    fun clear()

}