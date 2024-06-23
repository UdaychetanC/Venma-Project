package com.example.venmamainproject.a_1st_Version.z_Navigation_1

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.venmamainproject.a_1st_Version.a_First_Screen_Package1.Version1MainScreenChat1


@Composable
fun FirstMainNavGraph1(navController: NavHostController ) {
    NavHost(navController = navController, route = Graph1.FIRST_SCREEN1, startDestination = "first_screen1")
    {
        composable("first_screen1") {
            Version1MainScreenChat1(navController)
        }

      /*  // Version Change -> 1 to 2
        composable("to_version_2"){
            MainFun2()
        }

        // Version Change -> 1 to 3
        composable("to_version_3"){
            MainFun3()
        }

        // Version Change -> 1 to 4
        composable("to_version_4"){
            MainFun4()
        }

        // Version Change -> 1 to 5
        composable("to_version_5"){
            // Coming Soon
        }*/

        chatNavGraph1(navController = navController)

    }
}
