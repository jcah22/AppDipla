package com.jcah.dipla.layouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.jcah.dipla.R
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val actionBar = supportActionBar
        actionBar!!.hide()

        idCard1.setOnClickListener {
            Toast.makeText(this, "plata Activity", Toast.LENGTH_SHORT).show()
        }
        idCard2.setOnClickListener {
            Toast.makeText(this, "oro Activity", Toast.LENGTH_SHORT).show()
        }
        idCard3.setOnClickListener {
            val i = Intent(this, EnamoroActivity::class.java)
            startActivity(i)
        }
    }
}