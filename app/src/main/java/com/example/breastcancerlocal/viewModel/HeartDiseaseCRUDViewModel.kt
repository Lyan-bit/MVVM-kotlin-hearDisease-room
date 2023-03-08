package com.example.breastcancerlocal.viewModel

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.breastcancerlocal.model.HeartDiseaseEntity
import com.example.breastcancerlocal.database.Repository
import com.example.breastcancerlocal.model.HeartDisease
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import java.util.ArrayList

class HeartDiseaseCRUDViewModel constructor(context: Context): ViewModel() {

    companion object {
        private val repository by lazy { Repository()}
            private var instance: HeartDiseaseCRUDViewModel? = null
        fun getInstance(context: Context): HeartDiseaseCRUDViewModel {
            return instance ?: HeartDiseaseCRUDViewModel(context)
        }
    }

    val allHeartDiseases: LiveData<List<HeartDiseaseEntity>> = repository.allHeartDiseases.asLiveData()

    val allHeartDiseaseIds: LiveData<List<String>> = repository.allHeartDiseaseids.asLiveData()
    val allHeartDiseaseAges: LiveData<List<Int>> = repository.allHeartDiseaseages.asLiveData()
    val allHeartDiseaseSexs: LiveData<List<Int>> = repository.allHeartDiseasesexs.asLiveData()
    val allHeartDiseaseCps: LiveData<List<Int>> = repository.allHeartDiseasecps.asLiveData()
    val allHeartDiseaseTrestbpss: LiveData<List<Int>> = repository.allHeartDiseasetrestbpss.asLiveData()
    val allHeartDiseaseChols: LiveData<List<Int>> = repository.allHeartDiseasechols.asLiveData()
    val allHeartDiseaseFbss: LiveData<List<Int>> = repository.allHeartDiseasefbss.asLiveData()
    val allHeartDiseaseRestecgs: LiveData<List<Int>> = repository.allHeartDiseaserestecgs.asLiveData()
    val allHeartDiseaseThalachs: LiveData<List<Int>> = repository.allHeartDiseasethalachs.asLiveData()
    val allHeartDiseaseExangs: LiveData<List<Int>> = repository.allHeartDiseaseexangs.asLiveData()
    val allHeartDiseaseOldpeaks: LiveData<List<Int>> = repository.allHeartDiseaseoldpeaks.asLiveData()
    val allHeartDiseaseSlopes: LiveData<List<Int>> = repository.allHeartDiseaseslopes.asLiveData()
    val allHeartDiseaseCas: LiveData<List<Int>> = repository.allHeartDiseasecas.asLiveData()
    val allHeartDiseaseThals: LiveData<List<Int>> = repository.allHeartDiseasethals.asLiveData()
    val allHeartDiseaseOutcomes: LiveData<List<String>> = repository.allHeartDiseaseoutcomes.asLiveData()
    private var currentHeartDisease: HeartDiseaseEntity? = null
    private var currentHeartDiseases: List<HeartDiseaseEntity> = ArrayList()

    fun searchByHeartDiseaseid(searchQuery: String): LiveData<List<HeartDiseaseEntity>>  {
        return repository.searchByHeartDiseaseid(searchQuery).asLiveData()
    }

    fun searchByHeartDiseaseage(searchQuery: Int): LiveData<List<HeartDiseaseEntity>>  {
        return repository.searchByHeartDiseaseage(searchQuery).asLiveData()
    }

    fun searchByHeartDiseasesex(searchQuery: Int): LiveData<List<HeartDiseaseEntity>>  {
        return repository.searchByHeartDiseasesex(searchQuery).asLiveData()
    }

    fun searchByHeartDiseasecp(searchQuery: Int): LiveData<List<HeartDiseaseEntity>>  {
        return repository.searchByHeartDiseasecp(searchQuery).asLiveData()
    }

    fun searchByHeartDiseasetrestbps(searchQuery: Int): LiveData<List<HeartDiseaseEntity>>  {
        return repository.searchByHeartDiseasetrestbps(searchQuery).asLiveData()
    }

