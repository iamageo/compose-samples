package com.iamageo.jetlinkedin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.iamageo.jetlinkedin.ui.home.Home
import com.iamageo.jetlinkedin.ui.theme.JetLinkedInTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetLinkedInTheme {
                JetLinkedIn()
            }
        }
    }
}

@Composable
fun JetLinkedIn() {

    val state = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            Home(navController = navController, scaffoldState = state, coroutineScope = scope)
        }
    }
}