package com.iamageo.jetlinkedin.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.ScaffoldState
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.iamageo.jetlinkedin.R
import com.iamageo.jetlinkedin.data.dummyUserData
import com.iamageo.jetlinkedin.ui.theme.searchBarColor
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun TopBar(coroutineScope: CoroutineScope, scaffoldState: ScaffoldState) {
    TopAppBar(
        backgroundColor = Color.White,
        elevation = 5.dp,
    ) {
        Row(
            modifier = Modifier
                .padding(start = 12.dp, end = 12.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = dummyUserData[0].avatar),
                modifier = Modifier
                    .size(34.dp)
                    .clip(shape = RoundedCornerShape(17.dp))
                    .clickable {
                        coroutineScope.launch { scaffoldState.drawerState.open() }
                    },
                contentScale = ContentScale.Crop,
                contentDescription = "profile drawer icon",
            )

            Row(
                modifier = Modifier
                    .width(280.dp)
                    .height(40.dp)
                    .clip(shape = RoundedCornerShape(2.dp))
                    .background(color = searchBarColor)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_search),
                    tint = Color.Black,
                    modifier = Modifier
                        .width(24.dp)
                        .padding(start = 4.dp, top = 10.dp),
                    contentDescription = "messages icon",
                )
                Text(
                    text = "Pesquisar",
                    style = TextStyle(color = Color.Black),
                    modifier = Modifier.padding(start = 8.dp, top = 10.dp)
                )
            }

            Icon(
                painter = painterResource(id = R.drawable.ic_messages),
                tint = Color.Black,
                modifier = Modifier.size(24.dp),
                contentDescription = "messages icon",
            )
        }
    }
}