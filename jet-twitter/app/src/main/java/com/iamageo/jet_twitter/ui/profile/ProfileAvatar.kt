package com.iamageo.jet_twitter.ui.profile

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.iamageo.jet_twitter.R

@Composable
fun ProfileAvatar(modifier: Modifier = Modifier) {
    Image(
        painterResource(R.drawable.profile),
        modifier = modifier
            .size(70.dp)
            .clip(shape = RoundedCornerShape(40.dp))
            .border(
                BorderStroke(
                    color = Color.White,
                    width = 4.dp
                ),
                shape = RoundedCornerShape(40.dp)
            ),
        contentScale = ContentScale.Crop,
        contentDescription = ""
    )
}