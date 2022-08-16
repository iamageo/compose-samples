package com.iamageo.jet_twitter.ui.home

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Divider
import androidx.compose.material.Scaffold
import androidx.compose.material.ScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.iamageo.jet_twitter.R
import com.iamageo.jet_twitter.data.model.User
import com.iamageo.jet_twitter.dummyDataTweet
import com.iamageo.jet_twitter.theme.TwitterBlue
import com.iamageo.jet_twitter.ui.components.multifab.FabIcon
import com.iamageo.jet_twitter.ui.components.multifab.FabOption
import com.iamageo.jet_twitter.ui.components.multifab.MultiFabItem
import com.iamageo.jet_twitter.ui.components.multifab.MultiFloatingActionButton
import com.iamageo.jet_twitter.ui.components.tweet.TweetLayout
import kotlinx.coroutines.CoroutineScope


@Composable
fun Home(
    coroutineScope: CoroutineScope,
    scaffoldState: ScaffoldState,
    navController: NavHostController,
    user: User
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
        drawerContent = { AppDrawer(navController, user) },
        bottomBar = { BottomBar() },
        topBar = { TopAppBar(coroutineScope, scaffoldState) },
    ) {
        LazyColumn(
            modifier = Modifier.padding(bottom = 50.dp)
        ) {

            items(dummyDataTweet.size) { index ->
                TweetLayout(tweet = dummyDataTweet[index], coroutineScope, navController)
                Divider()
            }

        }
    }
}