    fun searchByHeartDiseasechol(searchQuery: Int): LiveData<List<HeartDiseaseEntity>>  {
        return repository.searchByHeartDiseasechol(searchQuery).asLiveData()
    }

    fun searchByHeartDiseasefbs(searchQuery: Int): LiveData<List<HeartDiseaseEntity>>  {
        return repository.searchByHeartDiseasefbs(searchQuery).asLiveData()
    }

    fun searchByHeartDiseaserestecg(searchQuery: Int): LiveData<List<HeartDiseaseEntity>>  {
        return repository.searchByHeartDiseaserestecg(searchQuery).asLiveData()
    }

    fun searchByHeartDiseasethalach(searchQuery: Int): LiveData<List<HeartDiseaseEntity>>  {
        return repository.searchByHeartDiseasethalach(searchQuery).asLiveData()
    }

    fun searchByHeartDiseaseexang(searchQuery: Int): LiveData<List<HeartDiseaseEntity>>  {
        return repository.searchByHeartDiseaseexang(searchQuery).asLiveData()
    }

    fun searchByHeartDiseaseoldpeak(searchQuery: Int): LiveData<List<HeartDiseaseEntity>>  {
        return repository.searchByHeartDiseaseoldpeak(searchQuery).asLiveData()
    }

    fun searchByHeartDiseaseslope(searchQuery: Int): LiveData<List<HeartDiseaseEntity>>  {
        return repository.searchByHeartDiseaseslope(searchQuery).asLiveData()
    }

    fun searchByHeartDiseaseca(searchQuery: Int): LiveData<List<HeartDiseaseEntity>>  {
        return repository.searchByHeartDiseaseca(searchQuery).asLiveData()
    }

    fun searchByHeartDiseasethal(searchQuery: Int): LiveData<List<HeartDiseaseEntity>>  {
        return repository.searchByHeartDiseasethal(searchQuery).asLiveData()
    }

    fun searchByHeartDiseaseoutcome(searchQuery: String): LiveData<List<HeartDiseaseEntity>>  {
        return repository.searchByHeartDiseaseoutcome(searchQuery).asLiveData()
    }


    fun getHeartDiseaseByPK(_val: String): Flow<HeartDisease> {
        val res: Flow<List<HeartDiseaseEntity>> = repository.searchByHeartDiseaseid(_val)
        return res.map { heartDisease ->
            val itemx = HeartDisease.createByPKHeartDisease(_val)
            if (heartDisease.isNotEmpty()) {
                itemx.id = heartDisease[0].id
                itemx.age = heartDisease[0].age
                itemx.sex = heartDisease[0].sex
                itemx.cp = heartDisease[0].cp
                itemx.trestbps = heartDisease[0].trestbps
                itemx.chol = heartDisease[0].chol
                itemx.fbs = heartDisease[0].fbs
                itemx.restecg = heartDisease[0].restecg
                itemx.thalach = heartDisease[0].thalach
                itemx.exang = heartDisease[0].exang
                itemx.oldpeak = heartDisease[0].oldpeak
                itemx.slope = heartDisease[0].slope
                itemx.ca = heartDisease[0].ca
                itemx.thal = heartDisease[0].thal
                itemx.outcome = heartDisease[0].outcome
            }
            itemx
        }
    }

    suspend fun createHeartDisease(_x: HeartDiseaseEntity) {
        repository.createHeartDisease(_x)
        currentHeartDisease = _x
    }

    suspend fun editHeartDisease(x: HeartDiseaseEntity) {
        repository.updateHeartDisease(x)
        currentHeartDisease = x
    }

    fun setSelectedHeartDisease(x: HeartDiseaseEntity) {
        currentHeartDisease = x
    }

    suspend fun deleteHeartDisease(_id: String) {
        repository.deleteHeartDisease(_id)
        currentHeartDisease = null
    }

