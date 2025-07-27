package com.example.nikeapp.ui.storeLocator.model

data class Store (
    val name: String,
    val address: String,
    val subAddress: String,
    val isOpen: Boolean,
    val closeTime: String
)