package org.roadtocode.secondapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etCelsius: EditText = findViewById(R.id.etCelsius)

        val btnConvert: ImageButton =findViewById(R.id.btnConvert)

        val ans: TextView = findViewById(R.id.ans)

        btnConvert.setOnClickListener{

            val userCel: Int = etCelsius.text.toString().toInt()
            val fn = (userCel* 9/5)+32
            ans.text = fn.toString()

        }

    }
}