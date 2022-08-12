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
import androidx.compose.ui.res.stringResource
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
            BottomBarIcon(R.drawable.ic_home)
            BottomBarIcon(R.drawable.ic_search)
            BottomBarIcon(R.drawable.ic_community)
            BottomBarIcon(R.drawable.ic_notifications)
            BottomBarIcon(R.drawable.ic_dm)
        }
    }
}

@Composable
private fun BottomBarIcon(icon: Int) {
    IconButton(onClick = {}) {
        Image(
            painter = painterResource(id = icon),
            modifier = Modifier.size(24.dp),
            contentDescription = stringResource(id = R.string.bottom_app_bar_icon_description)
        )
    }
}