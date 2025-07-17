package org.chtan.portfolio.myprofile.presentation.utils

import kotlinx.browser.window
import kotlinx.coroutines.flow.Flow

actual fun getWindowHeightWidth():  Pair<Int, Int> {
    return (window.innerWidth to window.innerHeight)
}

actual fun addResizeListener(onResize: (Pair<Int, Int>) -> Unit) {
    window.addEventListener("resize", { event ->
        onResize(window.innerWidth to window.innerHeight)
    })}