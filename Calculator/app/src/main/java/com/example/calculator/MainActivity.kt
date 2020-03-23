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

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.btn0.setOnClickListener{btnClick(it)
        binding.btn1.setOnClickListener{btnClick(it)}
        binding.btn2.setOnClickListener{btnClick(it)}
        binding.btn3.setOnClickListener{btnClick(it)}
        binding.btn4.setOnClickListener{btnClick(it)}
        binding.btn5.setOnClickListener{btnClick(it)}
        binding.btn6.setOnClickListener{btnClick(it)}
        binding.btn7.setOnClickListener{btnClick(it)}
        binding.btn8.setOnClickListener{btnClick(it)}
        binding.btn9.setOnClickListener{btnClick(it)}

    }

    fun btnClick(view: View){

        when(view.id){
            binding.btn0.id -> {
                binding.etxResult.setText("0")
            }
            binding.btn1.id -> {
                binding.etxResult.setText("1")
            }
            binding.btn2.id -> {
                binding.etxResult.setText("2")
            }
            binding.btn3.id -> {
                binding.etxResult.setText("3")
            }
            binding.btn4.id -> {
                binding.etxResult.setText("4")
            }
            binding.btn5.id -> {
                binding.etxResult.setText("5")
            }
            binding.btn6.id -> {
                binding.etxResult.setText("6")
            }
            binding.btn7.id -> {
                binding.etxResult.setText("7")
            }
            binding.btn8.id -> {
                binding.etxResult.setText("8")
            }
            binding.btn9.id -> {
                binding.etxResult.setText("9")
            }

        }

    }
}
