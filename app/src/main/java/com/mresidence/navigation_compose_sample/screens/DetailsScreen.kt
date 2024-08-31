package com.mresidence.navigation_compose_sample.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun DetailsScreen(text: String? = null) {
    Column {
        Text(text = text ?: "Details Screen")
    }
}