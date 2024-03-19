package com.tw.kotlin_basic.util

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PrintExcelTypeTest {

    private val printExcelType = PrintExcelType()

    @Test
    fun getCorrectCharacter() {
        Assertions.assertEquals("A", printExcelType.getCharacter(1))
        Assertions.assertEquals("Z", printExcelType.getCharacter(26))
        Assertions.assertEquals("AA", printExcelType.getCharacter(27))
        Assertions.assertEquals("AB", printExcelType.getCharacter(28))
    }
}
