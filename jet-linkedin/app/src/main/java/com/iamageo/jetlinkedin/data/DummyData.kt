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
    )
)

val dummyFeedData: List<LinkedinPost> = listOf(
    LinkedinPost(
        user = dummyUserData[0],
        description = "Este é um post de teste!",
        image = R.drawable.profile_banner,
        likes = 0,
        comments = 0,
        sharings = 0,
        timestamp = 1660680212000
    ),
    LinkedinPost(
        user = dummyUserData[0],
        description = "Estudando Jetpack Compose",
        image = null,
        likes = 5,
        comments = 2,
        sharings = 1,
        timestamp = 1660680212000
    )
)