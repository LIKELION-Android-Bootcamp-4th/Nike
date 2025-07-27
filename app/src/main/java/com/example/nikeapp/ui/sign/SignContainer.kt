package com.example.nikeapp.ui.sign

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.nikeapp.R

@Composable
fun SignContainer(content: @Composable () -> Unit) {
    Column(modifier = Modifier.padding(16.dp)){
        Image(
            painter = painterResource(id = R.drawable.ic_logo),
            contentDescription = "Nike Logo",
            modifier = Modifier
                .size(100.dp)
                .padding(top = 24.dp, bottom = 24.dp)
        )
        content()
    }
}