package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners(){
        val clickableViews: List<View> = listOf(box_one_text, box_two_text, box_three_text, box_four_text,
            box_five_text, box_six_text, constrained_layout , left_button, center_button, right_button)

        for(item in clickableViews){

            item.setOnClickListener{makeColored(it)}
        }

    }

    private fun makeColored(v: View){

        when(v.id){
            R.id.box_one_text -> v.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> v.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> v.setBackgroundResource(android.R.color.holo_blue_bright)
            R.id.box_four_text -> v.setBackgroundResource(android.R.color.holo_orange_light)
            R.id.box_five_text -> v.setBackgroundResource(android.R.color.holo_red_dark)
            R.id.box_six_text -> v.setBackgroundResource(android.R.color.holo_purple)
            R.id.center_button -> v.setBackgroundResource(android.R.color.black)
            else -> v.setBackgroundColor(Color.LTGRAY)
        }
    }
}
