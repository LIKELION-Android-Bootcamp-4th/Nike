package com.example.nikeapp.core.model

data class Product(
    val id: String,
    val name: String,
    val price: Int,
    val image: String,
    val description: String? = null
)