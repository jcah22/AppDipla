package com.jcah.dipla.layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jcah.dipla.R

class Argollas14Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_argollas14)

        val actionBar = supportActionBar
        actionBar!!.hide()
    }
}