package com.iamageo.jet_twitter.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.iamageo.jet_twitter.R
import com.iamageo.jet_twitter.data.model.User
import com.iamageo.jet_twitter.ui.components.user.UserInfo

@Composable
fun AppDrawer(navController: NavController, user: User) {
    Surface(color = Color.White) {
        Column {
            Column(modifier = Modifier.padding(start = 16.dp, top = 16.dp, end = 16.dp)) {
                Image(
                    painter = painterResource(R.drawable.profile),
                    modifier = Modifier
                        .size(50.dp)
                        .clip(shape = RoundedCornerShape(25.dp))
                        .clickable(
                            onClick = { navController.navigate("profile") }
                        ),
                    contentScale = ContentScale.Crop,
                    contentDescription = stringResource(id = R.string.drawer_description_icon_profile)
                )
                Spacer(modifier = Modifier.size(2.dp))
                UserInfo(
                    user = user,
                    showLogoutButton = true,
                    showBio = false,
                    showAdditionalInfo = false,
                )
                Spacer(modifier = Modifier.size(16.dp))
            }
            Divider()
            Column() {
                DrawerItem(
                    text = stringResource(id = R.string.drawer_profile),
                    icon = R.drawable.ic_profile,
                )
                DrawerItem(
                    text = stringResource(id = R.string.drawer_lists),
                    icon = R.drawable.ic_list,
                )
                DrawerItem(
                    text = stringResource(id = R.string.drawer_topics),
                    icon = R.drawable.ic_topics
                )
                DrawerItem(
                    text = stringResource(id = R.string.drawer_items_saved),
                    icon = R.drawable.ic_bookmark
                )
                DrawerItem(
                    text = "Moments",
                    icon = R.drawable.ic_moments
                )
                Divider()
                DrawerItem(
                    text = "Twitter para Profissionais",
                    icon = R.drawable.ic_rocket
                )
                Divider()
            }

            Column(modifier = Modifier.padding(start = 16.dp, end = 16.dp)) {
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = stringResource(id = R.string.drawer_policy_and_privacy),
                    style = TextStyle(fontSize = 14.sp)
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = stringResource(id = R.string.drawer_help_center),
                    style = TextStyle(fontSize = 14.sp)
                )
            }
            Spacer(modifier = Modifier.weight(weight = 1f))
            Divider()
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .size(40.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                Icon(
                    painterResource(id = R.drawable.ic_theme),
                    "",
                    tint = Color.Black,
                    modifier = Modifier.padding(start = 16.dp)
                )
                Icon(
                    painterResource(id = R.drawable.ic_qrcode),
                    "",
                    tint = Color.Black,
                    modifier = Modifier.padding(end = 16.dp)
                )
            }
        }
    }
}

@Composable
fun DrawerItem(text: String, icon: Int) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp), verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = icon),
            modifier = Modifier.size(20.dp),
            contentDescription = "Drawer $icon"
        )
        Spacer(modifier = Modifier.width(12.dp))
        Text(
            text = text,
            style = TextStyle(fontSize = 14.sp)
        )
    }
}
