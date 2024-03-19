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

    @Test
    fun `(1, 1) = A`() {
        Assertions.assertEquals(listOf("A"), printExcelType.getCharacterList(1, 1))
    }

    @Test
    fun `(1, 2) = A, B`() {
        Assertions.assertEquals(listOf("A", "B"), printExcelType.getCharacterList(1, 2))
    }

    @Test
    fun `(26, 3) = Z, AA, AB`() {
        Assertions.assertEquals(listOf("Z", "AA", "AB"), printExcelType.getCharacterList(26, 3))
    }


    @Test
    fun `throw exception if parameter is zero`() {
        Assertions.assertThrows(IllegalArgumentException::class.java) {
            printExcelType.getCharacterList(0, 1)
        }
        Assertions.assertThrows(IllegalArgumentException::class.java) {
            printExcelType.getCharacterList(1, 0)
        }
    }

    @Test
    fun `throw exception if character is large than ZZZ`() {
        Assertions.assertThrows(IllegalArgumentException::class.java) {
            printExcelType.getCharacter(26*26*26+26*26+26)
        }
    }
}
