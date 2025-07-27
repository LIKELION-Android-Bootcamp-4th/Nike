package com.example.nikeapp.ui.productDetail.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color

@Composable
fun SizeSelector(
    sizes: List<Int>,
    selectedSize: Int?,
    onSizeSelected: (Int) -> Unit,
    disabledSizes: List<Int> = emptyList()
) {

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
        ) {
        Text("사이즈 선택")

        TextButton(
            onClick = {},
            colors = ButtonDefaults.textButtonColors(
                contentColor = Color.Gray
            )
        ) {
            Text("사이즈 가이드")
        }
    }

    LazyVerticalGrid(
        columns = GridCells.Fixed(5),
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(max = 200.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(sizes) { size ->
            val isSelected = size == selectedSize
            val isEnabled = size !in disabledSizes

            Box(
                modifier = Modifier
                    .size(40.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(
                        when {
                            !isEnabled -> Color.LightGray
                            isSelected -> Color.Black
                            else -> Color.White
                        }
                    )
                    .border(
                        width = 1.dp,
                        color = if (isSelected) Color.Black else Color.Gray,
                        shape = RoundedCornerShape(8.dp)
                    )
                    .clickable(
                        enabled = isEnabled
                    ) {
                        onSizeSelected(size)
                    },
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = size.toString(),
                    color = if (isSelected) Color.White else Color.Black
                )
            }
        }
    }
}