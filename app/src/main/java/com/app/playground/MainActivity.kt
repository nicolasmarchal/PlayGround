package com.app.playground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        fun sum(num1: Int, num2: Int): Int {
            return num1 + num2
        }
    }

    private var resultat: Int = 0

    private fun setResult() {
        textViewResult.text = "result: ${resultat}"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        resultat = SharedPrefs.getCount(this)
        setResult()
        button.setOnClickListener {
            resultat = sum(resultat, 1)
            SharedPrefs.saveCount(this, resultat)
            setResult()
        }
    }
}
