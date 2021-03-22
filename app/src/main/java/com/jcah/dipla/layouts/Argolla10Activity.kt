package com.jcah.dipla.layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
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
            "https://cdn.shopify.com/s/files/1/0428/7286/4930/products/CL1101_035079b6-3037-4c95-b276-1fc76296670f_1024x1024@2x.jpg?v=1599244912"
        ),
        Argolla10k(
            "Codigo: CL1108",
            "Descripcion: Argolla 6mm 10 Kilates",
            "Peso Promedio 1.8gr",
            "https://firebasestorage.googleapis.com/v0/b/villa-12978.appspot.com/o/Enamoro%2F10k%2Fcl1108.jpg?alt=media&token=c5692dd3-0d49-4d33-9b0d-3bb97340a675"
        ),
        Argolla10k(
            "Codigo: CL1109",
            "Descripcion: Argolla 6mm 10 Kilates",
            "Peso Promedio 1.8gr",
            "https://firebasestorage.googleapis.com/v0/b/villa-12978.appspot.com/o/Enamoro%2F10k%2Fcl1109.jpg?alt=media&token=61f0a309-d80e-4a63-b311-e861292a3f59"
        ),
        Argolla10k(
            "Codigo: CL1110",
            "Descripcion: Argolla 6mm 10 Kilates",
            "Peso Promedio 1.8gr",
            "https://firebasestorage.googleapis.com/v0/b/villa-12978.appspot.com/o/Enamoro%2F10k%2Fcl1110.jpg?alt=media&token=ebb54eff-9803-47dc-aba5-0d78ae08d2f3"
        ),
        Argolla10k(
            "Codigo: CL1116",
            "Descripcion: Argolla 6mm 10 Kilates",
            "Peso Promedio 1.8gr",
            "https://firebasestorage.googleapis.com/v0/b/villa-12978.appspot.com/o/Enamoro%2F10k%2Fcl1116.jpg?alt=media&token=1516660f-6b04-4cf7-902b-ed81e442b5b6"
        ),
        Argolla10k(
            "Codigo: CL1200",
            "Descripcion: Argolla 6mm 10 Kilates",
            "Peso Promedio 1.8gr",
            "https://firebasestorage.googleapis.com/v0/b/villa-12978.appspot.com/o/Enamoro%2F10k%2Fcl1200.jpg?alt=media&token=5083ceee-1cc8-4bd1-94af-94603cd4080d"
        ),
        Argolla10k(
            "Codigo: CL1201",
            "Descripcion: Argolla 6mm 10 Kilates",
            "Peso Promedio 1.8gr",
            "https://firebasestorage.googleapis.com/v0/b/villa-12978.appspot.com/o/Enamoro%2F10k%2Fcl1201.jpg?alt=media&token=19ea8041-4f36-43a5-9d6a-c090a28797c2"
        ),
        Argolla10k(
            "Codigo: CL1202",
            "Descripcion: Argolla 6mm 10 Kilates",
            "Peso Promedio 1.8gr",
            "https://firebasestorage.googleapis.com/v0/b/villa-12978.appspot.com/o/Enamoro%2F10k%2Fcl1202.jpg?alt=media&token=605d1d2e-b3fe-45bd-b550-b30168e0621e"
        ),
        Argolla10k(
            "Codigo: CL088-61",
            "Descripcion: Argolla 6mm 10 Kilates",
            "Peso Promedio 1.8gr",
            "https://firebasestorage.googleapis.com/v0/b/villa-12978.appspot.com/o/Enamoro%2F10k%2Fcl088_61.jpg?alt=media&token=314d0c89-7811-4cbf-819e-456bd1d59540"
        ),
        Argolla10k(
            "Codigo: CL1117",
            "Descripcion: Argolla 6mm 10 Kilates",
            "Peso Promedio 1.8gr",
            "https://firebasestorage.googleapis.com/v0/b/villa-12978.appspot.com/o/Enamoro%2F10k%2Fcl1117.jpg?alt=media&token=ef9a6989-e466-4c37-925a-2f68be0415c2"
        ),
        Argolla10k(
            "Codigo: CL1118",
            "Descripcion: Argolla 6mm 10 Kilates",
            "Peso Promedio 1.8gr",
            "https://firebasestorage.googleapis.com/v0/b/villa-12978.appspot.com/o/Enamoro%2F10k%2Fcl1118.jpg?alt=media&token=2b01d76b-179e-4e39-a41e-fe767b33fe67"
        ),
        Argolla10k(
            "Codigo: CL1119",
            "Descripcion: Argolla 6mm 10 Kilates",
            "Peso Promedio 1.8gr",
            "https://firebasestorage.googleapis.com/v0/b/villa-12978.appspot.com/o/Enamoro%2F10k%2Fcl1119.jpg?alt=media&token=858f60cd-e34c-4f4a-862c-1d6cd21c77a5"
        ),
        Argolla10k(
            "Codigo: CL1120",
            "Descripcion: Argolla 6mm 10 Kilates",
            "Peso Promedio 1.8gr",
            "https://firebasestorage.googleapis.com/v0/b/villa-12978.appspot.com/o/Enamoro%2F10k%2Fcl1120.jpg?alt=media&token=728c8b60-c0f7-4313-9d79-4a8c9af34605"
        ),
        Argolla10k(
            "Codigo: CL1122",
            "Descripcion: Argolla 6mm 10 Kilates",
            "Peso Promedio 1.8gr",
            "https://firebasestorage.googleapis.com/v0/b/villa-12978.appspot.com/o/Enamoro%2F10k%2Fcl1122.jpg?alt=media&token=28f9735c-f74d-4f24-8d3b-2b88eadd39e7"
        ),
        Argolla10k(
            "Codigo: CL1123",
            "Descripcion: Argolla 6mm 10 Kilates",
            "Peso Promedio 1.8gr",
            "https://firebasestorage.googleapis.com/v0/b/villa-12978.appspot.com/o/Enamoro%2F10k%2Fcl1123.jpg?alt=media&token=1074e7dc-23fc-4cea-a17c-03b65e47d2a8"
        ),
        Argolla10k(
            "Codigo: CL1108-41",
            "Descripcion: Argolla 4mm 10 Kilates",
            "Peso Promedio 1.5gr",
            "https://firebasestorage.googleapis.com/v0/b/villa-12978.appspot.com/o/Enamoro%2F10k%2Fcl1123.jpg?alt=media&token=1074e7dc-23fc-4cea-a17c-03b65e47d2a8"
        ),
        Argolla10k(
            "Codigo: CL1126",
            "Descripcion: Argolla 4mm 10 Kilates",
            "Peso Promedio 1.3gr",
            "https://firebasestorage.googleapis.com/v0/b/villa-12978.appspot.com/o/Enamoro%2F10k%2Fcl1126.jpg?alt=media&token=d3b1066f-00f2-46bb-99e0-92fa09c6e7f3"
        ),
        Argolla10k(
            "Codigo: CL1128",
            "Descripcion: Argolla 4mm 10 Kilates",
            "Peso Promedio 1.4gr",
            "https://firebasestorage.googleapis.com/v0/b/villa-12978.appspot.com/o/Enamoro%2F10k%2Fcl1128.jpg?alt=media&token=99c44951-8b9b-401b-9817-46176d375c1e"
        ),
        Argolla10k(
            "Codigo: CL1129",
            "Descripcion: Argolla 6mm 10 Kilates",
            "Peso Promedio 1.8gr",
            "https://firebasestorage.googleapis.com/v0/b/villa-12978.appspot.com/o/Enamoro%2F10k%2Fcl1129.jpg?alt=media&token=5d63c22f-dea8-40c3-9807-4441b62d6f48"
        ),
        Argolla10k(
            "Codigo: CL1131",
            "Descripcion: Argolla 4mm 10 Kilates",
            "Peso Promedio 1.3gr",
            "https://firebasestorage.googleapis.com/v0/b/villa-12978.appspot.com/o/Enamoro%2F10k%2Fcl1131.jpg?alt=media&token=543e0d04-2501-4856-9a3c-54f6149b9c05"
        ),
        Argolla10k(
            "Codigo: CL1104B",
            "Descripcion: Argolla 6mm 10 Kilates",
            "Peso Promedio 1.8gr",
            "https://firebasestorage.googleapis.com/v0/b/villa-12978.appspot.com/o/Enamoro%2F10k%2Fcl1104b.jpg?alt=media&token=164af27a-0dbc-49d2-a82f-4366a3057dc1"
        ),
        Argolla10k(
            "Codigo: CL1110B",
            "Descripcion: Argolla 6mm 10 Kilates",
            "Peso Promedio 2.0gr",
            "https://firebasestorage.googleapis.com/v0/b/villa-12978.appspot.com/o/Enamoro%2F10k%2Fcl1110b.jpg?alt=media&token=250f8049-8f93-481a-b166-cd7184d0e935"
        ),
        Argolla10k(
            "Codigo: CL1112B",
            "Descripcion: Argolla 6mm 10 Kilates",
            "Peso Promedio 1.8gr",
            "https://firebasestorage.googleapis.com/v0/b/villa-12978.appspot.com/o/Enamoro%2F10k%2Fcl1112b.jpg?alt=media&token=f33362cc-6228-4116-af43-b02c3269ea49"
        ),
        Argolla10k(
            "Codigo: CL1114B",
            "Descripcion: Argolla 6mm 10 Kilates",
            "Peso Promedio 1.7gr",
            "https://firebasestorage.googleapis.com/v0/b/villa-12978.appspot.com/o/Enamoro%2F10k%2Fcl1114b.jpg?alt=media&token=0bdc5774-faec-46e5-aa85-6076eb080ba7"
        )


    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_argolla10)
        val actionBar = supportActionBar
        actionBar!!.hide()
        miRecycler()
    }

    fun miRecycler() {
        rv_Argollas10k.layoutManager = LinearLayoutManager(this)
        val adapter = Argolla10kAdapter(argolla10kilates)
        rv_Argollas10k.adapter = adapter
    }
}