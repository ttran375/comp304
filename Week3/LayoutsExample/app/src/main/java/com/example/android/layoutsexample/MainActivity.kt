package com.example.android.layoutsexample

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


//
//
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    // Press the Escape key to go back to the previous screen
    // handling click event of buttons
    fun onClick(view: View) {
        when (view.getId()) {
            R.id.btnLinear -> setContentView(R.layout.linear_layout)
            R.id.btnFrame -> setContentView(R.layout.frame_layout)
            R.id.btnTable -> setContentView(R.layout.table_layout)
            R.id.btnRelative -> setContentView(R.layout.relative_layout)
            R.id.btnAbsolute -> setContentView(R.layout.absolute_layout)
            R.id.btnScroll -> setContentView(R.layout.scroll_layout)
            else -> setContentView(R.layout.activity_main)
        }
    }
    //
    override fun onBackPressed() {
        //show the previous view
        setContentView(R.layout.activity_main)
        //startActivity(Intent(this, MainActivity::class.java))
    }
}