package com.example.nikeapp.ui.app

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NikeApp() {
    val navController = rememberNavController()
    AppNavHost(navController = navController)
}