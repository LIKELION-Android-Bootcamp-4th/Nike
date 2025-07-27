package com.example.nikeapp.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun RoundOutlineButton(text: String, isFullWidth: Boolean, onClick: () -> Unit = {}){
    OutlinedButton(
        onClick = onClick,
        modifier = Modifier.then(
            if (isFullWidth) Modifier.fillMaxWidth() else Modifier.wrapContentSize()
        ),
        shape = CircleShape
    ) {
        Text(text)
    }
}