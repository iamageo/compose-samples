package com.iamageo.jet_twitter.ui.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.iamageo.jet_twitter.R
import com.iamageo.jet_twitter.data.model.User

@Composable
fun Banner(modifier: Modifier = Modifier, user: User) {
    Image(
        painterResource(id = user.banner),
        modifier = modifier
            .height(140.dp)
            .fillMaxWidth(),
        contentScale = ContentScale.Crop,
        contentDescription = "Banner do perfil do usuário"
    )
}