package com.example.viewmodelproject.view

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.runtime.setValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.lifecycle.viewmodel.viewModelFactory

@Composable
fun MainView(modifier: Modifier = Modifier . viewModel: MainViewModel) {

    val contador:Int by viewModel.contador.observeAsState(0)

    Column {
        Text(text = "============")
        Text(text = "============")
        Text(text = "============")
        Text(text = "============")
        TextField(value = "asdf", onValueChange = {})
        Button(onClick = {
            viewModel.incrementContador()

        }) {
            Text(text = contador.toString())
        }
    }
}

