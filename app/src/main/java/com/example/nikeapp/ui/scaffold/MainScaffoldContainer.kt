package com.example.nikeapp.ui.scaffold

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.nikeapp.core.model.MenuType
import com.example.nikeapp.ui.components.CustomAppBar
import com.example.nikeapp.ui.components.DrawerContent
import kotlinx.coroutines.launch

@Composable
fun MainScaffoldContainer(
    navController: NavController,
    content: @Composable () -> Unit
) {
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val scope = rememberCoroutineScope()

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            DrawerContent(
                onItemClick = { menuItem ->
                    scope.launch { drawerState.close() }
                    menuItem.route?.let { route ->
                        navController.navigate(route)
                    }
                },
                onSignInClick = {
                    scope.launch { drawerState.close() }
                    navController.navigate("signIn")
                },
                onSignUpClick = {
                    scope.launch { drawerState.close() }
                    navController.navigate("signUp")
                },
                onDismiss = {
                    scope.launch { drawerState.close() }
                }
            )
        }
    ) {
        Scaffold(
            topBar = {
                CustomAppBar { type ->
                    if (type == MenuType.MENU) {
                        scope.launch { drawerState.open() }
                    }
                }
            }
        ) { paddingValues ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
            ) {
                content()
            }
        }
    }
}