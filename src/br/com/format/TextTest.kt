package br.com.format

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

/**
 * Created by gabriel on 07/04/17.
 */
class TextTest {

    private val text: Text = Text()

    @Test
    fun isAlphanumericWhenIsAlphanumeric() {
        text.value("My 4lph4num3r1c v4lu3")
        assertTrue(text.isAlphanumeric())
    }

    @Test
    fun isAlphanumericWhenIsNotAlphanumeric() {
        text.value("That! is$ not% an# alphanumeric) value(")
        assertFalse(text.isAlphanumeric())
    }

    @Test
    fun isNumericWhenIsNumeric() {
        text.value("012345679")
        assertTrue(text.isNumeric())
    }

    @Test
    fun isNumericWhenIsNotNumeric() {
        text.value("aeiou012345679")
        assertFalse(text.isNumeric())
    }

    @Test
    fun isEmptyWhenIsEmpty() {
        text.value("")
        assertTrue(text.isEmpty())
    }

    @Test
    fun isEmptyWhenIsNotEmpty() {
        text.value("My value")
        assertFalse(text.isEmpty())
    }

    @Test
    fun isOversizedWhenIsNot() {
        text.value("My value").size(10)
        assertFalse(text.isOversized())
    }

    @Test
    fun isOversizedWhenIsOversized() {
        text.value("My value is to long for the size").size(10)
        assertTrue(text.isOversized())
    }

}