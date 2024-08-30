package com.mresidence.navigation_compose_sample

sealed  class NavigationScreens(val route: String) {
    object MainScreen: NavigationScreens("main_screen")
    object DetailScreen: NavigationScreens("detail_screen")
}