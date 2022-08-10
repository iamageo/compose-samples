package com.iamageo.jet_twitter.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Divider
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.iamageo.jet_twitter.R
import com.iamageo.jet_twitter.data.model.User
import com.iamageo.jet_twitter.state.AppState
import com.iamageo.jet_twitter.ui.user.UserInfo

@Composable
fun AppDrawer() {
    Surface(color = Color.White) {
        Column {
            Column(modifier = Modifier.padding(start = 16.dp, top = 16.dp, end = 16.dp)) {
                Image(
                    painter = painterResource(R.drawable.profile),
                    modifier = Modifier
                        .size(50.dp)
                        .clip(shape = RoundedCornerShape(25.dp)),
                    contentScale = ContentScale.Crop,
                    contentDescription = "Profile"
                )
                Spacer(modifier = Modifier.size(2.dp))
                UserInfo(user = User(
                    name = "Geovani 🥦",
                    username = "iamageo",
                    avatar = 0,
                    banner = 0,
                    bio = "I love coding!",
                    following = 31,
                    followers = 33,
                    verified = false,
                ))
                Spacer(modifier = Modifier.size(16.dp))
            }
            Divider()
            Column() {
                DrawerItem(
                    text = "Perfil",
                    icon = R.drawable.ic_profile_24,
                )
                DrawerItem(
                    text = "Listas",
                    icon = R.drawable.ic_list_24,
                )
                DrawerItem(
                    text = "Tópicos",
                    icon = R.drawable.ic_topics_24
                )
                DrawerItem(
                    text = "Itens Salvos",
                    icon = R.drawable.ic_bookmark_24
                )
            }
            Divider()
            Column(modifier = Modifier.padding(start = 16.dp, end = 16.dp)) {
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "Configurações e privacidade",
                    style = TextStyle(fontSize = 18.sp)
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "Central de Ajuda",
                    style = TextStyle(fontSize = 18.sp)
                )
            }
            Spacer(modifier = Modifier.weight(weight = 1f))
            Divider()
        }
    }
}

@Composable
fun DrawerItem(text: String, icon: Int) {
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp), verticalAlignment = Alignment.CenterVertically) {
        Image(
            painter = painterResource(id = icon),
            modifier = Modifier.size(24.dp),
            contentDescription = "Drawer $icon"
        )
        Spacer(modifier = Modifier.width(12.dp))
        Text(
            text = text,
            style = TextStyle(fontSize = 14.sp)
        )
    }
}
