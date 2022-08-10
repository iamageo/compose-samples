package com.iamageo.jet_twitter.ui.home

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import kotlinx.coroutines.CoroutineScope


@Composable
fun Home(coroutineScope: CoroutineScope, scaffoldState: ScaffoldState) {

    Scaffold(
        scaffoldState = scaffoldState,
        floatingActionButton = { Fab() },
        drawerContent = { AppDrawer() },
        bottomBar = { BottomBar() },
        topBar = { TopAppBar(coroutineScope, scaffoldState) }
    ) {

    }
}


