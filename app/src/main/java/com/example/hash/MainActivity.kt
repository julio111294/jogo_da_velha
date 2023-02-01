package com.example.hash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var isplayer1 = true
    var gamend = false
    private lateinit var one:ImageView
    private lateinit var two:ImageView
    private lateinit var three:ImageView
    private lateinit var four:ImageView
    private lateinit var five:ImageView
    private lateinit var six:ImageView
    private lateinit var seven:ImageView
    private lateinit var eight:ImageView
    private lateinit var nine:ImageView
    private lateinit var reset:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        one = findViewById(R.id.one)
        two = findViewById(R.id.two)
        three = findViewById(R.id.three)
        four = findViewById(R.id.four)
        five = findViewById(R.id.five)
        six = findViewById(R.id.six)
        seven = findViewById(R.id.seven)
        eight = findViewById(R.id.eight)
        nine = findViewById(R.id.nine)
        reset = findViewById(R.id.button_reset)
        reset.setOnClickListener{
           reset(one)
            reset(two)
            reset(three)
            reset(four)
            reset(five)
            reset(six)
            reset(seven)
            reset(eight)
            reset(nine)

        }

        configurebox(one)
        configurebox(two)
        configurebox(three)
        configurebox(four)
        configurebox(five)
        configurebox(six)
        configurebox(seven)
        configurebox(eight)
        configurebox(nine)

    }
    private fun reset(box: ImageView){
        box.setImageDrawable(null)
        box.tag = null
        isplayer1 = true
        gamend = false
    }
    private fun configurebox(box:ImageView){
        box.setOnClickListener {
            if (box.tag == null ){

            if (isplayer1) {
                box.setImageResource(R.drawable.ic_baseline_brightness_1_24)
                box.tag = 1
                isplayer1 = false
            } else {
                box.setImageResource(R.drawable.ic_baseline_close_24)
                isplayer1 = true
                box.tag = 2

            }
            if(whowin(1)){
                Toast.makeText(this@MainActivity,"player 1 venceu", Toast.LENGTH_SHORT).show()
                reset(one)
                reset(two)
                reset(three)
                reset(four)
                reset(five)
                reset(six)
                reset(seven)
                reset(eight)
                reset(nine)


            }else if(whowin(2))
                Toast.makeText(this@MainActivity,"player 2 venceu", Toast.LENGTH_SHORT).show()
                reset(one)
                reset(two)
                reset(three)
                reset(four)
                reset(five)
                reset(six)
                reset(seven)
                reset(eight)
                reset(nine)

        }

    }}
    private fun whowin(value:Int ): Boolean {
        if(one.tag == value && two.tag == value && three.tag == value ){
            return true


        }
 return false

    }
}