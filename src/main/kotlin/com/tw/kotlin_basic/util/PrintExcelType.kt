package com.tw.kotlin_basic.util

class PrintExcelType {

    fun getCharacter(number: Long): String {
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

    fun getCharacterList(number: Long, count: Int): List<String> {
        if (number <= 0 || count <= 0) {
            throw IllegalArgumentException("parameter must be greater than 0")
        }
        val resultArray = ArrayList<String>()
        var num = 0
        while (num < count) {
            resultArray.add(getCharacter(number + num))
            num++
        }
        return resultArray
    }
}
