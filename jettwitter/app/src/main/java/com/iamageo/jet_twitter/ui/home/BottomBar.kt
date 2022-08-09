package com.iamageo.jet_twitter.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material.BottomAppBar
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.iamageo.jet_twitter.R

@Composable
fun BottomBar() {
    BottomAppBar(
        backgroundColor = Color.White
    ) {
        Row(
            modifier = Modifier.weight(1f),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            BottomBarIcon(R.drawable.ic_home_24)
            BottomBarIcon(R.drawable.ic_search_24)
            BottomBarIcon(R.drawable.ic_community_24)
            BottomBarIcon(R.drawable.ic_notifications_24)
            BottomBarIcon(R.drawable.ic_chats_24)
        }
    }
}

@Composable
private fun BottomBarIcon(icon: Int) {
    IconButton(onClick = {}) {
        Image(
            painter = painterResource(id = icon),
            modifier = Modifier.size(24.dp),
            contentDescription = "Icon $icon of bottombar"
        )
    }
}