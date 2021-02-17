package com.jcah.dipla.layouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jcah.dipla.R
import kotlinx.android.synthetic.main.activity_argollas14.*

class Argollas14Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_argollas14)

        val actionBar = supportActionBar
        actionBar!!.hide()

        idCardClasica.setOnClickListener {
            val intent = Intent(this,Argolla14kClasicaActivity::class.java)
            startActivity(intent)
        }
    }
}