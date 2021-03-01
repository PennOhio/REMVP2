package com.example.remvp2.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [Property::class], version = 1, exportSchema = false)
abstract class PropertyDatabase : RoomDatabase() {
    abstract val propertyDatabaseDao: PropertyDatabaseDao

    companion object {
        @Volatile
        private var INSTANCE: PropertyDatabase? = null
        fun getInstance(context: Context): PropertyDatabase {
            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        PropertyDatabase::class.java,
                        "property_database"
                    ).fallbackToDestructiveMigration()
                        .build()
                }
                return instance
            }
        }
    }
}
