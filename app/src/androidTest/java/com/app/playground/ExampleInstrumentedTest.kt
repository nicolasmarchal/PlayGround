package com.app.playground

import android.content.Context
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import android.content.SharedPreferences
import androidx.test.InstrumentationRegistry.getTargetContext
import org.junit.Before


/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    var context: Context? = null

    @Before
    fun init() {
        context = InstrumentationRegistry.getInstrumentation().targetContext
    }


    @Test
    fun useAppContext() {
        assertEquals("com.app.playground", context?.packageName)
    }

    @Test
    fun getSharedCount() {
        SharedPrefs.saveCount(context!!, 42)
        assertEquals(SharedPrefs.getCount(context!!), 42)
    }
}
