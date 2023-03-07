package com.example.breastcancerlocal.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.breastcancerlocal.model.HeartDiseaseEntity

@Database(entities = [(HeartDiseaseEntity::class)], version = 1, exportSchema = false)
abstract class HeartDiseaseDatabase : RoomDatabase() {
    abstract fun heartDiseaseDao(): HeartDiseaseEntityDAO
}
