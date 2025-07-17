package org.chtan.portfolio

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform