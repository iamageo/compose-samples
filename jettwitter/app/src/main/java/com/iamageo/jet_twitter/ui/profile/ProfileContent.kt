package com.iamageo.jet_twitter.ui.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.iamageo.jet_twitter.data.model.User
import com.iamageo.jet_twitter.ui.components.user.UserInfo

@Composable
fun ProfileContent(modifier: Modifier = Modifier, user: User) {
    Column(modifier = modifier) {
        Column(modifier = Modifier.padding(start = 16.dp, end = 16.dp)) {
            Spacer(modifier = Modifier.size(16.dp))
            UserInfo(
                user = user,
                showLogoutButton = false,
                showBio = true,
                showAdditionalInfo = true
            )
            Spacer(modifier = Modifier.size(16.dp))
        }
    }
}