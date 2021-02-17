package com.jcah.dipla.layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.jcah.dipla.R
import com.jcah.dipla.adapters.Argolla14kClasicaAdapter
import com.jcah.dipla.models.Argolla10k
import com.jcah.dipla.models.ArgollaClasica14
import kotlinx.android.synthetic.main.activity_argolla14k_clasica.*

class Argolla14kClasicaActivity : AppCompatActivity() {

    val argolla14kClasica = listOf(

        ArgollaClasica14(
            "Codigo: CL001",
            "Descripcion: Argolla 6mm 14 Kilates",
            "Peso Promedio 2.0gr",
            "https://dvillalpando.com/admin-es/img/_articulos/big_1438300509.jpg"
        ),
        ArgollaClasica14(
            "Codigo: CL002",
            "Descripcion: Argolla 6mm 14 Kilates",
            "Peso Promedio 1.9gr",
            "https://dvillalpando.com/admin-es/img/_articulos/big_1437435208.jpg"
        ),
        ArgollaClasica14(
            "Codigo: CL003",
            "Descripcion: Argolla 6mm 14 Kilates",
            "Peso Promedio 1.9gr",
            "https://dvillalpando.com/admin-es/img/_articulos/grande_1438300569.jpg"
        ),
        ArgollaClasica14(
            "Codigo: CL005",
            "Descripcion: Argolla 6mm 14 Kilates",
            "Peso Promedio 2.0gr",
            "https://dvillalpando.com/admin-es/img/_articulos/big_1443450185.jpg"
        ),
        ArgollaClasica14(
            "Codigo: CL012",
            "Descripcion: Argolla 6mm 14 Kilates",
            "Peso Promedio 2.0gr",
            "https://dvillalpando.com/admin-es/img/_articulos/big_1443450336.jpg"
        ),
        ArgollaClasica14(
            "Codigo: CL014",
            "Descripcion: Argolla 6mm 14 Kilates",
            "Peso Promedio 1.9gr",
            "https://dvillalpando.com/admin-es/img/_articulos/grande_1443450465.jpg"
        ),
        ArgollaClasica14(
            "Codigo: CL016",
            "Descripcion: Argolla 6mm 14 Kilates",
            "Peso Promedio 1.9gr",
            "https://dvillalpando.com/admin-es/img/_articulos/grande_1443454643.jpg"
        ),
        ArgollaClasica14(
            "Codigo: CL017",
            "Descripcion: Argolla 6mm 14 Kilates",
            "Peso Promedio 2.0gr",
            "https://dvillalpando.com/admin-es/img/_articulos/grande_1443450834.jpg"
        ),
        ArgollaClasica14(
            "Codigo: CL068-64",
            "Descripcion: Argolla 6mm 14 Kilates",
            "Peso Promedio 2.2gr",
            "https://dvillalpando.com/admin-es/img/_articulos/big_1548177046.jpg"
        ),
        ArgollaClasica14(
            "Codigo: CL009",
            "Descripcion: Argolla 4mm 14 Kilates",
            "Peso Promedio 1.3gr",
            "https://dvillalpando.com/admin-es/img/_articulos/mediana_1443451025.jpg"
        ),
        ArgollaClasica14(
            "Codigo: CL010",
            "Descripcion: Argolla 4mm 14 Kilates",
            "Peso Promedio 1.3gr",
            "https://dvillalpando.com/admin-es/img/_articulos/big_1443454853.jpg"
        ),
        ArgollaClasica14(
            "Codigo: CL086-44",
            "Descripcion: Argolla 4mm 14 Kilates",
            "Peso Promedio 1.4gr",
            "https://dvillalpando.com/admin-es/img/_articulos/big_1548179619.jpg"
        ),
        ArgollaClasica14(
            "Codigo: CL004CPR",
            "Descripcion: Argolla 6mm 14 Kilates",
            "Peso Promedio 2.8gr",
            "https://dvillalpando.com/admin-es/img/_articulos/grande_1443451728.jpg"
        ),


        ArgollaClasica14(
            "Codigo: CL008CPR",
            "Descripcion: Argolla 6mm 14 Kilates",
            "Peso Promedio 2.9gr",
            "https://dvillalpando.com/admin-es/img/_articulos/big_1437436315.jpg"
        ),


        ArgollaClasica14(
            "Codigo: CL001COCP",
            "Descripcion: Argolla 6mm 14 Kilates",
            "Peso Promedio 2.8gr",
            "https://dvillalpando.com/admin-es/img/_articulos/big_1437489677.jpg"
        ),
        ArgollaClasica14(
            "Codigo: CL004COCP",
            "Descripcion: Argolla 6mm 14 Kilates",
            "Peso Promedio 2.8gr",
            "https://dvillalpando.com/admin-es/img/_articulos/big_1437489758.jpg"
        )


    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_argolla14k_clasica)
        val actionBar = supportActionBar
        actionBar!!.hide()

        myRecicler()
    }

    fun myRecicler() {
        rv_Argollas14kClasica.layoutManager = LinearLayoutManager(this)
        val adapter = Argolla14kClasicaAdapter(argolla14kClasica)
        rv_Argollas14kClasica.adapter = adapter
    }
}