    suspend fun searchHeartDiseaseByAge(age: Int) : ArrayList<HeartDisease> {
        currentHeartDiseases = repository.searchByHeartDiseaseage2(age)
        var itemsList = ArrayList<HeartDisease>()
        for (x in currentHeartDiseases.indices) {
            val vo: HeartDiseaseEntity = currentHeartDiseases[x]
            val itemx = HeartDisease.createByPKHeartDisease(vo.id)
            itemx.id = vo.id
            itemx.age = vo.age
            itemx.sex = vo.sex
            itemx.cp = vo.cp
            itemx.trestbps = vo.trestbps
            itemx.chol = vo.chol
            itemx.fbs = vo.fbs
            itemx.restecg = vo.restecg
            itemx.thalach = vo.thalach
            itemx.exang = vo.exang
            itemx.oldpeak = vo.oldpeak
            itemx.slope = vo.slope
            itemx.ca = vo.ca
            itemx.thal = vo.thal
            itemx.outcome = vo.outcome
            itemsList.add(itemx)
        }
        return itemsList
    }

    suspend fun listHeartDisease(): List<HeartDiseaseEntity> {
        currentHeartDiseases = repository.listHeartDisease()
        return currentHeartDiseases
    }

    suspend fun listAllHeartDisease(): ArrayList<HeartDisease> {
        currentHeartDiseases = repository.listHeartDisease()
        var res = ArrayList<HeartDisease>()
        for (x in currentHeartDiseases.indices) {
            val vo: HeartDiseaseEntity = currentHeartDiseases[x]
            val itemx = HeartDisease.createByPKHeartDisease(vo.id)
            itemx.id = vo.id
            itemx.age = vo.age
            itemx.sex = vo.sex
            itemx.cp = vo.cp
            itemx.trestbps = vo.trestbps
            itemx.chol = vo.chol
            itemx.fbs = vo.fbs
            itemx.restecg = vo.restecg
            itemx.thalach = vo.thalach
            itemx.exang = vo.exang
            itemx.oldpeak = vo.oldpeak
            itemx.slope = vo.slope
            itemx.ca = vo.ca
            itemx.thal = vo.thal
            itemx.outcome = vo.outcome
            res.add(itemx)
        }
        return res
    }

    suspend fun stringListHeartDisease(): List<String> {
        currentHeartDiseases = repository.listHeartDisease()
        val res: ArrayList<String> = ArrayList()
        for (x in currentHeartDiseases.indices) {
            res.add(currentHeartDiseases[x].toString())
        }
        return res
    }

    suspend fun getHeartDiseaseByPK2(_val: String): HeartDisease? {
        val res: List<HeartDiseaseEntity> = repository.searchByHeartDiseaseid2(_val)
        return if (res.isEmpty()) {
            null
        } else {
            val vo: HeartDiseaseEntity = res[0]
            val itemx = HeartDisease.createByPKHeartDisease(_val)
            itemx.id = vo.id
            itemx.age = vo.age
            itemx.sex = vo.sex
            itemx.cp = vo.cp
            itemx.trestbps = vo.trestbps
            itemx.chol = vo.chol
            itemx.fbs = vo.fbs
            itemx.restecg = vo.restecg
            itemx.thalach = vo.thalach
            itemx.exang = vo.exang
            itemx.oldpeak = vo.oldpeak
            itemx.slope = vo.slope
            itemx.ca = vo.ca
            itemx.thal = vo.thal
            itemx.outcome = vo.outcome
            itemx
        }
    }

    suspend fun retrieveHeartDisease(_val: String): HeartDisease? {
        return getHeartDiseaseByPK2(_val)
    }

    suspend fun allHeartDiseaseIds(): ArrayList<String> {
        currentHeartDiseases = repository.listHeartDisease()
        val res: ArrayList<String> = ArrayList()
        for (heartdisease in currentHeartDiseases.indices) {
            res.add(currentHeartDiseases[heartdisease].id)
        }
        return res
    }

    fun setSelectedHeartDisease(i: Int) {
        if (i < currentHeartDiseases.size) {
            currentHeartDisease = currentHeartDiseases[i]
        }
    }

    fun getSelectedHeartDisease(): HeartDiseaseEntity? {
        return currentHeartDisease
    }

