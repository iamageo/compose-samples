package com.iamageo.jet_twitter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.iamageo.jet_twitter.data.model.User
import com.iamageo.jet_twitter.data.model.UserMoreInfo
import com.iamageo.jet_twitter.ui.home.Home
import com.iamageo.jet_twitter.ui.profile.Profile
import com.iamageo.jet_twitter.theme.JettwitterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            JettwitterTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.onPrimary
                ) {
                    JetTwitterAppContent()
                }
            }

        }
    }

}

@Composable
fun JetTwitterAppContent() {
    val state = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    val navController = rememberNavController()

    val user = User(
        name = "geovani 🥦",
        username = "iamageo",
        avatar = R.drawable.profile,
        banner =R.drawable.profile_banner,
        bio = "24y | Android Developer | Computer Engineer | Kotlin & Flutter",
        following = 31,
        followers = 33,
        verified = false,
        moreInfo = UserMoreInfo(
            "Ingressou em outubro de 2017",
            "github.com/iamageo"
        )
    )

    NavHost(navController = navController, startDestination = "home"){
            composable("home") {
                Home(scope, state, navController, user)
            }
            composable("profile") {
                Profile(navController, user)
            }
    }

}
