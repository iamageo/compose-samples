package com.iamageo.jet_twitter.ui.home

import android.provider.Settings.Global.getString
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.DrawerState
import androidx.compose.material.ScaffoldState
import androidx.compose.material.TopAppBar
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.iamageo.jet_twitter.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun TopAppBar(coroutineScope: CoroutineScope, scaffoldState: ScaffoldState) {
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
                    .clip(shape = RoundedCornerShape(17.dp))
                    .clickable {
                        coroutineScope.launch { scaffoldState.drawerState.open() }
                    },
                contentScale = ContentScale.Crop,
                contentDescription = stringResource(R.string.top_app_bar_description_icon_profile),
            )
            Image(
                painter = painterResource(id = R.drawable.ic_logo),
                modifier = Modifier.size(22.dp),
                contentDescription = stringResource(id = R.string.top_app_bar_description_icon_logo),
            )
            Image(
                painter = painterResource(id = R.drawable.ic_star_24),
                modifier = Modifier.size(24.dp),
                contentDescription = stringResource(id = R.string.top_app_bar_description_icon_trends),
            )
        }
    }
}