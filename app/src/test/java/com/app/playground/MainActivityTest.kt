package com.app.playground

import org.junit.Assert.*
import org.junit.Test

class MainActivityTest {
    @Test
    fun sum_isCorrect() {
        assertEquals(MainActivity.sum(1, 1), 2)
    }
}