package com.example.venmamainproject.a_1st_Version.c_All_Other_Screens1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FirstTabC1(
    pix: List<Painter>,
    title: String,
    modifier : Modifier = Modifier) {
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
fun SecondTabC1(
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




