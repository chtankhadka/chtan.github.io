package org.chtan.portfolio.app

import androidx.compose.runtime.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import org.chtan.portfolio.myprofile.presentation.dashboard.DashboardScreen
import org.chtan.portfolio.myprofile.presentation.theme.PortfolioTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    PortfolioTheme {
        var showContent by remember { mutableStateOf(false) }
        var navController = rememberNavController()


        NavHost(
            navController = navController,
            startDestination = "dashboard"){
            composable("dashboard"){
                DashboardScreen(navController)
            }


        }
        DashboardScreen(navController)
      //  home()
//        Column(
//            modifier = Modifier
//                .safeContentPadding()
//                .fillMaxSize(),
//            horizontalAlignment = Alignment.CenterHorizontally,
//        ) {
//            LottieCard(modifier = Modifier, filePath = "files/cleaning.lottie")
//        }
    }
}