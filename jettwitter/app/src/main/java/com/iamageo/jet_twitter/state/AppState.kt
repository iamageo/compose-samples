package com.iamageo.jet_twitter.state


sealed class Screen {
    object Home : Screen()
    object Search : Screen()
    object Community : Screen()
    object Notifications : Screen()
    object Dm : Screen()
}

object AppState {
    var currentScreen: Screen = Screen.Home
}

fun navigateTo(destination: Screen) {
    AppState.currentScreen = destination
}

