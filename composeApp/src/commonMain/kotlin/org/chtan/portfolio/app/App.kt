package org.chtan.portfolio.app

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import coil3.compose.AsyncImage
import org.chtan.portfolio.Greeting
import org.chtan.portfolio.myprofile.presentation.dashboard.Dashboard
import org.chtan.portfolio.myprofile.presentation.dashboard.home.home
import org.chtan.portfolio.myprofile.presentation.theme.PortfolioTheme
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import portfolio.composeapp.generated.resources.Res
import portfolio.composeapp.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {
    PortfolioTheme {
        var showContent by remember { mutableStateOf(false) }
        Dashboard()
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