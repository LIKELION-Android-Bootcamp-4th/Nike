package com.example.nikeapp.ui.app

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.nikeapp.ui.scaffold.MainScaffoldContainer
import com.example.nikeapp.ui.productDetail.ProductDetailScreen
import com.example.nikeapp.ui.sign.SignContainer
import com.example.nikeapp.ui.home.HomeScreen
import com.example.nikeapp.ui.productList.ProductListScreen
import com.example.nikeapp.ui.sign.signIn.SignInScreen
import com.example.nikeapp.ui.storeLocator.StoreLocatorScreen

@Composable
fun AppNavHost(
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        startDestination = "home",
    ) {
        composable("signIn") {
            SignContainer {
                SignInScreen(navController)
            }
        }

        composable("home") {
            MainScaffoldContainer(navController) {
                HomeScreen()
            }
        }

        composable("new") {
            MainScaffoldContainer(navController) {
                ProductListScreen(
                    onProductClick = { id ->
                        navController.navigate("productDetail/$id")
                    }
                )
            }
        }

        composable("store_locator") {
            MainScaffoldContainer(navController) {
                StoreLocatorScreen()
            }
        }

        composable(
            route = "productDetail/{productId}",
            arguments = listOf(navArgument("productId") { type = NavType.StringType })
        ) { backStackEntry ->
            val productId = backStackEntry.arguments?.getString("productId") ?: ""
            MainScaffoldContainer(navController) {
                ProductDetailScreen(productId)
            }
        }
    }
}