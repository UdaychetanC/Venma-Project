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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.navigation.NavHostController
import com.example.venmamainproject.R
import com.example.venmamainproject.a_1st_Version.z_Navigation_1.AllScreens1
import com.example.venmamainproject.ui.theme.*

enum class ProfileTab {
    Pix, Vids, MyMoji
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MyProfileScreen1(navController: NavHostController){
    BottomSheetAllTabs1(navController)
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun BottomSheetAllTabs1(navController: NavHostController) {
    val topOffset = 56.dp
    val scope = rememberCoroutineScope()
    val scaffoldState = rememberBottomSheetScaffoldState()

    BoxWithConstraints {

        val sheetHeight = with(LocalDensity.current) { constraints.maxHeight.toDp() - topOffset }

        BottomSheetScaffold(
            scaffoldState = scaffoldState,
            sheetPeekHeight = 230.dp,
            topBar = {
                TopBar1(navController)
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
                    AllTabs1()
                } }
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize())

            {
                ProfilePhotos1()
                My_UserName()
                Four_Tabs()

            }
        } } }

@Composable
fun TopBar1 (navController: NavHostController) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(start = 11.dp, top = 14.dp)
            .fillMaxWidth()
    ) {
        Icon(imageVector = Icons.Default.ArrowBack,
            contentDescription = null,
            tint = Color.Black,
            modifier = Modifier
                .size(26.dp)
        )
        Text(
            text = "Uday Chetan" ,
            overflow = TextOverflow.Ellipsis,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            fontSize = 20.sp,
        )
        Icon(imageVector = Icons.Default.Settings,
            contentDescription = null,
            tint = Color.Black,
            modifier = Modifier
                .padding(end = 16.dp)
                .size(26.dp)
                .clickable {
                    navController.navigate(AllScreens1.AllSettings1.route)
                }
        )
    }
}

@Composable
fun ProfilePhotos1(){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 40.dp, bottom = 15.dp)
    ) {
        Image(painter = painterResource(id = R.drawable.testimage2),
            contentDescription = null,
            Modifier
                .size(130.dp)
                .clip(CircleShape))
    }
}

@Composable
fun My_UserName(){
    val letterSpacing = 0.5.sp
    val lineHeight = 20.sp

    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 25.dp, top = 15.dp, bottom = 20.dp)
    ) {
        Text(
            modifier = Modifier.padding(bottom = 5.dp),
            text = "@Uday_Chetan",
            fontSize = 15.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.Black,
            letterSpacing = letterSpacing,
            lineHeight = lineHeight
        )
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun Four_Tabs(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 25.dp, horizontal = 10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ){

        Tab_My_Username()  // my username here

        Card(modifier = Modifier
            .width(55.dp)
            .height(45.dp),
            shape = RoundedCornerShape(20.dp),
            elevation = 5.dp,
            backgroundColor = GrayVenma
        )
        {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Icon(
                    imageVector = Icons.Default.ImportContacts, // My number and Email here
                    contentDescription = null,
                    tint = Color.Black,
                    modifier = Modifier
                        .size(20.dp)
                )
            }
        }

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
                    "Venma ID & Secret name here",
                    Toast.LENGTH_SHORT).show()
            }
        )
        {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Icon(
                    imageVector = Icons.Default.SportsEsports,/// Venma ID & Secret name (coming soon)
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
            backgroundColor = GrayVenma
        )
        {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Icon(
                    imageVector = Icons.Default.Pix, // my age in Venma here (1d 1m like this)
                    contentDescription = null,
                    tint = Color.Black,
                    modifier = Modifier
                        .size(23.dp)
                ) }
        }
    }
}

@Composable
fun Tab_My_Username() {   // Contact List
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
                            text = "my username here",
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
            )
        }
    }

}

@Composable
fun AllTabs1(){     /// Mymoji Here
    Column(Modifier.fillMaxSize()) {
        var tabSelected by remember {
            mutableStateOf(
                ProfileTab.Pix
            )
        }
        ProfileTabBar1(
            tabSelected,
            onTabSelected = { tabSelected = it },
        )
        when (tabSelected) {
            ProfileTab.Pix -> FirstTab1(
                pix = listOf(
                    painterResource(id = R.drawable.testimage1),
                    painterResource(id = R.drawable.testimage2),
                    painterResource(id = R.drawable.testimage3),
                    painterResource(id = R.drawable.testimage1),
                    painterResource(id = R.drawable.testimage2),
                    painterResource(id = R.drawable.testimage3),
                ),
                title = "Me with My Kitty Cat Retro"
            )
            ProfileTab.Vids -> SecondTab1(
                pix = listOf(
                    painterResource(id = R.drawable.testimage1),
                    painterResource(id = R.drawable.testimage2),
                    painterResource(id = R.drawable.testimage3),
                    painterResource(id = R.drawable.testimage1),
                    painterResource(id = R.drawable.testimage2),
                    painterResource(id = R.drawable.testimage3),
                ),
                title = "Me with My Kitty Cat Retro"
            )
            ProfileTab.MyMoji -> FourthTab1()
        }
    }
}

@Composable
fun ProfileTabBar1(
    tabSelected: ProfileTab,
    onTabSelected: (ProfileTab) -> Unit,
) {
    AppTabBar1 { tabBarModifier ->
        AppTabs1(
            modifier = tabBarModifier,
            titles = ProfileTab.values().map { it.name },
            tabSelected = tabSelected,
            onTabSelected = { newTab ->
                onTabSelected(ProfileTab.values()[newTab.ordinal])
            }
        )
    }
}

@Composable
fun AppTabBar1(
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
fun AppTabs1(
    modifier: Modifier = Modifier,
    titles: List<String>,
    tabSelected: ProfileTab,
    onTabSelected: (ProfileTab) -> Unit,
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
                selected = selected,
                onClick = { onTabSelected(ProfileTab.values()[index]) }
            )
        }
    }
}
