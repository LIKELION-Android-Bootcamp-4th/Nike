package com.example.nikeapp.ui.storeLocator.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.nikeapp.core.model.dummy.Dummy

@Composable
fun StoreListView() {
    LazyColumn(modifier = Modifier.padding(start = 20.dp)) {
        items(Dummy.stores) { store ->
            StoreCard(store)
            Divider()
        }
    }
}