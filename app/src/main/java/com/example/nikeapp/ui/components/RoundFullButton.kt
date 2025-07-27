package com.example.nikeapp.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun RoundFullButton(text: String, isFullWidth: Boolean, onClick: () -> Unit = {}) {

    Button(
        onClick = onClick,
        modifier = Modifier.then(
            if (isFullWidth) Modifier.fillMaxWidth() else Modifier.wrapContentSize()
        ),
        colors = ButtonDefaults.buttonColors(Color.Black)
    ) {
        Text(text)
    }
}
