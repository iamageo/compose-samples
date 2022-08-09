package com.iamageo.jet_twitter.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.iamageo.jet_twitter.R

@Composable
fun TopAppBar() {
    TopAppBar(
        backgroundColor = Color.White,
        elevation = 2.dp,
    ) {
        Row(
            modifier = Modifier
                .padding(start = 12.dp, end = 12.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.profile),
                modifier = Modifier
                    .size(34.dp)
                    .clip(shape = RoundedCornerShape(17.dp)),
                contentScale = ContentScale.Crop,
                contentDescription = "User image profile"
            )
            Image(
                painter = painterResource(id = R.drawable.ic_logo),
                modifier = Modifier.size(22.dp),
                contentDescription = "Twitter logo"
            )
            Image(
                painter = painterResource(id = R.drawable.ic_star_24),
                modifier = Modifier.size(24.dp),
                contentDescription = "Thrends icon"
            )
        }
    }
}