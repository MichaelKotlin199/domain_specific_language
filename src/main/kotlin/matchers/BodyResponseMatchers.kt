package org.example.matchers

import org.example.exception.BodyResponseMatchersException

class BodyResponseMatchers(private val body: String?) {
    fun isNull() {
        if (body != null) throw BodyResponseMatchersException("Expected body to be null, but got $body")
    }

    fun isNotNull() {
        if (body == null) throw BodyResponseMatchersException("Expected body to be not null, but got null")
    }
}