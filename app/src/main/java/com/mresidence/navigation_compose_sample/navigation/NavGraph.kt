package com.mresidence.navigation_compose_sample.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavArgument
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.mresidence.navigation_compose_sample.screens.DetailsScreen
import com.mresidence.navigation_compose_sample.screens.HomeScreen


@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = NavRoute.Home.path
    ) {
        addHomeScreen(navController, this)
        addDetailsScreen(navController, this)
    }
}

private fun addHomeScreen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(route = NavRoute.Home.path) {
        HomeScreen(navigateToDetailsScreen = { text ->
            navController.navigate(NavRoute.DetailsScreen.withArgs(text), )
        })
    }
}

private fun addDetailsScreen(
    navController: NavHostController,
    navGraphBuilder: NavGraphBuilder
) {
    navGraphBuilder.composable(route = NavRoute.DetailsScreen.withArgsFormat(NavRoute.DetailsScreen.text),
        arguments = listOf(
            navArgument(NavRoute.DetailsScreen.text) {
                type = NavType.StringType
                nullable = true
            }
        )) {
        DetailsScreen()
    }
}
