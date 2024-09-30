package com.example.viewmodelproject.view

import com.example.viewmodelproject.view.MainView
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    private val _contador = MutableLiveData<Int>(0)
    var contador = _contador

    fun incrementarContador(){
        _contador.value = _contador.value?.plus(1)

    }
}

