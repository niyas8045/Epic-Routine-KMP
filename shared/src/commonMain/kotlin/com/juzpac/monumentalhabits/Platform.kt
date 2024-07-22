package com.juzpac.monumentalhabits

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform