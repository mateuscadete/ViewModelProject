package com.example.viewmodelproject.view

import androidx.lifecycle.MutableLiveData

class MainViewModel: MainView() {
    private val _contador = MutableLiveData<Int>(0)
    var contador = _contador

    fun incrementarContador(){
        _contador.value = _contador.value?.plus(1)

    }
}

