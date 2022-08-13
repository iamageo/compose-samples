package com.iamageo.jet_twitter.ui.components.tablayout

import androidx.compose.runtime.Composable
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState

@ExperimentalPagerApi
@Composable
fun TabsContent(pagerState: PagerState) {

    HorizontalPager(state = pagerState) { page ->
        when (page) {
            0 -> TabContentScreen(data = "tweets")
            1 -> TabContentScreen(data = "tweets e respostas")
            2 -> TabContentScreen(data = "mídia")
            3 -> TabContentScreen(data = "curtidas")
        }
    }
}