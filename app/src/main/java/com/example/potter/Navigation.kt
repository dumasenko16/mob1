package com.example.potter

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.potter.ui.info.InfoScreen
import com.example.potter.ui.home.HomeScreen

sealed class Screen(val route: String, val title: String, val icon: ImageVector) {
    object Home : Screen(
        "home_screen",
        "Главная страница",
        Icons.Default.Home
    )
    object Info : Screen(
        "info_screen",
        "Информвция",
        Icons.Default.Home
    )
}
@Composable
fun BottomNavHost(navHostController: NavHostController){
    NavHost(
        navController = navHostController,
        startDestination = Screen.Info.route
    ){
        composable(route = Screen.Home.route)
        {
            HomeScreen()
        }
        composable(route = Screen.Info.route)
        {
            InfoScreen()
        }
    }}


