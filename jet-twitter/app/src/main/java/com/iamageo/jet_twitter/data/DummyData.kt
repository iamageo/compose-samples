package com.iamageo.jet_twitter

import com.iamageo.jet_twitter.data.model.Tweet
import com.iamageo.jet_twitter.data.model.User
import com.iamageo.jet_twitter.data.model.UserMoreInfo

val dummyUserData: List<User> = listOf(
    User(
        name = "Android Developers",
        username = "AndroidDev",
        avatar = R.drawable.android_dev,
        banner = R.drawable.android_dev_banner,
        bio = "Get the latest Android news, best practices, live videos, demonstrations, tutorials, and more.",
        following = 337,
        followers = 21000,
        verified = true,
        moreInfo = UserMoreInfo(
            "Ingressou em novembro de 2009",
            "https://t.co/slJ5NUkmpk"
        )
    ),
    User(
        name = "geovani 🥦",
        username = "iamageo",
        avatar = R.drawable.profile,
        banner = R.drawable.profile_banner,
        bio = "I love coding!",
        following = 31,
        followers = 33,
        verified = false,
        moreInfo = UserMoreInfo(
            "Ingressou em outubro de 2017",
            "github.com/iamageo"
        )
    )
)

val dummyDataTweet: List<Tweet> = listOf(
    Tweet(
        dummyUserData[0],
        "what are you currently working on? 🚀",
        null,
        495,
        true,
        193,
        false,
        50,
        1660680212000
    ),
    Tweet(
        dummyUserData[1],
        "o jetpack compose é demais! 😍",
        R.drawable.profile_post,
        0,
        false,
        0,
        false,
        0,
        1660680212000
    ),
)