package com.example.nikeapp.ui.productList

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.nikeapp.core.model.dummy.Dummy
import com.example.nikeapp.ui.productList.components.ProductCategoryHeader
import com.example.nikeapp.ui.productList.components.FilterSheetContent
import com.example.nikeapp.ui.components.TopBar
import com.example.nikeapp.ui.productList.components.ProductListView
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProductListScreen(
    onProductClick: (String) -> Unit = {}
) {
    val products = Dummy.productList
    val categories = Dummy.categories

    var selectedCategory by remember { mutableStateOf(categories.first()) }

    val sheetState = rememberModalBottomSheetState(skipPartiallyExpanded = true)
    val scope = rememberCoroutineScope()
    var showFilter by remember { mutableStateOf(false) }

    if (showFilter) {
        ModalBottomSheet(
            onDismissRequest = { showFilter = false },
            sheetState = sheetState
        ) {
            FilterSheetContent(
                onDismiss = { showFilter = false },
                onApply = { showFilter = false }
            )
        }
    }

    Column(modifier = Modifier.fillMaxSize()) {
        TopBar("신제품")
        ProductCategoryHeader(
            categories = categories,
            selectedCategory = selectedCategory,
            onCategorySelected = { selectedCategory = it },
            resultCount = products.size,
            onFilterClick = {
                scope.launch { showFilter = true }
            }
        )
        ProductListView(
            products = products,
            onClick = { productId -> onProductClick(productId) }
        )
    }
}