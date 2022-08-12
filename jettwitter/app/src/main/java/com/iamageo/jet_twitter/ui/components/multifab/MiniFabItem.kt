package com.iamageo.jet_twitter.ui.components.multifab

import androidx.compose.foundation.layout.*
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.iamageo.jet_twitter.ui.theme.TwitterBlue

@Composable
fun MiniFabItem(
    item: MultiFabItem,
    showLabel: Boolean,
    onFabItemClicked: (item: MultiFabItem) -> Unit
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(end = 12.dp)
    ) {
        if (showLabel) {
            Text(
                item.label,
                fontSize = 12.sp,
                modifier = Modifier
                    .padding(start = 6.dp, end = 6.dp, top = 4.dp, bottom = 4.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
        }
        FloatingActionButton(
            modifier = Modifier.size(40.dp),
            onClick = { onFabItemClicked(item) },
            backgroundColor = Color.White
        ) {
            Icon(
                painter = painterResource(item.icon),
                contentDescription = null,
                tint = TwitterBlue
            )
        }
    }
}