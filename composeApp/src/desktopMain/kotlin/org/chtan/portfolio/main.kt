package org.chtan.portfolio

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import org.chtan.portfolio.app.App

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "portfolio",
    ) {
        App()
    }
}