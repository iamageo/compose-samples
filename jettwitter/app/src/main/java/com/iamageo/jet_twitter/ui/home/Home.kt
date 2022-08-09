package com.iamageo.jet_twitter.ui.home

import androidx.compose.material.*
import androidx.compose.runtime.Composable


@Composable
fun Home(
    scaffoldState: ScaffoldState = rememberScaffoldState()
) {
    Scaffold(
        scaffoldState = scaffoldState,
        floatingActionButton = { Fab() },
        bottomBar = { BottomBar() },
        topBar = { TopAppBar() }
    ) {

    }
}


