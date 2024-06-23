package com.example.venmamainproject.a_1st_Version.c_All_Other_Screens1

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.venmamainproject.ui.theme.*

@Composable
fun FirstTab1(
    pix: List<Painter>,
    title: String,
    modifier : Modifier = Modifier
)
{
    LazyVerticalGrid(
        modifier = Modifier.fillMaxSize(),
        columns = GridCells.Fixed(2),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(start = 10.dp, top = 25.dp, end = 10.dp, bottom = 15.dp)
    ){
        items(pix.size){
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(15.dp),
                elevation = 5.dp
            ) {

                Box(modifier = Modifier.height(290.dp))
                {
                    Image(
                        painter = pix[it],
                        contentDescription = null,
                        contentScale = ContentScale.Crop
                    )
                    Box(modifier = Modifier
                        .fillMaxSize()
                        .background(
                            Brush.verticalGradient(
                                colors = listOf(
                                    Color.Transparent,
                                    Color.Black
                                ),
                                startY = 200f
                            )
                        )
                    )
                    Box(modifier = Modifier
                        .fillMaxSize()
                        .padding(12.dp),
                        contentAlignment = Alignment.BottomStart)
                    {
                        Text(
                            title,
                            style = TextStyle(color = Color.White, fontSize = 18.sp),
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun SecondTab1(
    pix: List<Painter>,
    title: String,
    modifier : Modifier = Modifier
)
{
    LazyVerticalGrid(
        modifier = Modifier.fillMaxSize(),
        columns = GridCells.Fixed(2),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(start = 10.dp, top = 25.dp, end = 10.dp, bottom = 15.dp)
    ){
        items(pix.size){
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(15.dp),
                elevation = 5.dp
            ) {

                Box(modifier = Modifier.height(290.dp))
                {
                    Image(
                        painter = pix[it],
                        contentDescription = null,
                        contentScale = ContentScale.Crop
                    )
                    Box(modifier = Modifier
                        .fillMaxSize()
                        .background(
                            Brush.verticalGradient(
                                colors = listOf(
                                    Color.Transparent,
                                    Color.Black
                                ),
                                startY = 200f
                            )
                        )
                    )
                    Box(modifier = Modifier
                        .fillMaxSize()
                        .padding(12.dp),
                        contentAlignment = Alignment.BottomStart)
                    {
                        Text(
                            title,
                            style = TextStyle(color = Color.White, fontSize = 18.sp),
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun ThirdTab1(){

}

@Composable
fun FourthTab1(){
    Box(modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())
        .padding(top = 300.dp, bottom = 40.dp)
    ){
        Column{
            Header1()
            Card1()
            Spacer(modifier = Modifier.height(40.dp))
            Header3()
            Card3()
            Spacer(modifier = Modifier.height(40.dp))
            VenmaIdHere()
            Spacer(modifier = Modifier.height(20.dp))
            SecretNameHere()
        }}
}


@Composable
fun Header1(){
    val letterSpacing = 0.5.sp

    Column (
        horizontalAlignment = Alignment.Start
    ){
        Text(
            modifier = Modifier.padding(start = 30.dp),
            text = "My People",
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            fontSize = 16.sp,
            style = MaterialTheme.typography.body2,
            letterSpacing = letterSpacing
        )

    }
}

@Composable
fun Card1(){
    Column(
        modifier = Modifier.padding(start = 20.dp, end = 20.dp, top = 15.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .width(315.dp)
                .height(50.dp),
            shape = RoundedCornerShape(10.dp),
            elevation = 1.dp,
            border = BorderStroke(1.dp, Color.Black)
        ) {
            Row(
                modifier = Modifier.fillMaxSize()
                    .padding(start = 15.dp, top = 15.dp, bottom = 15.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Icon(
                    modifier = Modifier
                        .align(Alignment.CenterVertically),
                    imageVector = Icons.Outlined.LooksOne,
                    tint = GrayVenma2,
                    contentDescription = null
                )

                Text(
                    text = "One",
                    fontSize = 16.sp,
                    modifier = Modifier
                        .padding(start = 20.dp)
                        .align(Alignment.CenterVertically)
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .width(315.dp)
                .height(50.dp),
            shape = RoundedCornerShape(10.dp),
            elevation = 1.dp,
            border = BorderStroke(1.dp, Color.Black)
        ) {
            Row(
                modifier = Modifier.fillMaxSize()
                    .padding(start = 15.dp, top = 15.dp, bottom = 15.dp, end = 15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row{
                    Icon(
                        modifier = Modifier
                            .align(Alignment.CenterVertically),
                        imageVector = Icons.Outlined.Group,
                        tint = GrayVenma2,
                        contentDescription = null
                    )

                    Text(
                        text = "Exclusive",  /// Contacts..  Group g onji mnpodu
                        fontSize = 16.sp,
                        modifier = Modifier
                            .padding(start = 20.dp)
                            .align(Alignment.CenterVertically)
                    )
                }
                Row {
                    Text(
                        text = "Version 2",
                        color = GrayVenma4,
                        fontSize = 12.sp,
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .width(315.dp)
                .height(50.dp),
            shape = RoundedCornerShape(10.dp),
            elevation = 1.dp,
            border = BorderStroke(1.dp, Color.Black)
        ) {
            Row(
                modifier = Modifier.fillMaxSize()
                    .padding(start = 15.dp, top = 15.dp, bottom = 15.dp, end = 15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row{
                    Icon(
                        modifier = Modifier
                            .align(Alignment.CenterVertically),
                        imageVector = Icons.Outlined.Group,
                        tint = GrayVenma2,
                        contentDescription = null
                    )

                    Text(
                        text = "Comrades",  /// Contacts..  Group g onji mnpodu
                        fontSize = 16.sp,
                        modifier = Modifier
                            .padding(start = 20.dp)
                            .align(Alignment.CenterVertically)
                    )
                }
                Row {
                    Text(
                        text = "Version 3",
                        color = GrayVenma4,
                        fontSize = 12.sp,
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(20.dp))

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .width(315.dp)
                .height(50.dp),
            shape = RoundedCornerShape(10.dp),
            elevation = 1.dp,
            border = BorderStroke(1.dp, Color.Black)
        ) {
            Row(
                modifier = Modifier.fillMaxSize()
                    .padding(start = 15.dp, top = 15.dp, bottom = 15.dp, end = 15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row{
                    Icon(
                        modifier = Modifier
                            .align(Alignment.CenterVertically),
                        imageVector = Icons.Outlined.Group,
                        tint = GrayVenma2,
                        contentDescription = null
                    )

                    Text(
                        text = "Somebodies", // Friends
                        fontSize = 16.sp,
                        modifier = Modifier
                            .padding(start = 20.dp)
                            .align(Alignment.CenterVertically)
                    )
                }
                Row {
                    Text(
                        text = "Version 3",
                        color = GrayVenma4,
                        fontSize = 12.sp,
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .width(315.dp)
                .height(50.dp),
            shape = RoundedCornerShape(10.dp),
            elevation = 1.dp,
            border = BorderStroke(1.dp, Color.Black)
        ) {
            Row(
                modifier = Modifier.fillMaxSize()
                    .padding(start = 15.dp, top = 15.dp, bottom = 15.dp, end = 15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row{
                    Icon(
                        modifier = Modifier
                            .align(Alignment.CenterVertically),
                        imageVector = Icons.Outlined.Group,
                        tint = GrayVenma2,
                        contentDescription = null
                    )

                    Text(
                        text = "Secret Nation",  // Secret Communities
                        fontSize = 16.sp,
                        modifier = Modifier
                            .padding(start = 20.dp)
                            .align(Alignment.CenterVertically)
                    )
                }
                Row {
                    Text(
                        text = "Version 4",
                        color = GrayVenma4,
                        fontSize = 12.sp,
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(20.dp))

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .width(315.dp)
                .height(50.dp),
            shape = RoundedCornerShape(10.dp),
            elevation = 1.dp,
            border = BorderStroke(1.dp, Color.Black)
        ) {
            Row(
                modifier = Modifier.fillMaxSize()
                    .padding(start = 15.dp, top = 15.dp, bottom = 15.dp, end = 15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row{
                    Icon(
                        modifier = Modifier
                            .align(Alignment.CenterVertically),
                        imageVector = Icons.Default.Person2,
                        tint = GrayVenma2,
                        contentDescription = null
                    )

                    Text(
                        text = "Fans",  // My Fans // but not in use here, just for HYPE.
                        fontSize = 16.sp,
                        modifier = Modifier
                            .padding(start = 20.dp)
                            .align(Alignment.CenterVertically)
                    )
                }
                Row {
                    Text(
                        text = "Version 5",
                        color = GrayVenma4,
                        fontSize = 12.sp,
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )
                }
            }
        }
    }
}

@Composable
fun Header3(){
    val letterSpacing = 0.5.sp
    Column (
        horizontalAlignment = Alignment.Start
    ){
        Text(
            modifier = Modifier.padding(start = 30.dp),
            text = "Games",
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            fontSize = 16.sp,
            style = MaterialTheme.typography.body2,
            letterSpacing = letterSpacing
        )
    }
}

@Composable
fun Card3(){
    Column(
        modifier = Modifier.padding(start = 20.dp, end = 20.dp, top = 15.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .width(315.dp)
                .height(50.dp),
            shape = RoundedCornerShape(10.dp),
            elevation = 1.dp,
            border = BorderStroke(1.dp, Color.Black)
        ) {
            Row(
                modifier = Modifier.fillMaxSize()
                    .background(
                        brush = Brush.linearGradient(
                            colors = listOf(
                                Version_1_Dark, Version_1, Version_1_mix2, Color.Cyan
                            )
                        )
                    )
                    .padding(start = 15.dp, top = 15.dp, bottom = 15.dp, end = 15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row{
                    Icon(
                        modifier = Modifier
                            .align(Alignment.CenterVertically),
                        imageVector = Icons.Outlined.Games,
                        tint = Color.White,
                        contentDescription = null
                    )

                    Text(
                        text = "Games & Challenges",
                        color = Color.White,
                        fontSize = 16.sp,
                        modifier = Modifier
                            .padding(start = 20.dp)
                            .align(Alignment.CenterVertically)
                    )
                }
                Row {
                    Text(
                        text = "Version 4",
                        color = Color.White,
                        fontSize = 12.sp,
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )
                }
            }
        } } }

@Composable
fun VenmaIdHere(){
    LocalClipboardManager.current
    val letterSpacing = 0.5.sp
    val lineHeight = 20.sp
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Row {
            Text(
                modifier = Modifier.padding(end = 10.dp),
                fontSize = 15.sp,
                text = "My Venma ID -",
                color = Color.Gray,
                letterSpacing = letterSpacing,
                lineHeight = lineHeight
            )
            Text(
                text = "AriesUdayDM2608",  // Zodiacname - Aries, Nickname(uday) (selectable) bodtina padoli(6 letter maximum), D- Dakshinakannada, M- Mangalore,
                fontSize = 15.sp,
                letterSpacing = letterSpacing,
                lineHeight = lineHeight,
                color = Color.Black)
            Icon(
                imageVector = Icons.Default.CopyAll ,
                tint = Color.Gray,
                contentDescription = "Copy to clipboard",
                modifier = Modifier
                    .padding(start = 10.dp)
            )
        }
    }
}

@Composable
fun SecretNameHere(){
    val letterSpacing = 0.5.sp
    val lineHeight = 20.sp
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Row {
            Text(
                modifier = Modifier.padding( end = 10.dp),
                fontSize = 15.sp,
                text = "My Secret Name - ",
                color = Color.Gray,
                letterSpacing = letterSpacing,
                lineHeight = lineHeight
            )
            Text(
                text = "HoodDevil20",
                fontSize = 15.sp,
                letterSpacing = letterSpacing,
                lineHeight = lineHeight,
                color = Color.Black)
            Icon(
                imageVector = Icons.Default.CopyAll ,
                tint = Color.Gray,
                contentDescription = "Copy to clipboard",
                modifier = Modifier
                    .padding(start = 10.dp)
            )
        }
    }
}