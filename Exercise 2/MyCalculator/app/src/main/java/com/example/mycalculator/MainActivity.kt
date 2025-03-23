package com.example.mycalculator

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var Text1 = findViewById<EditText>(R.id.input1)
        var Text2 = findViewById<EditText>(R.id.input2)
        var editText3 = findViewById<EditText>(R.id.output1)
        var button_add = findViewById<Button>(R.id.add)
        var button_sub = findViewById<Button>(R.id.sub)
        var button_mul = findViewById<Button>(R.id.mul)
        var button_div = findViewById<Button>(R.id.div)
        var input1 : String = Text1.text.toString()
        var input2 : String = Text2.text.toString()

        button_add.setOnClickListener(){
            var button_result_add = input1.toInt() + input2.toInt()
            editText3.setText(button_result_add.toString())
            Toast.makeText(this, "Addition Successful", Toast.LENGTH_SHORT).show()
        }
        button_sub.setOnClickListener(){
            var button_result_sub = input1.toInt() - input2.toInt()
            editText3.setText(button_result_sub.toString())
            Toast.makeText(this, "Subtraction Successful", Toast.LENGTH_SHORT).show()
        }
        button_mul.setOnClickListener(){
            var button_result_mul = input1.toInt() * input2.toInt()
            editText3.setText(button_result_mul.toString())
            Toast.makeText(this, "Multiplication Successful", Toast.LENGTH_SHORT).show()
        }
        button_add.setOnClickListener(){
            var button_result_div = input1.toInt() / input2.toInt()
            editText3.setText(button_result_div.toString())
            Toast.makeText(this, "Division Successful", Toast.LENGTH_SHORT).show()
        }
        button_add.setOnClickListener(){
            var button_result_mod = input1.toInt() % input2.toInt()
            editText3.setText(button_result_mod.toString())
            Toast.makeText(this, "Modulus Successful", Toast.LENGTH_SHORT).show()
        }
    }
}