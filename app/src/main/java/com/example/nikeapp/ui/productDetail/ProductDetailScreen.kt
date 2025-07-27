package com.example.nikeapp.ui.productDetail

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.nikeapp.core.model.dummy.Dummy
import com.example.nikeapp.ui.components.RoundFullButton
import com.example.nikeapp.ui.components.RoundOutlineButton
import com.example.nikeapp.ui.productDetail.components.ProductImageSlider
import com.example.nikeapp.ui.productDetail.components.SizeSelector

@Composable
fun ProductDetailScreen(productId: String) {
    val product = remember(productId) {
        Dummy.productList.find { it.id == productId }
    }

    product?.let { item ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ) {

            Column(modifier = Modifier.padding(16.dp)) {
                Text(
                    text = item.name,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = item.price.toString(),
                    style = MaterialTheme.typography.titleSmall
                )
            }

            ProductImageSlider(listOf(item.image, item.image))

            Column(modifier = Modifier.padding(16.dp)) {
                Spacer(modifier = Modifier.height(16.dp))

                SizeSelector(Dummy.shoesSize, null, onSizeSelected = {})

                Spacer(modifier = Modifier.height(16.dp))

                RoundFullButton("장바구니 담기", true)
                Spacer(modifier = Modifier.height(8.dp))
                RoundOutlineButton("위시리스트", true)

                Text(
                    text = item.description.toString(),
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(16.dp)
                )
            }

        }
    }

}