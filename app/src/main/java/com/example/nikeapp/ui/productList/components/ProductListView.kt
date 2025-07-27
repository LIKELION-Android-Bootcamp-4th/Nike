package com.example.nikeapp.ui.productList.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import com.example.nikeapp.core.model.Product
import androidx.compose.material3.Scaffold
import androidx.compose.ui.unit.dp

@Composable
fun ProductListView(
    products: List<Product>,
    onClick: (String) -> Unit
) {
    Scaffold{ paddingValues ->
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(products) { product ->
                ProductCard(product, onClick = {
                    onClick(product.id)
                })
            }
        }
    }
}