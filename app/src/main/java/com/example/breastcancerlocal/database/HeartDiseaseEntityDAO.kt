package com.example.breastcancerlocal.database

import androidx.room.*
import com.example.breastcancerlocal.model.HeartDiseaseEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface HeartDiseaseEntityDAO {
    //LiveData
    //Read (list entity)
    @Query("SELECT * FROM heartDisease_table")
    fun listHeartDiseases(): Flow<List<HeartDiseaseEntity>>

    //Read (list id)
	@Query("SELECT id FROM heartDisease_table")
	fun listHeartDiseaseids (): Flow<List<String>>
    //Read (list age)
	@Query("SELECT age FROM heartDisease_table")
	fun listHeartDiseaseages (): Flow<List<Int>>
    //Read (list sex)
	@Query("SELECT sex FROM heartDisease_table")
	fun listHeartDiseasesexs (): Flow<List<Int>>
    //Read (list cp)
	@Query("SELECT cp FROM heartDisease_table")
	fun listHeartDiseasecps (): Flow<List<Int>>
    //Read (list trestbps)
	@Query("SELECT trestbps FROM heartDisease_table")
	fun listHeartDiseasetrestbpss (): Flow<List<Int>>
    //Read (list chol)
	@Query("SELECT chol FROM heartDisease_table")
	fun listHeartDiseasechols (): Flow<List<Int>>
    //Read (list fbs)
	@Query("SELECT fbs FROM heartDisease_table")
	fun listHeartDiseasefbss (): Flow<List<Int>>
    //Read (list restecg)
	@Query("SELECT restecg FROM heartDisease_table")
	fun listHeartDiseaserestecgs (): Flow<List<Int>>
    //Read (list thalach)
	@Query("SELECT thalach FROM heartDisease_table")
	fun listHeartDiseasethalachs (): Flow<List<Int>>
    //Read (list exang)
	@Query("SELECT exang FROM heartDisease_table")
	fun listHeartDiseaseexangs (): Flow<List<Int>>
    //Read (list oldpeak)
	@Query("SELECT oldpeak FROM heartDisease_table")
	fun listHeartDiseaseoldpeaks (): Flow<List<Int>>
    //Read (list slope)
	@Query("SELECT slope FROM heartDisease_table")
	fun listHeartDiseaseslopes (): Flow<List<Int>>
    //Read (list ca)
	@Query("SELECT ca FROM heartDisease_table")
	fun listHeartDiseasecas (): Flow<List<Int>>
    //Read (list thal)
	@Query("SELECT thal FROM heartDisease_table")
	fun listHeartDiseasethals (): Flow<List<Int>>
    //Read (list outcome)
	@Query("SELECT outcome FROM heartDisease_table")
	fun listHeartDiseaseoutcomes (): Flow<List<String>>

	//Suspend
    //Create
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun createHeartDisease (heartDisease: HeartDiseaseEntity)

    //Read (list entity with suspend)
    @Query("SELECT * FROM heartDisease_table")
    suspend fun listHeartDisease(): List<HeartDiseaseEntity>

    //Update
    @Update
    suspend fun updateHeartDisease (heartDisease: HeartDiseaseEntity)

    //Delete all records
    @Query("DELETE FROM heartDisease_table")
    suspend fun deleteHeartDiseases ()

    //Delete a single record by PK
    @Query("DELETE FROM heartDisease_table WHERE id = :id")
    suspend fun deleteHeartDisease (id: String)
    
    //Search with live data
	@Query("SELECT * FROM  heartDisease_table WHERE id LIKE :searchQuery ")
	fun searchByHeartDiseaseid(searchQuery: String): Flow<List<HeartDiseaseEntity>>
	@Query("SELECT * FROM  heartDisease_table WHERE age LIKE :searchQuery ")
	fun searchByHeartDiseaseage(searchQuery: Int): Flow<List<HeartDiseaseEntity>>
	@Query("SELECT * FROM  heartDisease_table WHERE sex LIKE :searchQuery ")
	fun searchByHeartDiseasesex(searchQuery: Int): Flow<List<HeartDiseaseEntity>>
	@Query("SELECT * FROM  heartDisease_table WHERE cp LIKE :searchQuery ")
	fun searchByHeartDiseasecp(searchQuery: Int): Flow<List<HeartDiseaseEntity>>
	@Query("SELECT * FROM  heartDisease_table WHERE trestbps LIKE :searchQuery ")
	fun searchByHeartDiseasetrestbps(searchQuery: Int): Flow<List<HeartDiseaseEntity>>
	@Query("SELECT * FROM  heartDisease_table WHERE chol LIKE :searchQuery ")
	fun searchByHeartDiseasechol(searchQuery: Int): Flow<List<HeartDiseaseEntity>>
	@Query("SELECT * FROM  heartDisease_table WHERE fbs LIKE :searchQuery ")
	fun searchByHeartDiseasefbs(searchQuery: Int): Flow<List<HeartDiseaseEntity>>
	@Query("SELECT * FROM  heartDisease_table WHERE restecg LIKE :searchQuery ")
	fun searchByHeartDiseaserestecg(searchQuery: Int): Flow<List<HeartDiseaseEntity>>
	@Query("SELECT * FROM  heartDisease_table WHERE thalach LIKE :searchQuery ")
	fun searchByHeartDiseasethalach(searchQuery: Int): Flow<List<HeartDiseaseEntity>>
	@Query("SELECT * FROM  heartDisease_table WHERE exang LIKE :searchQuery ")
	fun searchByHeartDiseaseexang(searchQuery: Int): Flow<List<HeartDiseaseEntity>>
	@Query("SELECT * FROM  heartDisease_table WHERE oldpeak LIKE :searchQuery ")
	fun searchByHeartDiseaseoldpeak(searchQuery: Int): Flow<List<HeartDiseaseEntity>>
	@Query("SELECT * FROM  heartDisease_table WHERE slope LIKE :searchQuery ")
	fun searchByHeartDiseaseslope(searchQuery: Int): Flow<List<HeartDiseaseEntity>>
	@Query("SELECT * FROM  heartDisease_table WHERE ca LIKE :searchQuery ")
	fun searchByHeartDiseaseca(searchQuery: Int): Flow<List<HeartDiseaseEntity>>
	@Query("SELECT * FROM  heartDisease_table WHERE thal LIKE :searchQuery ")
	fun searchByHeartDiseasethal(searchQuery: Int): Flow<List<HeartDiseaseEntity>>
	@Query("SELECT * FROM  heartDisease_table WHERE outcome LIKE :searchQuery ")
	fun searchByHeartDiseaseoutcome(searchQuery: String): Flow<List<HeartDiseaseEntity>>

    //Search with suspend
    @Query("SELECT * FROM  heartDisease_table WHERE id LIKE :searchQuery")
	suspend fun searchByHeartDiseaseid2(searchQuery: String): List<HeartDiseaseEntity>
    @Query("SELECT * FROM  heartDisease_table WHERE age LIKE :searchQuery")
	suspend fun searchByHeartDiseaseage2(searchQuery: Int): List<HeartDiseaseEntity>
    @Query("SELECT * FROM  heartDisease_table WHERE sex LIKE :searchQuery")
	suspend fun searchByHeartDiseasesex2(searchQuery: Int): List<HeartDiseaseEntity>
    @Query("SELECT * FROM  heartDisease_table WHERE cp LIKE :searchQuery")
	suspend fun searchByHeartDiseasecp2(searchQuery: Int): List<HeartDiseaseEntity>
    @Query("SELECT * FROM  heartDisease_table WHERE trestbps LIKE :searchQuery")
	suspend fun searchByHeartDiseasetrestbps2(searchQuery: Int): List<HeartDiseaseEntity>
    @Query("SELECT * FROM  heartDisease_table WHERE chol LIKE :searchQuery")
	suspend fun searchByHeartDiseasechol2(searchQuery: Int): List<HeartDiseaseEntity>
    @Query("SELECT * FROM  heartDisease_table WHERE fbs LIKE :searchQuery")
	suspend fun searchByHeartDiseasefbs2(searchQuery: Int): List<HeartDiseaseEntity>
    @Query("SELECT * FROM  heartDisease_table WHERE restecg LIKE :searchQuery")
	suspend fun searchByHeartDiseaserestecg2(searchQuery: Int): List<HeartDiseaseEntity>
    @Query("SELECT * FROM  heartDisease_table WHERE thalach LIKE :searchQuery")
	suspend fun searchByHeartDiseasethalach2(searchQuery: Int): List<HeartDiseaseEntity>
    @Query("SELECT * FROM  heartDisease_table WHERE exang LIKE :searchQuery")
	suspend fun searchByHeartDiseaseexang2(searchQuery: Int): List<HeartDiseaseEntity>
    @Query("SELECT * FROM  heartDisease_table WHERE oldpeak LIKE :searchQuery")
	suspend fun searchByHeartDiseaseoldpeak2(searchQuery: Int): List<HeartDiseaseEntity>
    @Query("SELECT * FROM  heartDisease_table WHERE slope LIKE :searchQuery")
	suspend fun searchByHeartDiseaseslope2(searchQuery: Int): List<HeartDiseaseEntity>
    @Query("SELECT * FROM  heartDisease_table WHERE ca LIKE :searchQuery")
	suspend fun searchByHeartDiseaseca2(searchQuery: Int): List<HeartDiseaseEntity>
    @Query("SELECT * FROM  heartDisease_table WHERE thal LIKE :searchQuery")
	suspend fun searchByHeartDiseasethal2(searchQuery: Int): List<HeartDiseaseEntity>
    @Query("SELECT * FROM  heartDisease_table WHERE outcome LIKE :searchQuery")
	suspend fun searchByHeartDiseaseoutcome2(searchQuery: String): List<HeartDiseaseEntity>

}
