package com.example.firstapplication


import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private val showBtn: Button by bind (R.id.showBtn)
    private val helloWorldTv: TextView by bind (R.id.hello_World_Tv)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showBtn.setOnClickListener {
            if (helloWorldTv.visibility == View.VISIBLE){
               showBtn.text = "Show Button"
                helloWorldTv.visibility = View.INVISIBLE
                } else {
                showBtn.text = "Hide Button"
                helloWorldTv.visibility = View.VISIBLE
            }


        }
    }
}
