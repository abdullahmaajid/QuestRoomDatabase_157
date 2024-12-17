package com.example.roomlocaldb.ui.viewmodel


import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.roomlocaldb.KrsApp


object PenyediaViewModel{
    val Factory = viewModelFactory {
        initializer {
            MahasiswaViewModel(
                krsApp().containerApp.RepositoryMhs
            )
        }
        initializer {
            HomeMhsViewModel(
                krsApp().containerApp.RepositoryMhs
            )
        }
        initializer {
            DetailMhsViewModel(
                createSavedStateHandle(),
                krsApp().containerApp.RepositoryMhs,
            )
        }
        initializer {
            UpdateMhsViewModel(
                createSavedStateHandle(),
                krsApp().containerApp.RepositoryMhs
            )
        }
    }
}

fun CreationExtras.krsApp(): KrsApp =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as KrsApp)