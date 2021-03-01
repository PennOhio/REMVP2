package com.example.remvp2.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.example.remvp2.database.Property
import com.example.remvp2.database.PropertyDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class PropertyRepository(private val database: PropertyDatabase) {

    suspend fun refreshProperties() {
        withContext(Dispatchers.IO){
        }
    }


}