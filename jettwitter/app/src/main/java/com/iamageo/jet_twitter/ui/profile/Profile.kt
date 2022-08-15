package com.iamageo.jet_twitter.ui.profile

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.navigation.NavController
import com.google.accompanist.pager.ExperimentalPagerApi
import com.iamageo.jet_twitter.data.model.User
import com.iamageo.jet_twitter.ui.components.tablayout.TabLayout

@OptIn(ExperimentalPagerApi::class)
@Composable
fun Profile(navController: NavController, user: User) {
    val constraints = ConstraintSet {
        val profileBanner = createRefFor("profile_banner")
        val profileTopBar = createRefFor("profile_top_bar")
        val profileAvatar = createRefFor("profile_avatar")
        val profileUserContent = createRefFor("profile_user_content")
        val tabLayout = createRefFor("tablayout")
        val profileButton = createRefFor("profile_button")

        constrain(profileBanner) {
            top.linkTo(parent.top)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
        }

        constrain(profileTopBar) {
            top.linkTo(profileBanner.top)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
        }

        constrain(profileAvatar) {
            top.linkTo(profileBanner.bottom)
            start.linkTo(profileBanner.start)
            bottom.linkTo(profileBanner.bottom)
        }

        constrain(profileUserContent) {
            top.linkTo(profileAvatar.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
        }

        constrain(tabLayout) {
            top.linkTo(profileUserContent.bottom)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
        }

        constrain(profileButton) {
            top.linkTo(profileBanner.bottom)
            end.linkTo(parent.end)
        }


    }
    ConstraintLayout(
        constraints,
        modifier = Modifier.fillMaxSize()
    ) {

        Banner(modifier = Modifier.layoutId("profile_banner"), user)
        ProfileTopBar(
            navController = navController,
            modifier = Modifier.layoutId("profile_top_bar")
        )
        ProfileAvatar(
            modifier = Modifier
                .layoutId("profile_avatar")
                .padding(horizontal = 16.dp, vertical = 0.dp)
        )
        ProfileButton(modifier = Modifier.layoutId("profile_button"), isMyProfile = true)
        ProfileContent(
            modifier = Modifier.layoutId("profile_user_content"),
            user = user
        )
        TabLayout(modifier = Modifier.layoutId("tablayout"))

    }

}
