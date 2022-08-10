package com.iamageo.jet_twitter.ui.user

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.iamageo.jet_twitter.R
import com.iamageo.jet_twitter.data.model.User

@Composable
fun UserInfo(user: User) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column() {
            Text(
                text = user.name,
                style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 18.sp)
            )
            Text(text = "@${user.username}", fontSize = 12.sp)
        }
        IconButton(onClick = {}) {
            Image(
                painter = painterResource(id = R.drawable.ic_arrow_down_24),
                modifier = Modifier.size(24.dp),
                contentDescription = "Logout button"
            )
        }
    }

    Spacer(modifier = Modifier.size(8.dp))

    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Text(
            text = "${user.following} ",
            style = TextStyle(fontWeight = FontWeight.Bold)
        )
        Text(
            text = "Seguindo",
            style = TextStyle(fontSize = 14.sp)
        )
        Spacer(modifier = Modifier.size(24.dp))
        Text(
            text = "${user.followers} ",
            style = TextStyle(fontWeight = FontWeight.Bold)
        )
        Text(
            text = "Seguidores",
            style = TextStyle(fontSize = 14.sp)
        )

    }
}
