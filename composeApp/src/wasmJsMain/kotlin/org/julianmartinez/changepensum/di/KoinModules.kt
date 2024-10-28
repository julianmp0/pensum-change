package org.julianmartinez.changepensum.di

import org.julianmartinez.changepensum.viewmodel.MainViewModel
import org.koin.compose.viewmodel.dsl.viewModel
import org.koin.compose.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val provideViewModelModule = module {
    viewModelOf(::MainViewModel)
}

fun appModule() = listOf(
    provideViewModelModule
)