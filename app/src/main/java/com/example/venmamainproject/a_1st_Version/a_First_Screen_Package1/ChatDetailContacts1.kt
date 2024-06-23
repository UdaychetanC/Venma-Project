package com.example.venmamainproject.a_1st_Version.a_First_Screen_Package1

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.Attachment
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.venmamainproject.R
import com.example.venmamainproject.a_1st_Version.z_Navigation_1.AllScreens1
import com.example.venmamainproject.ui.theme.*

/*class ChatDetailContacts : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VenmaMainProjectTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    val chatId1 = intent.getIntExtra("extra_chatid", 0)
                    DetailView1(chatId1, rememberNavController())

                } } } } }*/

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun DetailView1(navController: NavHostController) {
    Scaffold(
        backgroundColor = Color.Yellow,
        topBar = { TopBarChat1(navController) },
        bottomBar =  {  MessageBoxSend11() },
        content = { MessageList1() }
    )
}

@Composable
fun TopBarChat1(navController: NavHostController){
    Row( verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White))
    {
        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(7.dp)
        ) {
            Icon(
                modifier = Modifier.padding( end = 2.dp),
                imageVector = Icons.Default.ArrowBack, contentDescription = null)
            Image(
                painter = painterResource(id = R.drawable.testimage2),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .clickable {
                        navController.navigate(AllScreens1.ContactsProfile1.route) }
            )

            Column(Modifier.padding(start = 10.dp)
                 .clickable {
                    navController.navigate(AllScreens1.ContactsProfile1.route) }
            ) {
                Text("Akhil Frnd", fontSize = 17.sp) // // Chat Person Name Here
                Text("01.40", fontSize = 12.sp, fontWeight = FontWeight.Light) // Time Here
            }
        }

        Spacer(modifier = Modifier.width(62.dp))

        Row(horizontalArrangement = Arrangement.SpaceBetween) {

            IconButton(modifier = Modifier.size(30.dp),
                onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.Call, contentDescription = null, tint = Purple700)
            }

            Spacer(modifier = Modifier.width(18.dp))

            IconButton(modifier = Modifier.size(30.dp),
                onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.VideoCall, contentDescription = null, tint = Purple700 )
            }

            Spacer(modifier = Modifier.width(18.dp))

            IconButton(modifier = Modifier.size(30.dp),
                onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.MoreVert, contentDescription = null, tint = Purple700)
            }
        }
    }
}

@Composable
fun MessageList1() {
    val listMessage = DummyData1.listMessage

    Surface (
        color = Color(0xFFFAFAFA),
        shape = RoundedCornerShape(topStart = 35.dp, topEnd = 40.dp)
    )
    {
        LazyColumn {
            items(listMessage.size) {index ->

                Spacer(modifier = Modifier.height(4.dp))

                if(listMessage[index].isPeer) {
                    PeerBubble1(listMessage[index])
                } else {
                    UserBubble1(listMessage[index])
                }
                Spacer(modifier = Modifier.height(9.dp))
            }
        }
    }
}

@Composable
fun UserBubble1(message: Message1) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(90.dp, end = 10.dp)
            .clip(RoundedCornerShape(topStart = 10.dp, topEnd = 10.dp, bottomStart = 10.dp))
            .background(color = ChatBubble),
    ) {
        Row(modifier = Modifier.padding(all = 10.dp)) {
            Column(modifier = Modifier.weight(3.0f, true)) {
                Text(
                    text = message.message,
                    fontSize = 16.sp,
                    color = Color.White,
                    maxLines = 4,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}

@Composable
fun PeerBubble1(message: Message1) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp, end = 80.dp)
            .clip(RoundedCornerShape(topStart = 10.dp, topEnd = 10.dp, bottomEnd = 10.dp))
            .background(GrayVenma),
    ) {
        Row(modifier = Modifier.padding(10.dp)) {
            Column(modifier = Modifier.weight(3.0f, true)) {
                Text(
                    text = message.message,
                    fontSize = 16.sp,
                    color = Color.Black,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}

@Composable
fun MessageBoxSend11(){
    val textState = remember { mutableStateOf(TextFieldValue()) }
    rememberCoroutineScope()

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .height(55.dp)
            .background(Color.White))
    {
        Row(modifier = Modifier,
            verticalAlignment = Alignment.CenterVertically)
        {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .padding(5.dp)
                    .size(43.dp)
                    .clip(CircleShape)
                    .background(GrayVenma)
                    .clickable {}
            ) {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = null,
                    tint = Color.Gray
                )
            }

            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .padding(5.dp)
                    .size(43.dp)
                    .clip(CircleShape)
                    .background(GrayVenma)
                    .clickable {}
            ) {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = null,
                    tint = Color.Gray
                )
            }

            TextField(
                value = textState.value,
                onValueChange = {textState.value = it},
                placeholder = {
                    Text(text = "Message",

                        )
                },
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = GrayVenma3,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                )

            )
        }

    }
}

@Composable
fun MessageBoxSend1() {
    val textState = remember { mutableStateOf(TextFieldValue()) }
    rememberCoroutineScope()

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .background(Color.White)
            .height(55.dp)
            .fillMaxWidth())
    {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .padding(5.dp)
                    .size(43.dp)
                    .clip(CircleShape)
                    .background(GrayVenma)
                    .clickable {}
            ) {
                Icon(
                    imageVector = Icons.Default.Contacts,
                    contentDescription = null,
                    tint = Color.Gray
                )
            }

            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .size(43.dp)
                    .clip(CircleShape)
                    .background(GrayVenma)
                    .clickable {}
            ) {
                Icon(
                    imageVector = Icons.Default.EmojiEmotions,
                    contentDescription = null,
                    tint = Color.Gray
                )
            }
        }

        Spacer(modifier = Modifier.width(6.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,

            modifier = Modifier
                .height(40.dp)
                .clip(RoundedCornerShape(10.dp))
                .background(GrayVenma)
                .width(200.dp)

        ) {
            BasicTextField(
                value = textState.value,
                onValueChange = { textState.value = it },

                modifier = Modifier
                    .weight(1f)
                    .align(alignment = Alignment.CenterVertically)
            )
            Icon(
                Icons.Outlined.Attachment,
                tint = Color.Gray,
                contentDescription = null,
                modifier = Modifier
                    .rotate(45f)
                    .padding(start = 5.dp, top = 5.dp, end = 5.dp, bottom = 5.dp)
                    .size(25.dp)
                    .clickable { }
            )

        }

        Spacer(modifier = Modifier.width(6.dp))

        Row {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.End

            ) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .padding(end = 4.dp)
                        .size(46.dp)
                        .clip(CircleShape)
                        .background(Purple700)
                        .clickable { }
                ) {
                    Icon(
                        imageVector = Icons.Default.MicNone,
                        contentDescription = null,
                        tint = Color.White
                    )
                }
            }
        }
    }
}

