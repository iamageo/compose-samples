package com.iamageo.jet_twitter.ui.components.tweet

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
import com.iamageo.jet_twitter.R
import com.iamageo.jet_twitter.data.model.Tweet
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun TweetLayout(
    tweet: Tweet,
    coroutineScope: CoroutineScope,
    navController: NavController
) {
    val constraints = ConstraintSet {
        val tweetImage = createRefFor("tweetImage")
        val tweetOptions = createRefFor("tweetOptions")
        val tweetTextAndImage = createRefFor("tweetTextAndImage")
        val tweetActions = createRefFor("tweetAtions")

        constrain(tweetImage) {
            top.linkTo(parent.top)
            start.linkTo(parent.start)
        }

        constrain(tweetTextAndImage) {
            top.linkTo(tweetImage.top)
            start.linkTo(parent.start)
        }

        constrain(tweetOptions) {
            top.linkTo(parent.top)
            end.linkTo(parent.end)
        }

        constrain(tweetActions) {
            top.linkTo(tweetTextAndImage.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
        }

    }

    ConstraintLayout(
        constraints,
        modifier = Modifier
            .fillMaxSize()
            .padding(all = 10.dp)
    ) {
        TweetAvatarAndInfo(
            tweet,
            modifier = Modifier.layoutId("tweetImage"),
            coroutineScope,
            navController
        )
        TweetAndImage(tweet, modifier = Modifier.layoutId("tweetTextAndImage"))
        TweetOptions(modifier = Modifier.layoutId("tweetOptions"))
        TweetActions(tweet, modifier = Modifier.layoutId("tweetAtions"))
    }
}

@Composable
fun TweetAvatarAndInfo(
    tweet: Tweet,
    modifier: Modifier = Modifier,
    coroutineScope: CoroutineScope,
    navController: NavController
) {
    Row(
        horizontalArrangement = Arrangement.Center,
    ) {
        Image(
            modifier = modifier
                .size(50.dp)
                .clip(shape = RoundedCornerShape(25.dp))
                .clickable {
                    coroutineScope.launch { navController.navigate("profile") }
                },
            painter = painterResource(tweet.user.avatar),
            contentScale = ContentScale.Crop,
            contentDescription = "User tweet image"
        )
            Spacer(modifier = Modifier.size(8.dp))
            Text(
                text = tweet.user.name,
                style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 12.sp)
            )
            Spacer(modifier = Modifier.size(5.dp))
            Text(
                text = "@${tweet.user.username} · ${tweet.timeAgo()}",
                style = TextStyle(fontSize = 12.sp)
            )
    }
}

@Composable
fun TweetOptions(modifier: Modifier = Modifier) {
    Icon(
        modifier = modifier.width(16.dp),
        painter = painterResource(id = R.drawable.ic_more_vert),
        contentDescription = ""
    )
}

@Composable
private fun TweetAndImage(tweet: Tweet, modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(start = 60.dp, top = 16.dp)) {
        Text(
            text = tweet.tweet,
            style = TextStyle(fontSize = 14.sp)
        )
        if (tweet.image != null) {
            Spacer(modifier = Modifier.size(10.dp))
            Image(
                painter = painterResource(tweet.image),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .clip(shape = RoundedCornerShape(4.dp)),
                contentScale = ContentScale.Crop,
                contentDescription = ""
            )
        }
    }
}

@Composable
fun TweetActions(tweet: Tweet, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(start = 60.dp, top = 8.dp, end = 60.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        TweetActionWithText(R.drawable.ic_comment, tweet.comments.toString())
        TweetActionWithText(
            if (tweet.retweeted) R.drawable.ic_retweet_on else R.drawable.ic_retweet,
            tweet.retweets.toString()
        )
        TweetActionWithText(
            if (tweet.liked) R.drawable.ic_like_on else R.drawable.ic_like,
            tweet.likes.toString()
        )
        TweetAction(R.drawable.ic_share)
    }
}

@Composable
fun TweetAction(icon: Int) {
    Row {
        Image(
            painter = painterResource(icon),
            modifier = Modifier.size(16.dp),
            contentDescription = ""
        )
        Spacer(modifier = Modifier.size(4.dp))
    }
}

@Composable
fun TweetActionWithText(icon: Int, content: String) {
    Row {
        Image(
            painter = painterResource(icon),
            modifier = Modifier.size(16.dp),
            contentDescription = ""
        )
        Spacer(modifier = Modifier.size(4.dp))
        Text(text = content, fontSize = 12.sp)
    }
}

