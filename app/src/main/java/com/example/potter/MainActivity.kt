package com.example.potter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.potter.ui.theme.BottomNavigationTheme

import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val listItems = listOf(
                Screen.Home,
                Screen.Info,
            )
            val navController = rememberNavController()
            BottomNavigationTheme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background

                ) {
                    Scaffold(bottomBar = {
                        BottomNavigationScreen(navController = navController, items =listItems)
                    }) {
                        BottomNavHost(navHostController = navController)
                    }



                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BottomNavigationTheme {
        Greeting("Android")
    }
}
@Composable
fun BottomNavigationScreen(navController: NavController, items: List<Screen>){
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination
    BottomNavigation() {
        items.forEach{ screen ->
            BottomNavigationItem(
                selected = currentDestination?.route ==screen.route,
                onClick = {
                    navController.navigate(screen.route)
                },
                icon = {},
                label = {Text(text = screen.title)})
        }
    }

}



