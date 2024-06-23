package com.example.venmamainproject.a_1st_Version.a_First_Screen_Package1

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.venmamainproject.R
import com.example.venmamainproject.a_1st_Version.z_Navigation_1.AllScreens1
import com.example.venmamainproject.ui.theme.*

// HOME PAGE VERSION 1

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Version1MainScreenChat1(navController: NavHostController){
    Scaffold(
        topBar = { CustomTopBar1(navController) },
        content = {
            LazyColumn{
                item {
                    NameandPunya1(navController)
                    ProfilePhoto1()
                    Call_Game_Videocall()
                    MessageHere1(navController)
                    Bestie_Avatar_Point_1()
                    FriendStory1()
                    TodayTextMiddle()
                    MyStory1()
                }
            }
        }
    )
}

@OptIn(ExperimentalTextApi::class)
@Composable
fun CustomTopBar1(navController: NavHostController) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .background(Color.White)
            .height(55.dp)
            .fillMaxWidth()
    )
    {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .padding(start = 13.dp)
                    .size(43.dp)
                    .clip(CircleShape)
                    .background(GrayVenma)
                    .clickable {
                        navController.navigate(AllScreens1.MyProfile1.route)
                    }
            ) {
                Icon(
                    imageVector = Icons.Default.Person,  /// MYMOJI AVATAR HERE (Bimoji)
                    contentDescription = null,
                    tint = Version_1_Dark
                )
            }
        }
        Spacer(modifier = Modifier.width(40.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier, Alignment.Center
            ) {
                Text(
                    text = "Version 1",
                    fontSize = 21.sp,
                    style = TextStyle(
                        brush = Brush.linearGradient(
                            colors = listOf(
                                Version_1_mix1, Version_1_mix2
                            )
                        )
                    ),
                )
            }
        }

        Spacer(modifier = Modifier.width(40.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {

            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .padding(end = 13.dp)
                    .size(43.dp)
                    .clip(CircleShape)
                    .background(GrayVenma)
                    .clickable {
                        navController.navigate(AllScreens1.Setting1.route)
                    }
            ) {
                Icon(
                    imageVector = Icons.Default.Settings,
                    contentDescription = null,
                    tint = Version_1_Dark
                )
            }
        }
    }
}

@Composable
fun NameandPunya1(navController: NavHostController){
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 20.dp)
    ) {
        Card(
            modifier = Modifier
                .width(120.dp)
                .height(35.dp),
            backgroundColor = Version_1,
            shape = RoundedCornerShape(topEnd = 6.dp, bottomEnd = 6.dp),
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .background(
                        brush = Brush.linearGradient(
                            colors = listOf(
                                Version_1_mix1, Version_1_mix2
                            )
                        )
                    )
                    .clickable {
                        navController.navigate(AllScreens1.ContactsProfile1.route)
                    }
            )
            {
                Text(
                    modifier = Modifier.padding(4.dp),
                    text = "Akhil Frnd",
                    textAlign = TextAlign.Center,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    color = Color.White
                )
            }
        }
        Card(
            modifier = Modifier
                .width(120.dp)
                .height(35.dp),
            shape = RoundedCornerShape(topStart = 6.dp, bottomStart = 6.dp),
        )
        {
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .background(
                        brush = Brush.linearGradient(
                            colors = listOf(
                                Version_1_mix2, Version_1_mix1
                            )
                        )
                    )
            ) {
                Icon(imageVector = Icons.Default.GpsFixed,
                    contentDescription = null,
                    tint =  Color.White,
                    modifier = Modifier
                        .size(19.dp)
                        .padding()
                )
                Spacer(modifier = Modifier.width(5.dp))
                Text(
                    text = "1m 10d",
                    color = Color.White,
                    modifier = Modifier
                        .padding()
                )
            }
        }
    }
}

@Composable
fun ProfilePhoto1(){
    Column(
        modifier = Modifier.fillMaxWidth(),
    ) {
        Box(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 20.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.testimage2),
                contentDescription = null,
                Modifier
                    .size(120.dp)
                    .clip(CircleShape)
            )
        }
    }
}

@Composable
fun Call_Game_Videocall(){
    Row(
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 40.dp, end = 40.dp, top =25.dp, bottom = 10.dp)
        ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(43.dp)
                .clip(CircleShape)
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Version_1_mix1, Version_1_mix2
                        )
                    )
                )
                .clickable {}
        ) {
            Icon(
                imageVector = Icons.Default.Call,
                contentDescription = null,
                tint = Color.White)
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(43.dp)
                .clip(CircleShape)
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Version_1_mix1, Version_1_mix2
                        )
                    )
                )
                .clickable {}
        ) {
            Icon(
                imageVector = Icons.Default.VideoCall,
                contentDescription = null,
                tint = Color.White)
        }

        val context = LocalContext.current

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(43.dp)
                .clip(CircleShape)
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Version_1_mix1, Version_1_mix2
                        )
                    )
                )
                .clickable {
                    // Toast
                    Toast
                        .makeText(
                            context,
                            "You Pinched Akhil Frnd",
                            Toast.LENGTH_SHORT
                        )
                        .show()
                }
        ) {
            Icon(
                imageVector = Icons.Default.Pinch,  // coming soon
                contentDescription = null,
                tint = Color.White)
        }
    }
}

