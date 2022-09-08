package com.iamageo.jetlinkedin.ui.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.navigation.NavController
import com.iamageo.jetlinkedin.R
import com.iamageo.jetlinkedin.data.model.LinkedinPost
import com.iamageo.jetlinkedin.ui.theme.Black
import com.iamageo.jetlinkedin.ui.theme.linkedinBlue
import kotlinx.coroutines.CoroutineScope

@Composable
fun FeedItem(
    linkedinPost: LinkedinPost,
    coroutineScope: CoroutineScope,
    navController: NavController
) {
    val constraints = ConstraintSet {
        val postTopBar = createRefFor("post_top_bar")
        val postFollowButton = createRefFor("post_follow_button")
        val postTextAndButton = createRefFor("post_text_and_button")

        constrain(postTopBar) {
            top.linkTo(parent.top)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
        }

        constrain(postFollowButton) {
            top.linkTo(parent.top)
            end.linkTo(parent.end)
        }

        constrain(postTextAndButton) {
            top.linkTo(postTopBar.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
        }

    }

    ConstraintLayout(
        constraints, modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {
        PostTopItem(
            linkedinPost,
            modifier = Modifier.layoutId("post_top_item"),
            coroutineScope,
            navController
        )
        FollowButton(modifier = Modifier.layoutId("post_follow_button"))
        PostTextAndImage(linkedinPost = linkedinPost, modifier = Modifier.layoutId("post_text_and_image"))
    }

}

@Composable
fun PostTopItem(
    linkedinPost: LinkedinPost,
    modifier: Modifier = Modifier,
    coroutineScope: CoroutineScope,
    navController: NavController
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        Image(
            painter = painterResource(id = R.drawable.profile),
            contentDescription = "",
            modifier = Modifier
                .size(40.dp)
                .clip(shape = RoundedCornerShape(25.dp))
                .clickable {
                },
            contentScale = ContentScale.Crop,
        )
        Spacer(modifier = Modifier.size(8.dp))
        Column {
            Column {
                Text(
                    color = Black,
                    text = "${linkedinPost.user.name} • 2º",
                    style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 12.sp)
                )
                Text(
                    color = Color.Gray,
                    text = linkedinPost.user.jobTitle,
                    style = TextStyle(fontWeight = FontWeight.Normal, fontSize = 12.sp)
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    color = Color.Gray,
                    text = "${linkedinPost.timeAgo()} • ",
                    style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 12.sp)
                )
                Icon(
                    painter = painterResource(id = R.drawable.ic_world),
                    contentDescription = "",
                    tint = Color.DarkGray,
                    modifier = Modifier.size(10.dp)
                )
            }
        }

    }
}

@Composable
private fun FollowButton(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_baseline_add),
            contentDescription = "",
            tint = linkedinBlue
        )
        Text(
            text = "Seguir",
            color = linkedinBlue,
            style = TextStyle(fontSize = 12.sp, fontWeight = FontWeight.Bold)
        )
    }
}

@Composable
fun PostTextAndImage(modifier: Modifier = Modifier, linkedinPost: LinkedinPost) {
    Column(modifier = modifier) {
        Text(
            text = linkedinPost.description,
            color = Black,
            style = TextStyle(fontSize = 12.sp)
        )
        if (linkedinPost.image != null) {
            Image(
                painter = painterResource(id = R.drawable.profile_banner),
                contentDescription = ""
            )
        }

    }
}

