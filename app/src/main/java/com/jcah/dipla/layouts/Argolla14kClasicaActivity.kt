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
            "Peso Promedio: 2.0gr",
            "https://firebasestorage.googleapis.com/v0/b/villa-12978.appspot.com/o/Enamoro%2F14k%2Fclasica%2Fcl001.jpg?alt=media&token=8baf87b7-c586-4945-a362-0724670afba7"
        ),
        ArgollaClasica14(
            "Codigo: CL002",
            "Descripcion: Argolla 6mm 14 Kilates",
            "Peso Promedio: 1.9gr",
            "https://firebasestorage.googleapis.com/v0/b/villa-12978.appspot.com/o/Enamoro%2F14k%2Fclasica%2Fcl002.jpg?alt=media&token=58c27e9e-bac7-450e-adde-e251402c0ece"
        ),
        ArgollaClasica14(
            "Codigo: CL003",
            "Descripcion: Argolla 6mm 14 Kilates",
            "Peso Promedio: 1.9gr",
            "https://firebasestorage.googleapis.com/v0/b/villa-12978.appspot.com/o/Enamoro%2F14k%2Fclasica%2Fcl003.jpg?alt=media&token=ecf44aab-a18e-46c3-8654-76cad4473f1c"
        ),
        ArgollaClasica14(
            "Codigo: CL005",
            "Descripcion: Argolla 6mm 14 Kilates",
            "Peso Promedio 2.0gr",
            "https://firebasestorage.googleapis.com/v0/b/villa-12978.appspot.com/o/Enamoro%2F14k%2Fclasica%2Fcl005.jpg?alt=media&token=091f99a4-4157-41a4-b22f-44a88be61a51"
        ),
        ArgollaClasica14(
            "Codigo: CL012",
            "Descripcion: Argolla 6mm 14 Kilates",
            "Peso Promedio 2.0gr",
            "https://firebasestorage.googleapis.com/v0/b/villa-12978.appspot.com/o/Enamoro%2F14k%2Fclasica%2Fcl012.jpg?alt=media&token=8331ef1c-99a6-4e88-8238-7eb9200bd54e"
        ),
        ArgollaClasica14(
            "Codigo: CL014",
            "Descripcion: Argolla 6mm 14 Kilates",
            "Peso Promedio 1.9gr",
            "https://firebasestorage.googleapis.com/v0/b/villa-12978.appspot.com/o/Enamoro%2F14k%2Fclasica%2Fcl014.jpg?alt=media&token=58e6bd7e-9669-4214-a0d3-4541a0d824ff"
        ),
        ArgollaClasica14(
            "Codigo: CL016",
            "Descripcion: Argolla 6mm 14 Kilates",
            "Peso Promedio 1.9gr",
            "https://firebasestorage.googleapis.com/v0/b/villa-12978.appspot.com/o/Enamoro%2F14k%2Fclasica%2Fcl016.jpg?alt=media&token=1156eb4e-460f-4061-b255-3fc3cf02e831"
        ),
        ArgollaClasica14(
            "Codigo: CL017",
            "Descripcion: Argolla 6mm 14 Kilates",
            "Peso Promedio 2.0gr",
            "https://firebasestorage.googleapis.com/v0/b/villa-12978.appspot.com/o/Enamoro%2F14k%2Fclasica%2Fcl017.jpg?alt=media&token=46edf1d9-a067-489a-8728-3f74f5b06939"
        ),
        ArgollaClasica14(
            "Codigo: CL068-64",
            "Descripcion: Argolla 6mm 14 Kilates",
            "Peso Promedio 2.2gr",
            "https://firebasestorage.googleapis.com/v0/b/villa-12978.appspot.com/o/Enamoro%2F14k%2Fclasica%2Fcl068_64.jpg?alt=media&token=3704419f-9880-4adc-a884-9c0fda5c4f07"
        ),
        ArgollaClasica14(
            "Codigo: CL009",
            "Descripcion: Argolla 4mm 14 Kilates",
            "Peso Promedio 1.3gr",
            "https://firebasestorage.googleapis.com/v0/b/villa-12978.appspot.com/o/Enamoro%2F14k%2Fclasica%2Fcl009.jpg?alt=media&token=42791e84-6f21-4d20-991a-9806297cbce6"
        ),

        // aqui falta una argolla CL070-64

        ArgollaClasica14(
            "Codigo: CL010",
            "Descripcion: Argolla 4mm 14 Kilates",
            "Peso Promedio 1.3gr",
            "https://firebasestorage.googleapis.com/v0/b/villa-12978.appspot.com/o/Enamoro%2F14k%2Fclasica%2Fcl010.jpg?alt=media&token=ad7ba6bb-552e-41d8-b732-c8e14e4a3d6a"
        ),
        ArgollaClasica14(
            "Codigo: CL086-44",
            "Descripcion: Argolla 4mm 14 Kilates",
            "Peso Promedio 1.4gr",
            "https://firebasestorage.googleapis.com/v0/b/villa-12978.appspot.com/o/Enamoro%2F14k%2Fclasica%2Fcl086_44.jpg?alt=media&token=33d682df-172f-471d-8aae-fff66f90c5f2"
        ),
        ArgollaClasica14(
            "Codigo: CL004CPR",
            "Descripcion: Argolla 6mm 14 Kilates",
            "Peso Promedio 2.8gr",
            "https://firebasestorage.googleapis.com/v0/b/villa-12978.appspot.com/o/Enamoro%2F14k%2Fclasica%2Fcl004cpr.jpg?alt=media&token=67c30820-f8bb-4f47-8207-b700ba1892c3"
        ),


        ArgollaClasica14(
            "Codigo: CL008CPR",
            "Descripcion: Argolla 6mm 14 Kilates",
            "Peso Promedio 2.9gr",
            "https://firebasestorage.googleapis.com/v0/b/villa-12978.appspot.com/o/Enamoro%2F14k%2Fclasica%2Fcl008cpr.jpg?alt=media&token=682737ba-5ca6-4fa1-97a1-b7d5cc2d6bea"
        ),


        ArgollaClasica14(
            "Codigo: CL001COCP",
            "Descripcion: Argolla 6mm 14 Kilates",
            "Peso Promedio 2.8gr",
            "https://firebasestorage.googleapis.com/v0/b/villa-12978.appspot.com/o/Enamoro%2F14k%2Fclasica%2Fcl001cocp.jpg?alt=media&token=dcd5bf29-a091-484b-a0d9-984b97e56398so"
        ),
        ArgollaClasica14(
            "Codigo: CL004COCP",
            "Descripcion: Argolla 6mm 14 Kilates",
            "Peso Promedio 2.8gr",
            "https://firebasestorage.googleapis.com/v0/b/villa-12978.appspot.com/o/Enamoro%2F14k%2Fclasica%2Fcl004cocp.jpg?alt=media&token=57a283c3-aea1-496b-bd2e-3940e8c1ae67"
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