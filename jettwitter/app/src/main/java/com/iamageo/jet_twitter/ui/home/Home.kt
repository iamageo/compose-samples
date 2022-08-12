package com.iamageo.jet_twitter.ui.home

import androidx.compose.material.Scaffold
import androidx.compose.material.ScaffoldState
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import kotlinx.coroutines.CoroutineScope
import com.iamageo.jet_twitter.R
import com.iamageo.jet_twitter.ui.components.multifab.*
import com.iamageo.jet_twitter.ui.theme.TwitterBlue


@Composable
fun Home(
    coroutineScope: CoroutineScope,
    scaffoldState: ScaffoldState,
    navController: NavHostController
) {

    Scaffold(
        scaffoldState = scaffoldState,
        floatingActionButton = {
            MultiFloatingActionButton(
                fabIcon = FabIcon(iconRes = R.drawable.ic_add_24, iconRotate = 0f),
                fabOption = FabOption(
                    iconTint = Color.White,
                    showLabels = true,
                    backgroundTint = TwitterBlue,
                ),
                itemsMultiFab = listOf(
                    MultiFabItem(
                        icon = R.drawable.ic_add_24,
                        label = "Espaços"
                    ),
                    MultiFabItem(
                        icon = R.drawable.ic_image,
                        label = "Fotos"
                    ),
                    MultiFabItem(
                        icon = R.drawable.ic_gif,
                        label = "Gif"
                    ),
                ),
                onFabItemClicked = { println(it) }
            )
        },
        drawerContent = { AppDrawer(navController) },
        bottomBar = { BottomBar() },
        topBar = { TopAppBar(coroutineScope, scaffoldState) }
    ) {

    }
}


