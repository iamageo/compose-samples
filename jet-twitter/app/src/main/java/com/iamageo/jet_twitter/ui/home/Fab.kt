package com.iamageo.jet_twitter.ui.home

import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.iamageo.jet_twitter.R
import com.iamageo.jet_twitter.theme.TwitterBlue

@Composable
fun Fab() {
    FloatingActionButton(
        backgroundColor = TwitterBlue,
        onClick = { },
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_pen),
            contentDescription = stringResource(id = R.string.fab_icon),
        )
    }
}