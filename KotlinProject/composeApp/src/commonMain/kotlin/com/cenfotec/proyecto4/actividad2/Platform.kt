package com.cenfotec.proyecto4.actividad2

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform