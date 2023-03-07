package com.example.breastcancerlocal.database

import com.example.breastcancerlocal.model.HeartDiseaseEntity
import com.example.breastcancerlocal.HeartDiseaseApplication
import kotlinx.coroutines.flow.Flow

class Repository : HeartDiseaseRepository {

    private val heartDiseaseDAO: HeartDiseaseEntityDAO by lazy { HeartDiseaseApplication.database.heartDiseaseDao() }

    val allHeartDiseases: Flow<List<HeartDiseaseEntity>> = heartDiseaseDAO.listHeartDiseases()

    val allHeartDiseaseids: Flow<List<String>> = heartDiseaseDAO.listHeartDiseaseids()
    val allHeartDiseaseages: Flow<List<Int>> = heartDiseaseDAO.listHeartDiseaseages()
    val allHeartDiseasesexs: Flow<List<Int>> = heartDiseaseDAO.listHeartDiseasesexs()
    val allHeartDiseasecps: Flow<List<Int>> = heartDiseaseDAO.listHeartDiseasecps()
    val allHeartDiseasetrestbpss: Flow<List<Int>> = heartDiseaseDAO.listHeartDiseasetrestbpss()
    val allHeartDiseasechols: Flow<List<Int>> = heartDiseaseDAO.listHeartDiseasechols()
    val allHeartDiseasefbss: Flow<List<Int>> = heartDiseaseDAO.listHeartDiseasefbss()
    val allHeartDiseaserestecgs: Flow<List<Int>> = heartDiseaseDAO.listHeartDiseaserestecgs()
    val allHeartDiseasethalachs: Flow<List<Int>> = heartDiseaseDAO.listHeartDiseasethalachs()
    val allHeartDiseaseexangs: Flow<List<Int>> = heartDiseaseDAO.listHeartDiseaseexangs()
    val allHeartDiseaseoldpeaks: Flow<List<Int>> = heartDiseaseDAO.listHeartDiseaseoldpeaks()
    val allHeartDiseaseslopes: Flow<List<Int>> = heartDiseaseDAO.listHeartDiseaseslopes()
    val allHeartDiseasecas: Flow<List<Int>> = heartDiseaseDAO.listHeartDiseasecas()
    val allHeartDiseasethals: Flow<List<Int>> = heartDiseaseDAO.listHeartDiseasethals()
    val allHeartDiseaseoutcomes: Flow<List<String>> = heartDiseaseDAO.listHeartDiseaseoutcomes()

    //Create
    override suspend fun createHeartDisease(heartDisease: HeartDiseaseEntity) {
        heartDiseaseDAO.createHeartDisease(heartDisease)
    }

    //Read
    override suspend fun listHeartDisease(): List<HeartDiseaseEntity> {
        return heartDiseaseDAO.listHeartDisease()
    }

    //Update
    override suspend fun updateHeartDisease(heartDisease: HeartDiseaseEntity) {
        heartDiseaseDAO.updateHeartDisease(heartDisease)
    }

    //Delete all HeartDiseases
    override suspend fun deleteHeartDiseases() {
       heartDiseaseDAO.deleteHeartDiseases()
    }

    //Delete a HeartDisease
	override suspend fun deleteHeartDisease(id: String) {
	   heartDiseaseDAO.deleteHeartDisease(id)
    }
    
     //Search with live data
     override fun searchByHeartDiseaseid (searchQuery: String): Flow<List<HeartDiseaseEntity>>  {
         return heartDiseaseDAO.searchByHeartDiseaseid(searchQuery)
     }
     
     //Search with live data
     override fun searchByHeartDiseaseage (searchQuery: Int): Flow<List<HeartDiseaseEntity>>  {
         return heartDiseaseDAO.searchByHeartDiseaseage(searchQuery)
     }
     
     //Search with live data
     override fun searchByHeartDiseasesex (searchQuery: Int): Flow<List<HeartDiseaseEntity>>  {
         return heartDiseaseDAO.searchByHeartDiseasesex(searchQuery)
     }
     
     //Search with live data
     override fun searchByHeartDiseasecp (searchQuery: Int): Flow<List<HeartDiseaseEntity>>  {
         return heartDiseaseDAO.searchByHeartDiseasecp(searchQuery)
     }
     
     //Search with live data
     override fun searchByHeartDiseasetrestbps (searchQuery: Int): Flow<List<HeartDiseaseEntity>>  {
         return heartDiseaseDAO.searchByHeartDiseasetrestbps(searchQuery)
     }
     
     //Search with live data
     override fun searchByHeartDiseasechol (searchQuery: Int): Flow<List<HeartDiseaseEntity>>  {
         return heartDiseaseDAO.searchByHeartDiseasechol(searchQuery)
     }
     
     //Search with live data
     override fun searchByHeartDiseasefbs (searchQuery: Int): Flow<List<HeartDiseaseEntity>>  {
         return heartDiseaseDAO.searchByHeartDiseasefbs(searchQuery)
     }
     
     //Search with live data
     override fun searchByHeartDiseaserestecg (searchQuery: Int): Flow<List<HeartDiseaseEntity>>  {
         return heartDiseaseDAO.searchByHeartDiseaserestecg(searchQuery)
     }
     
