package com.jcah.dipla.layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.jcah.dipla.R
import kotlinx.android.synthetic.main.activity_detalle_argolla14k_clasica.*

class DetalleArgolla14kClasicaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_argolla14k_clasica)

        val actionBar = supportActionBar
        actionBar!!.hide()

        val codigo = getIntent().getExtras()?.getString("codigo")
        val img = getIntent().getExtras()?.getString("foto")
        codigoDetalle14kClasica.text = codigo
        Glide.with(this).load(img).into(imgDetalle14kClasica)


    }
}