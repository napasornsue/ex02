package com.egco428.ex02

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val bundle = intent.extras
        val inp1: String

        if(bundle != null){
            inp1 = bundle.getString("input1")
            showText.setText(inp1)
        }

        nextBtn.setOnClickListener {
            val sum = showText.text.toString().toInt() + showText2.text.toString().toInt()
            val intent2 = Intent(this, ThirdActivity::class.java)
            intent2.putExtra("inputSum", sum)
            startActivity(intent2)
        }
    }

    fun backToMain(view: View){
        finish()
    }
}
