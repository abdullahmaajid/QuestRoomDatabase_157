package com.example.roomlocaldb.data.database

import android.content.Context
import android.provider.CalendarContract.Instances
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.roomlocaldb.data.dao.MahasiswaDao
import com.example.roomlocaldb.data.entity.Mahasiswa
import java.time.Instant


// Mendefinisikan database dengan tabel Mahasiswa
@Database(entities = [Mahasiswa::class], version = 1, exportSchema = false)
abstract class KrsDatabase : RoomDatabase() {

    // Mendefinisikan fungsi untuk mengakses data Mahasiswa
    abstract fun mahasiswaDao(): MahasiswaDao

    companion object{
        @Volatile // Memastikan bahwa nilai variabel instance seslalu sama
        private var Instance : KrsDatabase? = null

        fun getDatabase(context: Context): KrsDatabase{
            return (Instance ?: synchronized(this){
                Room.databaseBuilder(
                    context.applicationContext,
                    KrsDatabase::class.java, // Class Database
                    "KrsDatabase" // Nama database
                )
                    .build().also { Instance = it }
            })
        }
    }
}