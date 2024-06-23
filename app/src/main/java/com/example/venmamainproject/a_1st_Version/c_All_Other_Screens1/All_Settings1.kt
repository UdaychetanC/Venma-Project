package com.example.venmamainproject.a_1st_Version.c_All_Other_Screens1

import android.annotation.SuppressLint
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowRight
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.venmamainproject.R
import com.example.venmamainproject.ui.theme.*

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun AllSettingHere_1(navController: NavHostController){
    Scaffold(
        topBar = { AllSetting_TopBar_1() },
        content = {
            All_Here_1(navController)
        }
    )
}

@Composable
fun All_Here_1(navController: NavHostController){
    Box(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())
    ){
        Column {
            Divider1_VersionChange_1("VERSION 1 SETTINGS")  // From Setting Screen 1
            Edit_ProfilePhoto1()
            Edit_Name_Username_1("Name", "Uday Chetan")
            Divider(color = Color(0xFFebebeb))
            Edit_Name_Username_1("Username", "@udaychetan22")
            Divider(color = Color(0xFFebebeb))
            Edit_Bio_1()
            Divider(color = Color(0xFFebebeb))
            Spacer(modifier = Modifier.height(20.dp))
            Privacy_Security_All_1("Personal Info")
            Privacy_Security_All_1("Profile Color Change")
            Privacy_Security_All_1("Privacy & Security")
            Privacy_Security_All_1("Chat")
            Spacer(modifier = Modifier.height(10.dp))

        }
    }
}

@OptIn(ExperimentalTextApi::class)
@Composable
fun AllSetting_TopBar_1(){
    Row(modifier = Modifier.padding(start = 11.dp, top = 14.dp, bottom = 14.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Icon(
            modifier = Modifier
                .size(26.dp),
            imageVector = Icons.Filled.ArrowBack,
            tint = Version_1_Dark,
            contentDescription = "Go back" )
        Spacer(modifier = Modifier.width(10.dp))

        Text(
            text = " All Settings",
            style = TextStyle(
                brush = Brush.linearGradient(
                    colors = listOf(
                        Version_1_mix1, Version_1_mix2
                    )
                )
            ),
            fontSize = 20.sp, fontWeight = FontWeight.Bold)
    }
}

@Composable
fun Edit_ProfilePhoto1(){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, top = 40.dp, end = 20.dp, bottom = 20.dp)
    ) {

        Column(horizontalAlignment = Alignment.CenterHorizontally)
        {
            Image(painter = painterResource(id = R.drawable.testimage2),
                contentDescription = null,
                Modifier
                    .size(145.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.height(15.dp))
            Text(
                text = "Edit Profile Photo",
                fontSize = 15.sp,
                color = GrayVenma4,
                fontWeight = FontWeight.W600
            )
        }
    }
}

@OptIn(ExperimentalTextApi::class)
@Composable
fun Edit_Name_Username_1(name1: String, name2: String){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .clickable {  }
            .padding(start = 20.dp, top = 20.dp, end = 20.dp, bottom = 15.dp)
            .fillMaxWidth()
    ) {
            Text(
                text = "$name1",
                fontWeight = FontWeight.W400,
                fontSize = 16.sp,
                style = TextStyle(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Version_1_mix1, Version_1_mix2)))
            )

            Text(
                text = "$name2",
                fontWeight = FontWeight.W400,
                fontSize = 15.sp,
                color = Color.DarkGray)
    }
}

@OptIn(ExperimentalTextApi::class)
@Composable
fun Edit_Bio_1(){
    Row(verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .clickable {  }
            .fillMaxWidth()
            .padding(start = 20.dp, top = 20.dp, end = 15.dp, bottom = 15.dp)
    ) {
        Text(text = "Bio",
            fontWeight = FontWeight.W400,
            fontSize = 16.sp,
            style = TextStyle(
                brush = Brush.linearGradient(
                    colors = listOf(
                        Version_1_mix1, Version_1_mix2)))
        )
    }
}

@OptIn(ExperimentalTextApi::class)
@Composable
fun Privacy_Security_All_1(name: String){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(start = 15.dp, top = 10.dp, bottom = 10.dp, end = 15.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(15.dp))
            .background(GrayVenma)
            .padding(start = 20.dp, top = 15.dp, end = 15.dp, bottom = 15.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically)
        {
            Icon(
                imageVector = Icons.Filled.Person,
                contentDescription = null
            )
            Spacer(modifier = Modifier.width(15.dp))
            Text(
                text = "$name", fontWeight = FontWeight.W500,
                fontSize = 15.sp,
                style = TextStyle(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Version_1_mix1, Version_1_mix2)))
            )
        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Filled.ArrowRight,
                contentDescription = null )
        }
    }
}

