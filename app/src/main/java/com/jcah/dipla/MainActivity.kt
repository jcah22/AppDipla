package com.jcah.dipla

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.jcah.dipla.layouts.MenuActivity

class MainActivity : AppCompatActivity() {

    private val DURACION_SPLASH = 5000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionBar = supportActionBar
        actionBar!!.hide()
        getSplash()
    }


    private fun getSplash() {
        Handler().postDelayed({
            val i = Intent(this@MainActivity, MenuActivity::class.java)
            startActivity(i)
            finish()
        }, DURACION_SPLASH.toLong())
    }
}