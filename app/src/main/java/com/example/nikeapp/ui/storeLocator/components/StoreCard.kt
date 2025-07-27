package com.example.nikeapp.ui.storeLocator.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.nikeapp.ui.storeLocator.model.Store

@Composable
fun StoreCard(item: Store) {
    Card(
        modifier = Modifier
            .padding(vertical = 16.dp)
            .fillMaxWidth(),
        shape = RectangleShape,
        colors = CardDefaults.cardColors(Color.Transparent)
    ) {
        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            Text(item.name, fontWeight = FontWeight.Bold)
            Text(text = item.subAddress, color = Color.Gray)
            Text(text = item.address, color = Color.Gray)
            Row {
                val (text, color) = if (item.isOpen) {
                    "영업 중" to Color.Green
                } else {
                    "영업 종료" to Color.Red
                }
                Text(text = "$text • ", color = color)
                Text(text = item.closeTime)
            }
        }
    }
}