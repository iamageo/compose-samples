package com.iamageo.jetlinkedin.ui.home

import androidx.compose.material.Scaffold
import androidx.compose.material.ScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import kotlinx.coroutines.CoroutineScope

@Composable
fun Home(
    navController: NavController,
    scaffoldState: ScaffoldState,
    coroutineScope: CoroutineScope
) {
    Scaffold(
        scaffoldState = scaffoldState,
        drawerContent = {
            AppDrawer(navController = navController)
        },
        topBar = {
            TopBar(coroutineScope = coroutineScope, scaffoldState = scaffoldState)
        },
        bottomBar = {
            BottomBar(backgroundColor = Color.Transparent)
        }
    ) {


    }
}