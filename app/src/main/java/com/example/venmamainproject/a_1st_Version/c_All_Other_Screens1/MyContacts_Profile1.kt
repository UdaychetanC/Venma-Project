package com.example.venmamainproject.a_1st_Version.c_All_Other_Screens1

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.*
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.navigation.NavHostController
import com.example.venmamainproject.R
import com.example.venmamainproject.ui.theme.*

enum class ProfileTabC1 {
    Pix, Vids
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ContactsProfile1(navController: NavHostController){
    ContactsBottomSheet1()
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ContactsBottomSheet1() {
    val topOffset = 56.dp
    val scope = rememberCoroutineScope()
    val scaffoldState = rememberBottomSheetScaffoldState()

    BoxWithConstraints {

        val sheetHeight = with(LocalDensity.current) { constraints.maxHeight.toDp() - topOffset }

        BottomSheetScaffold(
            scaffoldState = scaffoldState,
            sheetPeekHeight = 340.dp,
            topBar = {
                TopBarContacts1()
            },
           /* sheetElevation = 20.dp,
            sheetShape = (RoundedCornerShape(35.dp)),*/
            sheetContent = {
                Column(
                    modifier = Modifier
                        .verticalScroll(rememberScrollState())
                        .requiredHeight(sheetHeight)
                    /// .height(128.dp)
                ) {
                    AllTabsC1()
                } }
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize())

            {
                ContactsProfilePic1()
                Four_tabs()
            }
        } } }

@Composable
fun TopBarContacts1(modifier: Modifier = Modifier){
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .padding(top = 15.dp)
            .fillMaxWidth()
    ) {
            Icon(
                modifier = Modifier
                    .padding(start = 13.dp)
                    .size(26.dp),
                imageVector = Icons.Default.ArrowBack,
                contentDescription = null,
                tint = Color.Black)
        Text(
            text = "Akhil Kumar",
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            fontSize = 20.sp,
        )

        Icon(imageVector = Icons.Default.MoreVert,
            contentDescription = null,
            tint = Color.Black,
            modifier = Modifier
                .padding(end = 13.dp)
                .size(26.dp))
    }
}

@Composable
fun ContactsProfilePic1() {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Box(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 40.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.testimage2),
                contentDescription = null,
                Modifier
                    .size(130.dp)
                    .clip(CircleShape)
            )
        }
        val letterSpacing = 0.5.sp
        val lineHeight = 20.sp
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 25.dp, top = 25.dp, end = 25.dp, bottom = 10.dp)
        ) {
            Text(
                text = "Akhil Frnd",
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold

                ,
                color = Color.Black,
                letterSpacing = letterSpacing,
                lineHeight = lineHeight
            )
          /* Text(
                text = "SNS \n"+
                        "ex wpw\n" +
                        "Believer\n" +
                        "Whatever don't know\n" +
                        "enough for Bio",
                fontSize = 14.sp,
                letterSpacing = letterSpacing,
                lineHeight = lineHeight
            )*/
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun Four_tabs(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 25.dp, horizontal = 10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ){

        UsernameInfo_1() /// To see Username Details
        Contact_Info_1()  /// To See Contact details

        val context = LocalContext.current
        Card(modifier = Modifier
            .width(55.dp)
            .height(45.dp),
            shape = RoundedCornerShape(20.dp),
            elevation = 5.dp,
            backgroundColor = GrayVenma,
            onClick = {
                // Toast
                Toast.makeText(context,
                    "You Pinched Akhil Frnd",
                    Toast.LENGTH_SHORT).show()
            }
        )
        {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Icon(
                    imageVector = Icons.Default.Pinch,  /// Pinch
                    contentDescription = null,
                    tint = Color.Black,
                    modifier = Modifier
                        .size(25.dp)
                ) }
        }

        Card(modifier = Modifier
            .width(55.dp)
            .height(45.dp),
            shape = RoundedCornerShape(20.dp),
            elevation = 5.dp,
            backgroundColor = GrayVenma)
        {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Icon(
                    imageVector = Icons.Default.Settings, // All Chat Settings, media accecibility with this person
                    contentDescription = null,
                    tint = Color.Black,
                    modifier = Modifier
                        .size(23.dp)
                ) }
        }
    }
}

@Composable
fun UsernameInfo_1() {
    val interactionSource = MutableInteractionSource()
    var dialogOpen by remember { mutableStateOf(false) }

    if (dialogOpen){
        Dialog(onDismissRequest = {
            dialogOpen = false
        },
            properties = DialogProperties(
                dismissOnClickOutside = true
            )
        ) {
            Card(
                modifier = Modifier
                    .size(240.dp, 260.dp),
                shape = RoundedCornerShape(10.dp),
                elevation = 10.dp
            ){
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(16.dp))
                {
                    Row (horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically)
                    {
                        Text(
                            modifier = Modifier.padding(start = 5.dp, top = 5.dp, bottom = 5.dp),
                            text = "Username Here",
                            style = MaterialTheme.typography.h6,
                            fontSize = 20.sp,) } } }
        }
    }

    Card(modifier = Modifier
        .clickable(interactionSource = interactionSource, indication = null) {
            dialogOpen = true
        }
        .width(55.dp)
        .height(45.dp),
        shape = RoundedCornerShape(20.dp),
        elevation = 5.dp,
        backgroundColor = GrayVenma)
    {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(
                imageVector = Icons.Default.AlternateEmail,
                contentDescription = null,
                tint = Color.Black,
                modifier = Modifier
                    .size(20.dp)
            ) }
    }

}

