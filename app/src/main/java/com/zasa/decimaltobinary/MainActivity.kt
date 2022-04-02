package com.zasa.decimaltobinary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        calculateButton.setOnClickListener {
            val decimalString : String = decimalNumber.text.toString()
            val decimalStringToInt : Int = Integer.parseInt(decimalString)
            val decimalToBinary = Integer.toBinaryString(decimalStringToInt)

            convertedBinary.text = decimalToBinary
        }
    }

}