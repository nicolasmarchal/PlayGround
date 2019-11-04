package com.app.playground

import android.content.Context
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.rule.ActivityTestRule
import org.junit.Before
import org.junit.Rule


/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    var context: Context? = null

    @Rule
    @JvmField
    val rule = ActivityTestRule<MainActivity>(MainActivity::class.java)

    @Before
    fun init() {
        context = InstrumentationRegistry.getInstrumentation().targetContext
        SharedPrefs.saveCount(context!!, 42)
    }

    @Test
    fun useAppContext() {
        assertEquals("com.app.playground", context?.packageName)
    }

    @Test
    fun getSharedCount() {
        assertEquals(42, SharedPrefs.getCount(context!!))
    }

    @Test
    fun userCanClickButton() {
        onView(withId(R.id.button)).perform(click())
        assertEquals(43, SharedPrefs.getCount(context!!))
    }
}
