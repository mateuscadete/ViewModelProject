package com.example.viewmodelproject.view

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.runtime.setValue
import androidx.compose.runtime.livedata.observeAsState
import com.example.viewmodelproject.view.MainViewModel


@Composable
fun MainView(mainViewModel: MainViewModel) {

    val contador:Int by mainViewModel.contador.observeAsState(0)

    Column {
        TextField(value = contador.toString(), onValueChange = {})
        Button(onClick = {
            mainViewModel.incrementarContador()

        }) {
            Text(text = contador.toString())
        }
    }
}

