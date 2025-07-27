package com.example.nikeapp.ui.storeLocator

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.nikeapp.ui.components.SearchBox
import com.example.nikeapp.ui.components.TopBar
import com.example.nikeapp.ui.storeLocator.components.MapListView

@Composable
fun StoreLocatorScreen() {
    val storeCount: Int = 15

    Column {
        TopBar("나이키 매장 찾기")
        Spacer(modifier = Modifier.height(40.dp))
        SearchBox()
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            "근처 매장: $storeCount 개",
            color = Color.Gray,
            fontSize = 14.sp,
            modifier = Modifier.padding(start = 20.dp)
        )
        Spacer(modifier = Modifier.height(30.dp))
        MapListView()
    }
}