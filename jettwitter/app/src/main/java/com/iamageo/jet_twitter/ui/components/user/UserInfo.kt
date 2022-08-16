package com.iamageo.jet_twitter.ui.components.user

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.iamageo.jet_twitter.R
import com.iamageo.jet_twitter.data.model.User
import com.iamageo.jet_twitter.ui.profile.AdditionalInfoItem

@Composable
fun UserInfo(user: User, showBio: Boolean, showAdditionalInfo: Boolean, showLogoutButton: Boolean) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column() {
            Text(
                text = user.name,
                style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 16.sp)
            )
            Text(text = "@${user.username}", fontSize = 12.sp)
            if (showBio) {
                Text(
                    modifier = Modifier.padding(vertical = 8.dp),
                    text = user.bio,
                    style = TextStyle(fontSize = 13.sp)
                )
            }
            if (showAdditionalInfo) {
                Row() {
                    AdditionalInfoItem(
                        isUrl = true,
                        icon = R.drawable.ic_link,
                        infoTitle = user.moreInfo.likInProfile
                    )
                    AdditionalInfoItem(
                        isUrl = false,
                        icon = R.drawable.ic_calendar,
                        infoTitle =user.moreInfo.firstLogin
                    )
                }
            }
        }
        if (showLogoutButton) {
            IconButton(onClick = {
                //call bottomsheet here
            }) {
                Image(
                    painter = painterResource(id = R.drawable.ic_arrow_down_24),
                    modifier = Modifier.size(24.dp),
                    contentDescription = "Logout button"
                )
            }
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
            text = stringResource(id = R.string.profile_description_following),
            style = TextStyle(fontSize = 12.sp)
        )
        Spacer(modifier = Modifier.size(24.dp))
        Text(
            text = "${user.followers} ",
            style = TextStyle(fontWeight = FontWeight.Bold)
        )
        Text(
            text = stringResource(id = R.string.profile_description_followers),
            style = TextStyle(fontSize = 12.sp)
        )

    }
}
