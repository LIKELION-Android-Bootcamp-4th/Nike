package com.example.nikeapp.ui.productList.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Checkbox
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.RadioButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun FilterSheetContent(
    onDismiss: () -> Unit,
    onApply: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxHeight(0.95f)
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End
        ) {
            IconButton(onClick = onDismiss) {
                Icon(Icons.Default.Close, contentDescription = "닫기")
            }
        }

        Text("필터", style = MaterialTheme.typography.h2)

        Spacer(Modifier.height(12.dp))

        FilterSection(title = "정렬 기준") {
            val options = listOf("추천순", "최신순", "높은 가격순", "낮은 가격순")
            var selected by remember { mutableStateOf(options[1]) }
            options.forEach {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    RadioButton(selected = selected == it, onClick = { selected = it })
                    Text(it)
                }
            }
        }

        Divider()

        FilterSection(title = "성별") {
            val genders = listOf("남성", "여성", "유니섹스")
            val selectedGenders = remember { mutableStateListOf<String>() }
            genders.forEach {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Checkbox(
                        checked = it in selectedGenders,
                        onCheckedChange = { checked ->
                            if (checked) selectedGenders += it else selectedGenders -= it
                        }
                    )
                    Text(it)
                }
            }
        }

        Divider()

        FilterSection(title = "가격대") {
            val ranges = listOf(
                "0 - 50,000 원", "50,000 - 100,000 원", "100,000 - 150,000 원",
                "150,000 - 200,000 원", "200,000 원 +"
            )
            val selectedPrices = remember { mutableStateListOf<String>() }
            ranges.forEach {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Checkbox(
                        checked = it in selectedPrices,
                        onCheckedChange = { checked ->
                            if (checked) selectedPrices += it else selectedPrices -= it
                        }
                    )
                    Text(it)
                }
            }
        }

        Spacer(Modifier.height(24.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            OutlinedButton(onClick = {
            }) {
                Text("지우기")
            }
            Button(onClick = onApply) {
                Text("적용")
            }
        }

        Spacer(Modifier.height(16.dp))
    }
}

@Composable
fun FilterSection(title: String, content: @Composable ColumnScope.() -> Unit) {
    Column(modifier = Modifier.padding(vertical = 12.dp)) {
        Text(title, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(8.dp))
        content()
    }
}