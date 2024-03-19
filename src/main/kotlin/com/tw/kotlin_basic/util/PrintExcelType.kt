package com.tw.kotlin_basic.util

class PrintExcelType {

    fun getCharacter(number: Int): String {
        var result = ""
        var tmp = number - 1
        while (tmp >= 0) {
            result = 'A'.plus(tmp % 26) + result
            tmp = tmp/26 - 1
        }
        return result
    }
}
