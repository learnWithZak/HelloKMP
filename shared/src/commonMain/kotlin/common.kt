package com.zak

expect fun platformName(): String

class Greeting {
    fun greeting(): String = "Hello, ${platformName()}"
}