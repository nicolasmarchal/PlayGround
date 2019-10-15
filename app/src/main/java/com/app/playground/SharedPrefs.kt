package com.app.playground

import android.content.Context

object SharedPrefs {
    private const val FILE = "prefs"
    private const val COUNT = "info"

    public fun saveCount(context: Context, count: Int) {
        val sharedPreferences = context.getSharedPreferences(FILE, Context.MODE_PRIVATE)
        sharedPreferences.edit().putInt(COUNT, count).apply()
    }

    public fun getCount(context: Context): Int {
        return context.getSharedPreferences(FILE, Context.MODE_PRIVATE).getInt(COUNT, 0)
    }
}