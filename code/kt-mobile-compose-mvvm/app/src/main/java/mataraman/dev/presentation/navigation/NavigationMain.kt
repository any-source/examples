package mataraman.dev.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import mataraman.dev.presentation.feature.example.screen.ExampleScreenOne

@Composable
fun NavigationMain(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screen.ExampleOne
    ){
        composable<Screen.ExampleOne> {
            ExampleScreenOne(navController = navController)
        }
    }
}