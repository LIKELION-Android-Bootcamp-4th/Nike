package com.example.nikeapp.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun RoundOutlineTextField(
    value: String,
    onValueChange: (String) -> Unit,
    isFullWidth: Boolean,
    hint: String = ""
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = Modifier.then(
            if (isFullWidth) Modifier.fillMaxWidth() else Modifier.wrapContentSize()
        ),
        placeholder = {
            Text(text = hint)
        },
        shape = RoundedCornerShape(8.dp),
        singleLine = true
    )
}