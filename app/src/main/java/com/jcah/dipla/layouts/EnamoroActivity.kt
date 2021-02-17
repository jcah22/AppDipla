package com.jcah.dipla.layouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jcah.dipla.R
import kotlinx.android.synthetic.main.activity_enamoro.*

class EnamoroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enamoro)

        val actionBar = supportActionBar
        actionBar!!.hide()


        img10k.setOnClickListener {
            val intent = Intent(this,Argolla10Activity::class.java)
            startActivity(intent)
        }

        img14k.setOnClickListener {
            val intent = Intent(this,Argollas14Activity::class.java)
            startActivity(intent)
        }

    }
}