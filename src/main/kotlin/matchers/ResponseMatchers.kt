package org.example.matchers

import org.example.Response

class ResponseMatchers(private val response: Response) {
    fun status(statusMatcher: StatusResponseMatchers.() -> Unit) {
        StatusResponseMatchers(response.code).statusMatcher()
    }

    fun body(bodyMatcher: BodyResponseMatchers.() -> Unit) {
        BodyResponseMatchers(response.body).bodyMatcher()
    }
}