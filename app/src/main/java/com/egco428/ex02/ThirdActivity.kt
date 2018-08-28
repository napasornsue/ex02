package com.egco428.ex02

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val bundle = intent.extras
        val inpSum: Int

        if(bundle != null){
            inpSum = bundle.getInt("inputSum")
            sumNumber.text = inpSum.toString()
        }
    }

    fun backToSecond(view: View){
        finish()
    }
}
