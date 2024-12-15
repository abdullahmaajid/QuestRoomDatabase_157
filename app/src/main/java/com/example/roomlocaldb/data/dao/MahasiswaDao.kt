package com.example.roomlocaldb.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Update
import com.example.roomlocaldb.data.entity.Mahasiswa


@Dao
interface MahasiswaDao {


    @Update
    suspend fun updateMahasiswa (mahasiswa: Mahasiswa)

    @Insert
    suspend fun insertMahasiswa(mahasiswa: Mahasiswa)
}