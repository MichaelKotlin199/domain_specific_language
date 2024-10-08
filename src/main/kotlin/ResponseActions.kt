package org.example

import org.example.matchers.ResponseMatchers

class ResponseActions(code: Int, body: String?) {
    var response = Response(code, body)

    fun andDo(f: Function1<Response, Unit>) : ResponseActions {
        f(response)
        return this
    }

    fun andExpect(expectations: ResponseMatchers.() -> Unit) : ResponseActions {
        ResponseMatchers(response).expectations()
        return this
    }
}