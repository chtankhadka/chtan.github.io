package org.chtan.portfolio.myprofile.presentation.utils

expect fun getWindowHeightWidth(): Pair<Int, Int>
expect fun addResizeListener(onResize: (Pair<Int, Int>) -> Unit)