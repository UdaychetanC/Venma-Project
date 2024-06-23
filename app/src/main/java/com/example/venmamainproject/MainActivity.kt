package com.example.venmamainproject

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.venmamainproject.ui.theme.VenmaMainProjectTheme
import com.example.venmamainproject.a_1st_Version.z_Navigation_1.FirstMainNavGraph1
import com.example.venmamainproject.a_1st_Version.z_Navigation_1.RootNavigationGraph1



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
             Surface(
                 color = MaterialTheme.colors.background)
             {
                 MainFun1()
             } } }
}

///// 1st Version ->
@Composable
fun MainFun1(){
    RootNavigationGraph1(navController = rememberNavController())
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen1(){
    val navController = rememberNavController()

    Scaffold() {
        FirstMainNavGraph1(navController = navController)
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    VenmaMainProjectTheme {
    }
}