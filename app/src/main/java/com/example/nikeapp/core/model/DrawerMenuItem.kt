package com.example.nikeapp.core.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector

sealed class DrawerMenuItem(
    val title: String,
    val route: String? = null,
    val icon: ImageVector? = null
) {
    object New : DrawerMenuItem("New & Featured", "new")
    object Men : DrawerMenuItem("Men", "men")
    object Women : DrawerMenuItem("Women", "women")
    object Kids : DrawerMenuItem("Kids", "kids")
    object Sale : DrawerMenuItem("Sale", "sale")

    object CustomerService : DrawerMenuItem("고객센터", "customer_service", Icons.Default.Info)
    object Cart : DrawerMenuItem("장바구니", "cart", Icons.Default.ShoppingCart)
    object Orders : DrawerMenuItem("주문", "orders", Icons.Default.AccountBox)
    object StoreLocator : DrawerMenuItem("매장 찾기", "store_locator", Icons.Default.LocationOn)

    companion object {
        val mainItems = listOf(New, Men, Women, Kids, Sale)
        val supportItems = listOf(CustomerService, Cart, Orders, StoreLocator)
    }
}