    suspend fun persistHeartDisease(_x: HeartDisease) {
        val vo = HeartDiseaseEntity(_x.id, _x.age, _x.sex, _x.cp, _x.trestbps, _x.chol, _x.fbs, _x.restecg, _x.thalach, _x.exang, _x.oldpeak, _x.slope, _x.ca, _x.thal, _x.outcome)
        repository.updateHeartDisease(vo)
        currentHeartDisease = vo
    }

    suspend fun searchByHeartDiseaseid2(idx: String): List<HeartDiseaseEntity> {
        currentHeartDiseases = repository.searchByHeartDiseaseid2(idx)
        return currentHeartDiseases
    }
    suspend fun searchByHeartDiseaseage2(agex: Int): List<HeartDiseaseEntity> {
        currentHeartDiseases = repository.searchByHeartDiseaseage2(agex)
        return currentHeartDiseases
    }
    suspend fun searchByHeartDiseasesex2(sexx: Int): List<HeartDiseaseEntity> {
        currentHeartDiseases = repository.searchByHeartDiseasesex2(sexx)
        return currentHeartDiseases
    }
    suspend fun searchByHeartDiseasecp2(cpx: Int): List<HeartDiseaseEntity> {
        currentHeartDiseases = repository.searchByHeartDiseasecp2(cpx)
        return currentHeartDiseases
    }
    suspend fun searchByHeartDiseasetrestbps2(trestbpsx: Int): List<HeartDiseaseEntity> {
        currentHeartDiseases = repository.searchByHeartDiseasetrestbps2(trestbpsx)
        return currentHeartDiseases
    }
    suspend fun searchByHeartDiseasechol2(cholx: Int): List<HeartDiseaseEntity> {
        currentHeartDiseases = repository.searchByHeartDiseasechol2(cholx)
        return currentHeartDiseases
    }
    suspend fun searchByHeartDiseasefbs2(fbsx: Int): List<HeartDiseaseEntity> {
        currentHeartDiseases = repository.searchByHeartDiseasefbs2(fbsx)
        return currentHeartDiseases
    }
    suspend fun searchByHeartDiseaserestecg2(restecgx: Int): List<HeartDiseaseEntity> {
        currentHeartDiseases = repository.searchByHeartDiseaserestecg2(restecgx)
        return currentHeartDiseases
    }
    suspend fun searchByHeartDiseasethalach2(thalachx: Int): List<HeartDiseaseEntity> {
        currentHeartDiseases = repository.searchByHeartDiseasethalach2(thalachx)
        return currentHeartDiseases
    }
    suspend fun searchByHeartDiseaseexang2(exangx: Int): List<HeartDiseaseEntity> {
        currentHeartDiseases = repository.searchByHeartDiseaseexang2(exangx)
        return currentHeartDiseases
    }
    suspend fun searchByHeartDiseaseoldpeak2(oldpeakx: Int): List<HeartDiseaseEntity> {
        currentHeartDiseases = repository.searchByHeartDiseaseoldpeak2(oldpeakx)
        return currentHeartDiseases
    }
    suspend fun searchByHeartDiseaseslope2(slopex: Int): List<HeartDiseaseEntity> {
        currentHeartDiseases = repository.searchByHeartDiseaseslope2(slopex)
        return currentHeartDiseases
    }
    suspend fun searchByHeartDiseaseca2(cax: Int): List<HeartDiseaseEntity> {
        currentHeartDiseases = repository.searchByHeartDiseaseca2(cax)
        return currentHeartDiseases
    }
    suspend fun searchByHeartDiseasethal2(thalx: Int): List<HeartDiseaseEntity> {
        currentHeartDiseases = repository.searchByHeartDiseasethal2(thalx)
        return currentHeartDiseases
    }
    suspend fun searchByHeartDiseaseoutcome2(outcomex: String): List<HeartDiseaseEntity> {
        currentHeartDiseases = repository.searchByHeartDiseaseoutcome2(outcomex)
        return currentHeartDiseases
    }


}
