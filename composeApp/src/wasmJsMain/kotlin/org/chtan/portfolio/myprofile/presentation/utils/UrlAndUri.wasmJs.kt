package org.chtan.portfolio.myprofile.presentation.utils

import kotlinx.browser.window

actual fun openLink(url: String) {
    window.open(url, "_blank")
}