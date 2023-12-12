package com.astra.myapplication.presentation.main

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.astra.myapplication.data.Result
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {

    var result by mutableStateOf<Result<String>>(Result.default())

    fun test() {
        result = Result.loading()
        viewModelScope.launch {
            delay(3000)
            result = Result.success("Berhasil")
        }
    }


}