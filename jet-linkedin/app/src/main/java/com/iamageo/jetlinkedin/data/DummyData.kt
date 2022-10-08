package com.iamageo.jetlinkedin.data

import com.iamageo.jetlinkedin.R
import com.iamageo.jetlinkedin.data.model.LinkedinPost
import com.iamageo.jetlinkedin.data.model.User

val dummyUserData: List<User> = listOf(
    User(
        name = "Geovani Amaral",
        jobTitle = "Desenvolvedor Android",
        avatar = R.drawable.profile,
        banner = R.drawable.profile_banner,
    ),
    User(
        name = "Android Developers",
        jobTitle = "54.714 seguidores",
        avatar = R.drawable.android_developers_profile,
        banner = R.drawable.profile_banner,
    )
)

val dummyFeedData: List<LinkedinPost> = listOf(
    LinkedinPost(
        user = dummyUserData[1],
        description = "\uD83C\uDF89 #AndroidDevSummit is back, and this year we're coming to you ...",
        image = R.drawable.android_developers_post,
        likes = 350,
        comments = 3,
        sharings = 36,
        timestamp = 1665078680
    ),
    LinkedinPost(
        user = dummyUserData[1],
        description = "Guia para modularização de Apps Android.",
        image = null,
        likes = 5,
        comments = 2,
        sharings = 1,
        timestamp = 1665078680
    )
)