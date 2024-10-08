package org.example.exception

sealed class ResponseMatchersException(message: String) : RuntimeException(message)