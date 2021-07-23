package com.example.temperatureconverter

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val celNumber = findViewById<EditText>(R.id.editTextNumber3)
        val fahNumber = findViewById<EditText>(R.id.editTextNumber4)
        val button1 = findViewById<Button>(R.id.button)
        val button2 = findViewById<Button>(R.id.button2)
        val c2FAnswer = findViewById<TextView>(R.id.editTextNumber4)
        val f2CAnswer = findViewById<TextView>(R.id.editTextNumber3)

        button1.setOnClickListener {
            if (celNumber.length() > 0 && fahNumber.length() == 0) {
                val c = celNumber.text.toString().toFloat()
                val c2F = (c * 9 / 5) + 32
                c2FAnswer.text = c2F.toString()
            } else if (fahNumber.length() > 0 && celNumber.length() == 0) {
                val f = fahNumber.text.toString().toFloat()
                val f2C = (f - 32) * 5 / 9
                f2CAnswer.text = f2C.toString()
            }
        }

        // reset button
        button2.setOnClickListener {
            celNumber.setText("")
            c2FAnswer.text = ("")
            fahNumber.setText("")
            f2CAnswer.text = ("")
        }

    }
}











