package com.jcah.dipla.layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.jcah.dipla.R
import com.jcah.dipla.adapters.Argolla10kAdapter
import com.jcah.dipla.models.Argolla10k
import kotlinx.android.synthetic.main.activity_argolla10.*

class Argolla10Activity : AppCompatActivity() {

    val argolla10kilates = listOf(

        Argolla10k(
            "Codigo: CL1101",
            "Descripcion: Argolla 6mm 10 Kilates",
            "Peso Promedio 1.8gr",
            "https://dvillalpando.com/admin-es/img/_articulos/big_1443216315.jpg"
        ),
        Argolla10k(
            "Codigo: CL1108",
            "Descripcion: Argolla 6mm 10 Kilates",
            "Peso Promedio 1.8gr",
            "https://dvillalpando.com/admin-es/img/_articulos/big_1438299758.jpg"
        ),
        Argolla10k(
            "Codigo: CL1109",
            "Descripcion: Argolla 6mm 10 Kilates",
            "Peso Promedio 1.8gr",
            "https://dvillalpando.com/admin-es/img/_articulos/big_1443210906.jpg"
        ),
        Argolla10k(
            "Codigo: CL1110",
            "Descripcion: Argolla 6mm 10 Kilates",
            "Peso Promedio 1.8gr",
            "https://dvillalpando.com/admin-es/img/_articulos/big_1438299851.jpg"
        ),
        Argolla10k(
            "Codigo: CL1116",
            "Descripcion: Argolla 6mm 10 Kilates",
            "Peso Promedio 1.8gr",
            "https://dvillalpando.com/admin-es/img/_articulos/big_1438299963.jpg"
        ),
        Argolla10k(
            "Codigo: CL1200",
            "Descripcion: Argolla 6mm 10 Kilates",
            "Peso Promedio 1.8gr",
            "https://dvillalpando.com/admin-es/img/_articulos/big_1443218072.jpg"
        ),
        Argolla10k(
            "Codigo: CL1201",
            "Descripcion: Argolla 6mm 10 Kilates",
            "Peso Promedio 1.8gr",
            "https://dvillalpando.com/admin-es/img/_articulos/big_1443218219.jpg"
        ),
        Argolla10k(
            "Codigo: CL1202",
            "Descripcion: Argolla 6mm 10 Kilates",
            "Peso Promedio 1.8gr",
            "https://dvillalpando.com/admin-es/img/_articulos/grande_1443218353.jpg"
        ),
        Argolla10k(
            "Codigo: CL088-61",
            "Descripcion: Argolla 6mm 10 Kilates",
            "Peso Promedio 1.8gr",
            "https://dvillalpando.com/admin-es/img/_articulos/big_1498238364.jpg"
        ),
        Argolla10k(
            "Codigo: CL1117",
            "Descripcion: Argolla 6mm 10 Kilates",
            "Peso Promedio 1.8gr",
            "https://dvillalpando.com/admin-es/img/_articulos/big_1438300011.jpg"
        ),
        Argolla10k(
            "Codigo: CL1118",
            "Descripcion: Argolla 6mm 10 Kilates",
            "Peso Promedio 1.8gr",
            "https://dvillalpando.com/admin-es/img/_articulos/grande_1438300073.jpg"
        ),
        Argolla10k(
            "Codigo: CL1119",
            "Descripcion: Argolla 6mm 10 Kilates",
            "Peso Promedio 1.8gr",
            "https://dvillalpando.com/admin-es/img/_articulos/big_1443454364.jpg"
        ),
        Argolla10k(
            "Codigo: CL1120",
            "Descripcion: Argolla 6mm 10 Kilates",
            "Peso Promedio 1.8gr",
            "https://dvillalpando.com/admin-es/img/_articulos/big_1438300143.jpg"
        ),
        Argolla10k(
            "Codigo: CL1122",
            "Descripcion: Argolla 6mm 10 Kilates",
            "Peso Promedio 1.8gr",
            "https://dvillalpando.com/admin-es/img/_articulos/big_1438300216.jpg"
        ),
        Argolla10k(
            "Codigo: CL1123",
            "Descripcion: Argolla 6mm 10 Kilates",
            "Peso Promedio 1.8gr",
            "https://dvillalpando.com/admin-es/img/_articulos/big_1443217551.jpg"
        ),
        Argolla10k(
            "Codigo: CL1126",
            "Descripcion: Argolla 6mm 10 Kilates",
            "Peso Promedio 1.8gr",
            "https://dvillalpando.com/admin-es/img/_articulos/big_1443217695.jpg"
        ),
        Argolla10k(
            "Codigo: CL1128",
            "Descripcion: Argolla 6mm 10 Kilates",
            "Peso Promedio 1.8gr",
            "https://dvillalpando.com/admin-es/img/_articulos/big_1438300278.jpg"
        ),
        Argolla10k(
            "Codigo: CL1129",
            "Descripcion: Argolla 6mm 10 Kilates",
            "Peso Promedio 1.8gr",
            "https://dvillalpando.com/admin-es/img/_articulos/big_1443217875.jpg"
        ),
        Argolla10k(
            "Codigo: CL1131",
            "Descripcion: Argolla 6mm 10 Kilates",
            "Peso Promedio 1.8gr",
            "https://dvillalpando.com/admin-es/img/_articulos/big_1443218438.jpg"
        ),
        Argolla10k(
            "Codigo: CL1104B",
            "Descripcion: Argolla 6mm 10 Kilates",
            "Peso Promedio 1.8gr",
            "https://dvillalpando.com/admin-es/img/_articulos/big_1437434820.jpg"
        ),
        Argolla10k(
            "Codigo: CL1110B",
            "Descripcion: Argolla 6mm 10 Kilates",
            "Peso Promedio 1.8gr",
            "https://dvillalpando.com/admin-es/img/_articulos/big_1437434950.jpg"
        ),
        Argolla10k(
            "Codigo: CL1112B",
            "Descripcion: Argolla 6mm 10 Kilates",
            "Peso Promedio 1.8gr",
            "https://dvillalpando.com/admin-es/img/_articulos/mediana_1438300358.jpg"
        ),
        Argolla10k(
            "Codigo: CL1114B",
            "Descripcion: Argolla 6mm 10 Kilates",
            "Peso Promedio 1.8gr",
            "https://dvillalpando.com/admin-es/img/_articulos/big_1437435102.jpg"
        )


    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_argolla10)
        val actionBar = supportActionBar
        actionBar!!.hide()
        miRecycler()
    }

    fun miRecycler(){
        rv_Argollas10k.layoutManager = LinearLayoutManager(this)
        val adapter = Argolla10kAdapter(argolla10kilates)
        rv_Argollas10k.adapter = adapter
    }
}