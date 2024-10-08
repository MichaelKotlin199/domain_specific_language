package org.example.matchers

import org.example.exception.StatusResponseMatchersException

class StatusResponseMatchers(private val code: Int) {
    fun isOk() {
        if (code != 200) throw StatusResponseMatchersException("Expected status 200, but got $code")
    }

    fun isBadRequest() {
        if (code != 400) throw StatusResponseMatchersException("Expected status 400, but got $code")
    }

    fun isInternalServerError() {
        if (code != 500) throw StatusResponseMatchersException("Expected status 500, but got $code")
    }
}