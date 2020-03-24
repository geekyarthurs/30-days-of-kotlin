package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.calculator.databinding.ActivityMainBinding

//import androidx.databinding.DataBindingUtil
//import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var operation : String = ""
    private var value1: Double = 0.0
    private var value2: Double = 0.0
    private var finalResult: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btn0.setOnClickListener { it ->
            btnClick(it)
        }
            binding.btn1.setOnClickListener { btnClick(it) }
            binding.btn2.setOnClickListener { btnClick(it) }
            binding.btn3.setOnClickListener { btnClick(it) }
            binding.btn4.setOnClickListener { btnClick(it) }
            binding.btn5.setOnClickListener { btnClick(it) }
            binding.btn6.setOnClickListener { btnClick(it) }
            binding.btn7.setOnClickListener { btnClick(it) }
            binding.btn8.setOnClickListener { btnClick(it) }
            binding.btn9.setOnClickListener { btnClick(it) }
            binding.btnDot.setOnClickListener { btnClick(it)}

            binding.btnMul.setOnClickListener{ btnMaths(it)}
            binding.btnPlus.setOnClickListener{ btnMaths(it)}
            binding.btnSub.setOnClickListener{ btnMaths(it)}
            binding.btnDiv.setOnClickListener{ btnMaths(it)}

            binding.btnEquals.setOnClickListener{ btnEqual(it) }
            binding.btnClear.setOnClickListener{binding.etxResult.setText("")}
            binding.btnDelete.setOnClickListener{ btnDelete(it)}


    }



        fun btnDelete(view: View){
            var current = binding.etxResult.text.toString()
            if(current.isNotEmpty()) binding.etxResult.setText(current.substring(0,current.length - 1))
        }

        fun btnClick(view: View) {

            var value = binding.etxResult.text.toString()

            when (view.id) {
                binding.btn0.id -> {
                    value += "0"
                }
                binding.btn1.id -> {
                    value += "1"
                }
                binding.btn2.id -> {
                    value += "2"
                }
                binding.btn3.id -> {
                    value += "3"
                }
                binding.btn4.id -> {
                    value += "4"
                }
                binding.btn5.id -> {
                    value += "5"
                }
                binding.btn6.id -> {
                    value += "6"
                }
                binding.btn7.id -> {
                    value += "7"
                }
                binding.btn8.id -> {
                    value += "8"
                }
                binding.btn9.id -> {
                    value += "9"
                }

                binding.btnDot.id -> {
                    value += "."
                }
            }

            binding.etxResult.setText(value)

        }

        fun btnMaths(view : View) {
            when(view.id){
                binding.btnMul.id -> { operation = "*" }
                binding.btnDiv.id -> { operation = "/"}
                binding.btnPlus.id -> { operation = "+"}
                binding.btnSub.id -> { operation = "-"}
            }
            value1 =  binding.etxResult.text.toString().toDouble()
            binding.etxResult.setText("")

        }

        fun btnEqual(view: View){
            value2  = binding.etxResult.text.toString().toDouble()

            when(operation){
                "+" -> finalResult = value1 + value2
                "-" -> finalResult = value1 - value2
                "*" -> finalResult = value1 * value2
                "/" -> finalResult = value1 / value2
            }

            binding.etxResult.setText(String.format("%.2f", finalResult))

        }
    }


