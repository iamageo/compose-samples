package com.iamageo.jetlinkedin.ui.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.material.ScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.iamageo.jetlinkedin.data.dummyFeedData
import com.iamageo.jetlinkedin.ui.home.components.FeedItem
import com.iamageo.jetlinkedin.ui.theme.linkedinBackground
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
            AppDrawer()
        },
        topBar = {
            TopBar(coroutineScope = coroutineScope, scaffoldState = scaffoldState)
        },
        bottomBar = {
            BottomBar(backgroundColor = Color.Transparent)
        }
    ) {
        Box(modifier = Modifier.background(color = linkedinBackground)) {
            LazyColumn(
                modifier = Modifier
            )
            {
                items(dummyFeedData.size) { idx ->
                    FeedItem(
                        linkedinPost = dummyFeedData[idx],
                        coroutineScope = coroutineScope,
                        navController = navController
                    )
                }

            }
        }
    }
}