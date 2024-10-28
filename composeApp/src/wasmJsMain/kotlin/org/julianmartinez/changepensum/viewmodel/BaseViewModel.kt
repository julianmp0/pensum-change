package org.julianmartinez.changepensum.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

abstract class BaseViewModel : ViewModel() {


    protected val key: ViewModelKey = ViewModelKey(this::class.simpleName ?: "")

    protected fun <T> BaseViewModel.viewModelStateFlow(value: T): ViewModelStateFlow<T> {
        return ViewModelStateFlow(key = key, value = value)
    }
}

data class ViewModelKey(val key: String)