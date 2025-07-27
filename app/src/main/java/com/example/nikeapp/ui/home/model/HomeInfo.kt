package com.example.nikeapp.ui.home.model

data class HomeInfo (
    val title: String,
    val subTitle: String? = null,
    val description: String,
    val buttonText: String,
    val imageRes: Int
)