@Composable
fun Contact_Info_1() {
    val interactionSource = MutableInteractionSource()
    var dialogOpen by remember { mutableStateOf(false) }

    if (dialogOpen){
        Dialog(onDismissRequest = {
            dialogOpen = false
        },
            properties = DialogProperties(
                dismissOnClickOutside = true
            )
        ) {
            Card(
                modifier = Modifier
                    .size(240.dp, 260.dp),
                shape = RoundedCornerShape(10.dp),
                elevation = 10.dp
            ){
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .padding(16.dp))
                {
                    Row (horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically)
                    {
                        Text(
                            modifier = Modifier.padding(start = 5.dp, top = 5.dp, bottom = 5.dp),
                            text = "Contact info Here - (Contact name, mobile)",
                            style = MaterialTheme.typography.h6,
                            fontSize = 20.sp,) } } }
        }
    }

    Card(modifier = Modifier
        .clickable(interactionSource = interactionSource, indication = null) {
            dialogOpen = true
        }
        .width(55.dp)
        .height(45.dp),
        shape = RoundedCornerShape(20.dp),
        elevation = 5.dp,
        backgroundColor = GrayVenma)
    {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(
                imageVector = Icons.Default.ImportContacts,
                contentDescription = null,
                tint = Color.Black,
                modifier = Modifier
                    .size(20.dp)
            ) }
    }

}

@Composable
fun AllTabsC1(){  ///  Mymoji Here
    Column(Modifier.fillMaxSize()) {

        var tabSelected by remember {
            mutableStateOf(
                ProfileTabC1.Pix
            )
        }
        ProfileTabBarC1(
            tabSelected,
            onTabSelected = { tabSelected = it },
        )
        when (tabSelected) {
            ProfileTabC1.Pix -> FirstTabC1(
                pix = listOf(
                    painterResource(id = R.drawable.testimage1),
                    painterResource(id = R.drawable.testimage3),
                    painterResource(id = R.drawable.testimage3),
                    painterResource(id = R.drawable.testimage1),
                    painterResource(id = R.drawable.testimage2),
                    painterResource(id = R.drawable.testimage3),
                ),
                title = "Me with My Kitty Cat Retro"
            )
            ProfileTabC1.Vids -> SecondTabC1(
                pix = listOf(
                    painterResource(id = R.drawable.testimage3),
                    painterResource(id = R.drawable.testimage2),
                    painterResource(id = R.drawable.testimage3),
                    painterResource(id = R.drawable.testimage1),
                    painterResource(id = R.drawable.testimage2),
                    painterResource(id = R.drawable.testimage3),
                ),
                title = "Me with My Kitty Cat Retro"
            )
        }
    }
}

@Composable
fun ProfileTabBarC1(
    tabSelected: ProfileTabC1,
    onTabSelected: (ProfileTabC1) -> Unit,
) {
    AppTabBarC1 { tabBarModifier ->
        AppTabsC1(
            modifier = tabBarModifier,
            titles = ProfileTabC1.values().map { it.name },
            tabSelected = tabSelected,
            onTabSelected = { newTab ->
                onTabSelected(ProfileTabC1.values()[newTab.ordinal])
            }
        )
    }
}

@Composable
fun AppTabBarC1(
    modifier: Modifier = Modifier,
    children: @Composable (Modifier) -> Unit,
) {
    Row(modifier) {

        children(
            Modifier
                .weight(1f)
                .align(Alignment.CenterVertically)
        )
    }
}

@Composable
fun AppTabsC1(
    modifier: Modifier = Modifier,
    titles: List<String>,
    tabSelected: ProfileTabC1,
    onTabSelected: (ProfileTabC1) -> Unit,
) {
    TabRow(
        selectedTabIndex = tabSelected.ordinal,
        modifier = modifier,
        backgroundColor = Color.White,
        contentColor = Color.Black,
        indicator = { tabIndicator ->
            Box(
                modifier = Modifier
                    .tabIndicatorOffset(tabIndicator[tabSelected.ordinal])
                    .height(2.dp)
                    .padding(horizontal = 25.dp)
                    .background(color = Color.Black, shape = RoundedCornerShape(5.dp))
            ) },
        divider = {}
    ) {
        titles.forEachIndexed { index, title ->
            val selected = index == tabSelected.ordinal
            Tab(
                text = {
                    Text(
                        text = title)
                },
/*
                unselectedContentColor = Color.Black,
*/
                selected = selected,
                onClick = { onTabSelected(ProfileTabC1.values()[index]) }
            )
        }
    }
}