/*@Composable
fun MessageHereMain1(navController: NavHostController) {
    val dummyChat1 = DummyData1.listChat1

    LazyColumn{
        items(dummyChat1.size) {index ->
            MessageHere1(dummyChat1[index],  onClick = {
                navController.navigate(ChatScreen1.ChatDetail1.route + "/$index")
            }
            )
        }
    }
}*/

@Composable
fun MessageHere1(navController: NavHostController){
    Row(horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 20.dp, bottom = 25.dp)
    ) {
        Card(
            modifier = Modifier
                .clickable {
                    navController.navigate(AllScreens1.ChatDetailScreen1.route)
                }
                .width(300.dp)
                .height(47.dp),
            shape = RoundedCornerShape(10.dp)
        ) {
            Row(modifier = Modifier
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Version_1_mix1, Version_1_mix2
                        )
                    )
                ),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Icon(modifier = Modifier
                    .padding(start = 15.dp),
                    imageVector = Icons.Default.Hail, /// BITMOJI AVATAR HERE
                    contentDescription = null,
                    tint = Color.White
                )
                Spacer(modifier = Modifier.width(15.dp))
                Text(
                    "Version 1 Mulpa", // New Chat Here
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    color = Color.White,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                    textAlign = TextAlign.Start
                    )
                Spacer(modifier = Modifier.width(72.dp))
                Text(
                    text = "10.23 pm",
                    fontSize = 11.sp,
                    color = Color.White,
                )
            }
        }
    }
}

@Composable
fun Bestie_Avatar_Point_1(){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxWidth()
            .padding(vertical = 20.dp)
    ){
        Box(contentAlignment = Alignment.Center) {
            Icon(
                imageVector = Icons.Default.Hail, /// BITMOJI AVATAR HERE
                contentDescription = null)
            /* Text(
                 text = "30",  // BITMOJI AVATAR HERE
                 fontSize = 16.sp,
                 style = MaterialTheme.typography.body1,
             )*/
        }
    }
}

@Composable
fun FriendStory1(){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 35.dp, start = 55.dp)
    ) {
        FriendStatusBaakida()
        Spacer(modifier = Modifier.width(15.dp) )
        FriendStatusToday()

        Spacer(modifier = Modifier.width(55.dp) )

        Row{
            Box(contentAlignment = Alignment.Center) {
                Icon(
                    imageVector = Icons.Default.Hail, /// BITMOJI AVATAR HERE
                    contentDescription = null)
                /* Text(
                     text = "30",  // BITMOJI AVATAR HERE
                     fontSize = 16.sp,
                     style = MaterialTheme.typography.body1,
                 )*/
            }
        }
    }
}

@Composable
fun TodayTextMiddle(){
    Row(horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 15.dp, bottom = 15.dp)
    )
    {
        Text(
            text = "Today",
            style = TextStyle(
                color = Color.Black,
                fontSize = 12.sp)
        )
    }
}

@Composable
fun MyStory1(){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 45.dp)
    ) {
        Row(
            modifier = Modifier.padding(start = 25.dp)
        )
        {
            Box(contentAlignment = Alignment.Center) {
                Icon(
                    imageVector = Icons.Default.Hail, /// BITMOJI AVATAR HERE
                    contentDescription = null)
                /*Text(
                    text = "30",
                    fontSize = 16.sp,
                    style = MaterialTheme.typography.body1,
                )*/
            }
        }
        Spacer(modifier = Modifier.width(50.dp) )

        FriendStatusToday()
        Spacer(modifier = Modifier.width(15.dp) )
        FriendStatusBaakida()


    }
}

@Composable
fun FriendStatusToday(){
    Column(
        modifier = Modifier
            .clickable {}
    ) {
        Box(
            modifier = Modifier
                .border(
                    2.dp, brush = Brush.horizontalGradient(
                        listOf(
                            Version_1_mix1,
                            Version_1_mix2,
                        )
                    ), CircleShape
                )
                .background(Color.White, shape = CircleShape)
                .size(75.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = com.example.venmamainproject.R.drawable.testimage2),
                modifier = Modifier
                    .clip(CircleShape)
                    .size(65.dp),
                contentDescription = null)
        }
    }
}

@Composable
fun FriendStatusBaakida(){
    Column(
        modifier = Modifier
            .clickable {}
    ) {
        Box(
            modifier = Modifier
                .border(
                    2.dp, brush = Brush.horizontalGradient(
                        listOf(
                            GrayVenma4,
                            GrayVenma2,
                            GrayVenma4
                        )
                    ), CircleShape
                )
                .background(Color.White, shape = CircleShape)
                .size(75.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = com.example.venmamainproject.R.drawable.testimage2),
                modifier = Modifier
                    .clip(CircleShape)
                    .size(65.dp),
                contentDescription = null)
        }
    }
}