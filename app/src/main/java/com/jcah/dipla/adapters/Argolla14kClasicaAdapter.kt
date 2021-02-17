package com.jcah.dipla.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.jcah.dipla.layouts.DetalleArgolla14kClasicaActivity
import com.jcah.dipla.R
import com.jcah.dipla.models.ArgollaClasica14
import kotlinx.android.synthetic.main.item_argolla14_clasica.view.*

class Argolla14kClasicaAdapter(val argolla14kclasica:List<ArgollaClasica14>):RecyclerView.Adapter<Argolla14kClasicaAdapter.ArgollaClasica14k>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArgollaClasica14k {
        val layouInflater = LayoutInflater.from(parent.context)
        return ArgollaClasica14k(layouInflater.inflate(R.layout.item_argolla14_clasica,parent,false))
    }

    override fun onBindViewHolder(holder: ArgollaClasica14k, position: Int) {
        holder.render(argolla14kclasica[position])
    }

    override fun getItemCount(): Int =argolla14kclasica.size






    class  ArgollaClasica14k(val view : View):RecyclerView.ViewHolder(view){

        fun render(argolla14kclasica:ArgollaClasica14){
            view.tvcogido14kClasica.text = argolla14kclasica.codigo
            view.tvdescription14kClasica.text = argolla14kclasica.descricion
            view.tvpesopromedio14kClasica.text = argolla14kclasica.peso
            Glide.with(view.context).load(argolla14kclasica.imagen).into(view.img14kClasica)


            view.setOnClickListener {
                val intent  = Intent(view.context, DetalleArgolla14kClasicaActivity::class.java)
                intent.putExtra("codigo",argolla14kclasica.codigo)
                intent.putExtra("foto",argolla14kclasica.imagen)
                view.context.startActivity(intent)
            }
        }
    }


}