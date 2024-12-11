package com.example.roomlocaldb.repository

import com.example.roomlocaldb.data.entity.Mahasiswa

//Jika di Dao ada insert di repository juga harus ada insert
interface RepositoryMhs {
    suspend fun insertMhs(mahasiswa: Mahasiswa)
}