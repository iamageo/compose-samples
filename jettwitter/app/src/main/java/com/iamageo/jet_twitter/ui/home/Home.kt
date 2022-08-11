package com.iamageo.jet_twitter.ui.home

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.NavHostController
import kotlinx.coroutines.CoroutineScope


@Composable
fun Home(
    coroutineScope: CoroutineScope,
    scaffoldState: ScaffoldState,
    navController: NavHostController
) {

    Scaffold(
        scaffoldState = scaffoldState,
        floatingActionButton = { Fab() },
        drawerContent = { AppDrawer(navController) },
        bottomBar = { BottomBar() },
        topBar = { TopAppBar(coroutineScope, scaffoldState) }
    ) {

    }
}


