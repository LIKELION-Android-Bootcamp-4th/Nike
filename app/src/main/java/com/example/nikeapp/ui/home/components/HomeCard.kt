package com.example.nikeapp.ui.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.nikeapp.core.theme.Typography
import com.example.nikeapp.ui.home.model.HomeInfo

@Composable
fun HomeCard(item: HomeInfo) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 10.dp, bottom = 20.dp),
        shape = RectangleShape,
        colors = CardDefaults.cardColors(Color.White)
    ) {
        Column {
            Image(
                painter = painterResource(id = item.imageRes),
                contentDescription = item.title,
                modifier = Modifier
                    .fillMaxWidth(),
                contentScale = ContentScale.Crop
            )

            item.subTitle?.let {
                Text(
                    text = item.subTitle,
                    modifier = Modifier.padding(8.dp),
                    style = Typography.titleMedium
                )
            }

            Text(
                text = item.title,
                modifier = Modifier.padding(8.dp),
                style = Typography.titleLarge
            )

            Text(
                text = item.description,
                modifier = Modifier.padding(8.dp),
                style = Typography.titleMedium
            )

            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(Color.Black)
            ) {
                Text(item.buttonText)
            }
        }
    }
}
