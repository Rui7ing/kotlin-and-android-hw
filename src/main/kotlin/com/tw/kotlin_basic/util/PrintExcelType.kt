package com.tw.kotlin_basic.util

class PrintExcelType {

    fun getCharacter(number: Long): String {
        if (number <= 0) {
            throw IllegalArgumentException("number must be greater than 0")
        }
        if (number >= 26*26*26 + 26*26 + 26) {
            throw IllegalArgumentException("character must be smaller than 'ZZZ'")
        }
        var result = ""
        var tmp = number - 1
        while (tmp >= 0) {
            result = 'A'.plus((tmp % 26).toInt()) + result
            tmp = tmp/26 - 1
        }
        return result
    }
}
