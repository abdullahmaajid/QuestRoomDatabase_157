package com.example.roomlocaldb.repository

import com.example.roomlocaldb.data.entity.Mahasiswa
import java.util.concurrent.Flow

//Jika di Dao ada insert di repository juga harus ada insert
interface RepositoryMhs {
    suspend fun insertMhs(mahasiswa: Mahasiswa)


    fun getAllMhs() : Flow<List<Mahasiswa>>
    fun getMhs(nim: String) : Flow<Mahasiswa>
    suspend fun deleteMhs(mahasiswa: Mahasiswa)
    suspend fun updateMhs(mahasiswa: Mahasiswa)
}