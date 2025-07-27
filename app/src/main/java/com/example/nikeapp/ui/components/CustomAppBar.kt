package com.example.nikeapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.nikeapp.R
import com.example.nikeapp.core.model.AppBarMenuItem
import com.example.nikeapp.core.model.MenuType

val appBarMenuItems = listOf(
    AppBarMenuItem(MenuType.SEARCH, Icons.Default.Search, "검색"),
    AppBarMenuItem(MenuType.PROFILE, Icons.Default.Person, "마이페이지"),
    AppBarMenuItem(MenuType.CART, Icons.Default.ShoppingCart, "장바구니"),
    AppBarMenuItem(MenuType.MENU, Icons.Default.Menu, "메뉴")
)

@Composable
fun CustomAppBar(onClick: (MenuType) -> Unit) {
    Surface(
        color = MaterialTheme.colorScheme.surface
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp, top = 20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_logo),
                contentDescription = "Nike 로고",
                modifier = Modifier
                    .size(76.dp)
            )

            Spacer(modifier = Modifier.weight(1f))

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                appBarMenuItems.forEach { item ->
                    IconButton(onClick = { onClick(item.type) }) {
                        Icon(item.icon, contentDescription = item.contentDescription)
                    }
                }
            }
        }
    }
}

