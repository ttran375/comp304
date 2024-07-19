package com.example.android.usingresourcesexample

import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
//
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //
        val myString = resources.getString(R.string.display)
        val myColor = ContextCompat.getColor(this, R.color.niceTextColor)

        val myDimen = resources.getDimension(R.dimen.textPointSize)
        val myDraw = resources.getDrawable(R.drawable.red_rect) as ColorDrawable
        //create the Java object for your view
        //create the Java object for your view
        val imgView: ImageView = findViewById<View>(R.id.imageView1) as ImageView
        //get the flag image from resources
        //get the flag image from resources
        val bitmapFlag = resources.getDrawable(R.drawable.flag) as BitmapDrawable

        //display the image on image view
        //imgView.setImageDrawable(myDraw);
        imgView.setImageDrawable(bitmapFlag)
        //
        val flavors = resources.getStringArray(R.array.flavors)

        val tv = findViewById<View>(R.id.txtView) as TextView
        tv.textSize = myDimen
        tv.setTextColor(myColor)
        tv.text = myString
        //


    }
}