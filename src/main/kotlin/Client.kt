package org.example

class Client {
    fun perform(code: Int, body: String?) = ResponseActions(code, body)
}