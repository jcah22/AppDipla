package com.jcah.dipla.layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.jcah.dipla.R
import kotlinx.android.synthetic.main.activity_detalle_argolla10.*

class DetalleArgolla10Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_argolla10)

        val actionBar = supportActionBar
        actionBar!!.hide()

        var codigo = getIntent().getExtras()?.getString("codigo");
        var img = getIntent().getExtras()?.getString("foto");


        codigoDetalle10.text = codigo
        Glide.with(this).load(img).into(imgDetalle10k)


    }
}