package com.example.learn_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //text View
//        val textSelector = findViewById<TextView>(R.id.textView)
//
//        textSelector.text = "Hello"

        //Button + event
//        val buttonSelector = findViewById<Button>(R.id.button)

        //thông báo bình thường
//        buttonSelector.setOnClickListener {
//            Toast.makeText(this, "Chào bạn", Toast.LENGTH_SHORT).show()
//        }

        //gọi view khác
//        buttonSelector.setOnClickListener(object : View.OnClickListener{
//            override fun onClick(p0: View?) {
//                TODO("Not yet implemented")
//            }
//        })

        val btnCong = findViewById<Button>(R.id.btnCong)
        val btnTru = findViewById<Button>(R.id.btnTru)
        val btnNhan = findViewById<Button>(R.id.btnNhan)
        val btnChia = findViewById<Button>(R.id.btnChia)

        btnCong.setOnClickListener {
            var num1 = findViewById<EditText>(R.id.sothu1)
            var num2 = findViewById<EditText>(R.id.sothu2)
            var result = findViewById<TextView>(R.id.textketqua)
            var sothu1 : Int = (num1.text.toString()).toInt()
            var sothu2 : Int = (num2.text.toString()).toInt()

            result.text = (sothu1 + sothu2).toString()
        }
        btnTru.setOnClickListener {
            var num1 = findViewById<EditText>(R.id.sothu1)
            var num2 = findViewById<EditText>(R.id.sothu2)
            var result = findViewById<TextView>(R.id.textketqua)
            var sothu1 : Int = (num1.text.toString()).toInt()
            var sothu2 : Int = (num2.text.toString()).toInt()

            result.text = (sothu1 - sothu2).toString()
        }
        btnNhan.setOnClickListener {
            var num1 = findViewById<EditText>(R.id.sothu1)
            var num2 = findViewById<EditText>(R.id.sothu2)
            var result = findViewById<TextView>(R.id.textketqua)
            var sothu1 : Int = (num1.text.toString()).toInt()
            var sothu2 : Int = (num2.text.toString()).toInt()

            result.text = (sothu1 * sothu2).toString()
        }
        btnChia.setOnClickListener {
            var num1 = findViewById<EditText>(R.id.sothu1)
            var num2 = findViewById<EditText>(R.id.sothu2)
            var result = findViewById<TextView>(R.id.textketqua)
            var sothu1 : Int = (num1.text.toString()).toInt()
            var sothu2 : Int = (num2.text.toString()).toInt()

            result.text = (sothu1 / sothu2).toString()
        }
    }
}