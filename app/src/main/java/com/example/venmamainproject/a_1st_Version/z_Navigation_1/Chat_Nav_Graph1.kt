package com.example.venmamainproject.a_1st_Version.z_Navigation_1

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.venmamainproject.a_1st_Version.a_First_Screen_Package1.DetailView1
import com.example.venmamainproject.a_1st_Version.c_All_Other_Screens1.*


fun NavGraphBuilder.chatNavGraph1(navController: NavHostController) {
    navigation(
        route = Graph1.CHAT_SCREEN_CONTACTS1,
        startDestination = AllScreens1.FirstScreenMain1.route
    ) {
       /* composable(ChatScreen1.ChatDetail1.route + "/{id}") {
            val id = it.arguments?.getInt("id")
            DetailView1(chatId1 = id ?: 0, navController)
        }*/

        composable(route = "chat_detail1"){
            DetailView1(navController)
        }


        composable(route = "setting1"){
            SettingScreen1(navController)
        }

        composable(route = "all_settings1"){
            AllSettingHere_1(navController)
        }

        composable("my_profile1"){
            MyProfileScreen1(navController)
        }

        composable("contacts_profile1"){
            ContactsProfile1(navController)
        }

        /*composable("test_screen1"){
            TestScreen1()
        }*/

    }
}