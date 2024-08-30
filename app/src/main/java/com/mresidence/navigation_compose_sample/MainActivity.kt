package com.mresidence.navigation_compose_sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.mresidence.navigation_compose_sample.navigation.NavGraph
import com.mresidence.navigation_compose_sample.ui.theme.NavigationcomposesampleTheme

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HomeScreenCompose()
        }
    }

    @Composable
    private fun HomeScreenCompose() {
        NavigationcomposesampleTheme {
            val navController = rememberNavController()
            NavGraph(navController)
        }
    }
}



