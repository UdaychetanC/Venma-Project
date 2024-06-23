package com.example.venmamainproject.a_1st_Version.z_Navigation_1

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.venmamainproject.MainScreen1


object Graph1 {
    const val ROOT1 = "root_graph"
    const val FIRST_SCREEN1 = "bottom_graph"
    const val CHAT_SCREEN_CONTACTS1 = "chat_graph"
}


// Main Nav graph
@Composable
fun RootNavigationGraph1(navController: NavHostController) {
    NavHost(
        navController = navController,
        route = Graph1.ROOT1,
        startDestination = Graph1.FIRST_SCREEN1
    ) {
        composable(route = Graph1.FIRST_SCREEN1) {
            MainScreen1()
        }
    }
}