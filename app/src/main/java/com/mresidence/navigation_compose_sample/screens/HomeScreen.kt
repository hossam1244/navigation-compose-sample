package com.mresidence.navigation_compose_sample.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp


@Composable
fun HomeScreen(
    navigateToDetailsScreen: () -> Unit
) {
    // create a text composable to display the details screen

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val text = remember { mutableStateOf(TextFieldValue()) }
        TextField(
            value = text.value,
            onValueChange = { text.value = it },
            label = { Text("Enter your name") }
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            // navigate to the details screen
            navigateToDetailsScreen()


        }
        ) {
            Text("Navigate to Details")
        }

    }
}