     //Search with live data
     override fun searchByHeartDiseasethalach (searchQuery: Int): Flow<List<HeartDiseaseEntity>>  {
         return heartDiseaseDAO.searchByHeartDiseasethalach(searchQuery)
     }
     
     //Search with live data
     override fun searchByHeartDiseaseexang (searchQuery: Int): Flow<List<HeartDiseaseEntity>>  {
         return heartDiseaseDAO.searchByHeartDiseaseexang(searchQuery)
     }
     
     //Search with live data
     override fun searchByHeartDiseaseoldpeak (searchQuery: Int): Flow<List<HeartDiseaseEntity>>  {
         return heartDiseaseDAO.searchByHeartDiseaseoldpeak(searchQuery)
     }
     
     //Search with live data
     override fun searchByHeartDiseaseslope (searchQuery: Int): Flow<List<HeartDiseaseEntity>>  {
         return heartDiseaseDAO.searchByHeartDiseaseslope(searchQuery)
     }
     
     //Search with live data
     override fun searchByHeartDiseaseca (searchQuery: Int): Flow<List<HeartDiseaseEntity>>  {
         return heartDiseaseDAO.searchByHeartDiseaseca(searchQuery)
     }
     
     //Search with live data
     override fun searchByHeartDiseasethal (searchQuery: Int): Flow<List<HeartDiseaseEntity>>  {
         return heartDiseaseDAO.searchByHeartDiseasethal(searchQuery)
     }
     
     //Search with live data
     override fun searchByHeartDiseaseoutcome (searchQuery: String): Flow<List<HeartDiseaseEntity>>  {
         return heartDiseaseDAO.searchByHeartDiseaseoutcome(searchQuery)
     }
     

    //Search with suspend
     override suspend fun searchByHeartDiseaseid2 (id: String): List<HeartDiseaseEntity> {
          return heartDiseaseDAO.searchByHeartDiseaseid2(id)
     }
	     
    //Search with suspend
     override suspend fun searchByHeartDiseaseage2 (age: Int): List<HeartDiseaseEntity> {
          return heartDiseaseDAO.searchByHeartDiseaseage2(age)
     }
	     
    //Search with suspend
     override suspend fun searchByHeartDiseasesex2 (sex: Int): List<HeartDiseaseEntity> {
          return heartDiseaseDAO.searchByHeartDiseasesex2(sex)
     }
	     
    //Search with suspend
     override suspend fun searchByHeartDiseasecp2 (cp: Int): List<HeartDiseaseEntity> {
          return heartDiseaseDAO.searchByHeartDiseasecp2(cp)
     }
	     
    //Search with suspend
     override suspend fun searchByHeartDiseasetrestbps2 (trestbps: Int): List<HeartDiseaseEntity> {
          return heartDiseaseDAO.searchByHeartDiseasetrestbps2(trestbps)
     }
	     
    //Search with suspend
     override suspend fun searchByHeartDiseasechol2 (chol: Int): List<HeartDiseaseEntity> {
          return heartDiseaseDAO.searchByHeartDiseasechol2(chol)
     }
	     
    //Search with suspend
     override suspend fun searchByHeartDiseasefbs2 (fbs: Int): List<HeartDiseaseEntity> {
          return heartDiseaseDAO.searchByHeartDiseasefbs2(fbs)
     }
	     
    //Search with suspend
     override suspend fun searchByHeartDiseaserestecg2 (restecg: Int): List<HeartDiseaseEntity> {
          return heartDiseaseDAO.searchByHeartDiseaserestecg2(restecg)
     }
	     
    //Search with suspend
     override suspend fun searchByHeartDiseasethalach2 (thalach: Int): List<HeartDiseaseEntity> {
          return heartDiseaseDAO.searchByHeartDiseasethalach2(thalach)
     }
	     
    //Search with suspend
     override suspend fun searchByHeartDiseaseexang2 (exang: Int): List<HeartDiseaseEntity> {
          return heartDiseaseDAO.searchByHeartDiseaseexang2(exang)
     }
	     
    //Search with suspend
     override suspend fun searchByHeartDiseaseoldpeak2 (oldpeak: Int): List<HeartDiseaseEntity> {
          return heartDiseaseDAO.searchByHeartDiseaseoldpeak2(oldpeak)
     }
	     
    //Search with suspend
     override suspend fun searchByHeartDiseaseslope2 (slope: Int): List<HeartDiseaseEntity> {
          return heartDiseaseDAO.searchByHeartDiseaseslope2(slope)
     }
	     
    //Search with suspend
     override suspend fun searchByHeartDiseaseca2 (ca: Int): List<HeartDiseaseEntity> {
          return heartDiseaseDAO.searchByHeartDiseaseca2(ca)
     }
	     
    //Search with suspend
     override suspend fun searchByHeartDiseasethal2 (thal: Int): List<HeartDiseaseEntity> {
          return heartDiseaseDAO.searchByHeartDiseasethal2(thal)
     }
	     
    //Search with suspend
     override suspend fun searchByHeartDiseaseoutcome2 (outcome: String): List<HeartDiseaseEntity> {
          return heartDiseaseDAO.searchByHeartDiseaseoutcome2(outcome)
     }
	     


}
