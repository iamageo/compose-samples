package com.iamageo.jet_twitter.ui.components.tablayout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.pager.*
import com.iamageo.jet_twitter.theme.TwitterBlue
import kotlinx.coroutines.launch

@ExperimentalPagerApi
@Composable
fun TabLayout(
    modifier: Modifier = Modifier,
    //tabs: @Composable() () -> Unit
) {

    val tabsList = listOf(
        "Tweets",
        "Tweets e respostas",
        "Mídia",
        "Curtidas"
    )
    val pagerState = rememberPagerState(pageCount = tabsList.size)

    Column(
        modifier = modifier.background(Color.White)
    ) {
        Tabs(pagerState = pagerState, tabsList)
        TabsContent(pagerState = pagerState)
    }
}


