package com.example.venmamainproject.a_1st_Version.z_Navigation_1

import android.annotation.SuppressLint
import androidx.compose.runtime.compositionLocalOf
import androidx.navigation.NavHostController

sealed class AllScreens1(
    val route : String

) {
    object FirstScreenMain1 : AllScreens1(
        "first_screen1",
    )

    /// Setting Screen 1
    object Setting1 : AllScreens1(
        "setting1"
    )

    // AllSetting 1
    object AllSettings1 : AllScreens1(
        "all_settings1"
    )

    ///My Profile Screen 1
    object MyProfile1 : AllScreens1(
        "my_profile1"
    )

    /// My Contacts Profile 1
    object ContactsProfile1: AllScreens1(
        "contacts_profile1"
    )

    /// Version Change -> 1 to 2
    object ChangeVersion2: AllScreens1(
        "to_version_2"
    )

    /// Version Change -> 1 to 3
    object ChangeVersion3: AllScreens1(
        "to_version_3"
    )

    /// Version Change -> 1 to 4
    object ChangeVersion4: AllScreens1(
        "to_version_4"
    )

    /// Version Change -> 1 to 4 (Coming Soon)
    object ChangeVersion5: AllScreens1(
        "to_version_5"
    )

    // Chat Detail screen -- DUMMY
    object ChatDetailScreen1: AllScreens1(
        "chat_detail1"
    )
}

/*
// ChatScreen Home -- NOT USED
@SuppressLint("CompositionLocalNaming")
val Router = compositionLocalOf<NavHostController> { error("No active user found!") }

sealed class ChatScreen1 (val route: String) {
    object ChatDetail1 : ChatScreen1("chat/detail")
}
*/

