package com.mresidence.navigation_compose_sample

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = NavigationScreens.MainScreen.route) {
        composable(route = NavigationScreens.MainScreen.route) {
            MainActivity()
        }
        composable(route = NavigationScreens.DetailScreen.route) {
            DetailsActivity()
        }
    }
}