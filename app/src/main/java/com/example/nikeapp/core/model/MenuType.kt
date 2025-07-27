package com.example.nikeapp.core.model

import androidx.compose.ui.graphics.vector.ImageVector

enum class MenuType {
    SEARCH, PROFILE, CART, MENU
}

data class AppBarMenuItem(
    val type: MenuType,
    val icon: ImageVector,
    val contentDescription: String
)