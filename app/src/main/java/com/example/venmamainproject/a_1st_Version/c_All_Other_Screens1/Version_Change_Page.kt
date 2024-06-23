package com.example.venmamainproject.a_1st_Version.c_All_Other_Screens1

import android.annotation.SuppressLint
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.*
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.venmamainproject.a_1st_Version.z_Navigation_1.AllScreens1
import com.example.venmamainproject.ui.theme.*

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun SettingScreen1(navController: NavHostController){
    Scaffold(
        topBar = { CustomTopBar1() },
        content = {
            AllHere(navController)
        }
    )
}

@OptIn(ExperimentalTextApi::class)
@Composable
fun CustomTopBar1(){
    Row(modifier = Modifier
        .padding(start = 11.dp, top = 10.dp, bottom = 5.dp, end = 10.dp)
        .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row {
            Icon(
                modifier = Modifier
                    .size(26.dp),
                imageVector = Icons.Filled.ArrowBack,
                tint = Version_1_Dark,
                contentDescription = "Go back" )
            Spacer(modifier = Modifier.width(14.dp))

            Text(
                text = "Version Change",
                style = TextStyle(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Version_1_mix1, Version_1_mix2
                        ))),
                fontSize = 20.sp, fontWeight = FontWeight.Bold)
        }

        Row(verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center)
        {
            Icon(imageVector = Icons.Default.Settings,
                contentDescription = null,
                tint = Version_1_Dark,
                modifier = Modifier
                    .padding(top = 3.dp, end = 10.dp)
                    .size(26.dp)
                    .clickable {
/*
                        navController.navigate(AllScreens1.AllSettings1.route)
*/
                    }
            )

        }
    /*    {
            var switchOn by remember {
                mutableStateOf(false)
            }

            val icons = if (switchOn) Icons.Filled.Check else Icons.Filled.Close

            Text(text = if (switchOn) "Busy Mode: On" else "",
                fontSize = 12.sp,
                color = GrayVenma4
            )
            Switch(
                checked = switchOn,
                onCheckedChange = {switchOn_ ->
                    switchOn = switchOn_ },
               colors = SwitchDefaults.colors(
                   checkedThumbColor = Color.Red,
                   uncheckedThumbColor = Color.Gray,
                   uncheckedTrackColor = GrayVenma4
               )
            )
        }*/
    }
}

@Composable
fun AllHere(navController: NavHostController) {
    Box(modifier = Modifier
        .fillMaxSize())
    {
        Column {
            Divider1_VersionChange_1("VERSION CHANGE")    // Also Used For All Setting Screen 1
            VersionSelect1(navController)
            VersionSelect2(navController)
            VersionSelect3(navController)
            VersionSelect4(navController)
            VersionSelect5()
        }
    }
}

@OptIn(ExperimentalTextApi::class)
@Composable
fun Divider1_VersionChange_1(name: String){     // Also Used For All Setting Screen 1
    Surface(modifier = Modifier
        .fillMaxWidth()
        .padding(top = 10.dp)
        .height(37.dp),
        color =  GrayVenma3
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                modifier = Modifier
                    .padding(start = 20.dp)
                    .align(Alignment.CenterVertically),
                text = "$name",
                fontSize = 13.sp,
                fontWeight = FontWeight.SemiBold,
                style = TextStyle(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Version_1_mix1, Version_1_mix2
                        )
                    )
                ),
                textAlign = TextAlign.Start
            ) } } }

@Composable
fun VersionSelect1(navController: NavHostController){
    Row(
        Modifier
            .padding(start = 20.dp, end = 20.dp, top = 20.dp, bottom = 15.dp)
            .clickable {

            }) {
        Column {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "Version 1", fontSize = 40.sp,  style = MaterialTheme.typography.h2)

                Icon(imageVector = Icons.Default.CheckBox, tint = Version_1_Dark, contentDescription = null )
            }
            Text(
                text = "One",
                fontSize = 15.sp,
                style = MaterialTheme.typography.body1,

                )
            Spacer(modifier = Modifier.height(20.dp))
            Divider(
                Modifier.fillMaxWidth(),
                color = Version_1_Dark
            )
        }
    }
}

@Composable
fun VersionSelect2(navController: NavHostController){
    Row(
        Modifier
            .padding(start = 20.dp, end = 20.dp, top = 15.dp, bottom = 15.dp)
            .clickable {

            }) {

        Column {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "Version 2", fontSize = 40.sp, style = MaterialTheme.typography.h2)
            }
            Text(text = buildAnnotatedString {
                withStyle(style = SpanStyle(color = Color.Black))
                {
                    append("Secret Nation")
                }
                withStyle(style = SpanStyle(color = GrayVenma2))
                {
                    append(" (coming soon)")
                } },
                fontSize = 15.sp,
                style = MaterialTheme.typography.body1,
            )
            Spacer(modifier = Modifier.height(20.dp))
            Divider(
                Modifier.fillMaxWidth(),
                color = Version_1_Dark
            )
        }
    }

}

@Composable
fun VersionSelect3(navController: NavHostController){
    Row(
        Modifier
            .padding(start = 20.dp, end = 20.dp, top = 15.dp, bottom = 15.dp)
            .clickable {

            }) {
        Column {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "Version 3", fontSize = 40.sp, style = MaterialTheme.typography.h2)
            }
            Text(text = buildAnnotatedString {
                withStyle(style = SpanStyle(color = Color.Black))
                {
                    append("My Fans")
                }
                withStyle(style = SpanStyle(color = GrayVenma2))
                {
                    append(" (coming soon)")
                } },
                fontSize = 15.sp,
                style = MaterialTheme.typography.body1,
            )
            Spacer(modifier = Modifier.height(20.dp))
            Divider(
                Modifier.fillMaxWidth(),
                color = Version_1_Dark
            )
        }
    }
}

@Composable
fun VersionSelect4(navController: NavHostController){
    Row(
        Modifier
            .padding(start = 20.dp, end = 20.dp, top = 15.dp, bottom = 15.dp)
            .clickable {

            }) {
        Column {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "Version 4", fontSize = 40.sp, style = MaterialTheme.typography.h2)
            }
            Text(text = buildAnnotatedString {
                withStyle(style = SpanStyle(color = Color.Black))
                {
                    append("Exclusive")
                }
                withStyle(style = SpanStyle(color = GrayVenma2))
                {
                    append(" (coming soon)")
                } },
                fontSize = 15.sp,
                style = MaterialTheme.typography.body1,
                )

            Spacer(modifier = Modifier.height(20.dp))
            Divider(
                Modifier.fillMaxWidth(),
                color = Version_1_Dark
            )
        }
    }
}

@Composable
fun VersionSelect5(){
    Row(
        Modifier
            .padding(start = 20.dp, end = 20.dp, top = 15.dp, bottom = 20.dp)
            .clickable {

            }) {
        Column {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "Version 5", fontSize = 40.sp, style = MaterialTheme.typography.h2)

            }
            Text(text = buildAnnotatedString {
                withStyle(style = SpanStyle(color = Color.Black))
                {
                    append("Comrades")
                }
                withStyle(style = SpanStyle(color = GrayVenma2))
                {
                    append(" (coming soon)")
                } },
                fontSize = 15.sp,
                style = MaterialTheme.typography.body1
            )
            Spacer(modifier = Modifier.height(5.dp))
        }
    }
}
