package com.example.roomlocaldb.ui.viewmodel

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.roomlocaldb.KrsApp
import com.example.roomlocaldb.ui.viewmodel.MahasiswaViewModel
import androidx.lifecycle.createSavedStateHandle


object PenyediaViewModel{
    val Factory = viewModelFactory {
        initializer {
            MahasiswaViewModel(
                krsApp().containerApp.RepositoryMhs
            )
        }


        initializer {
            HomeMhsViewModel(
                KrsApp().containerApp.repositoryMhs
            )
        }


        initializer{
            DetailMhsViewModel(
                createSavedStateHandle(),
                KrsApp().containerApp.repositoryMhs
            )
        }



        initializer{
            UpdateMhsViewModel(
                createSavedStateHandle(),
                KrsApp().containerApp.repositoryMhs
            )
        }
    }
}

fun CreationExtras.krsApp(): KrsApp =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as KrsApp)