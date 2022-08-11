package com.iamageo.jet_twitter.ui.profile

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AdditionalInfoItem(
    modifier: Modifier = Modifier,
    icon: Int,
    infoTitle: String,
    isUrl: Boolean
) {

    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(painter = painterResource(id = icon), "", tint = Color.Black)
        Text(
            modifier = Modifier.padding(start = 2.dp),
            text = infoTitle,
            style = TextStyle(fontSize = 12.sp, color = if (isUrl) Color.Blue else Color.Gray)
        )
        Spacer(modifier = Modifier.width(8.dp))
    }

}