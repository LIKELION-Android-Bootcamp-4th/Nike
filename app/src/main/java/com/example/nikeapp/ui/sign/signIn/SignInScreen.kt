package com.example.nikeapp.ui.sign.signIn

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.nikeapp.core.theme.Typography
import com.example.nikeapp.ui.components.RoundFullButton
import com.example.nikeapp.ui.components.RoundOutlineTextField
import com.example.nikeapp.ui.components.TopBar

@Composable
fun SignInScreen(navController: NavHostController) {
    var email by remember { mutableStateOf("") }

    Column(
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        Text(
            text = "가입 또는 로그인을 위해\n이메일을 입력하세요.",
            color = Color.Black,
            style = Typography.titleLarge
        )

        RoundOutlineTextField(
            value = email,
            onValueChange = { email = it },
            hint = "이메일",
            isFullWidth = true
        )

        Text("계속 진행하면 나이키의 개인정보 처리방침 및 이용약관에 동의하게 됩니다.", color = Color.Gray)

        RoundFullButton(
            text = "계속",
            isFullWidth = false,
            onClick = {navController.navigate("home")}
        )
    }
}