package com.jcah.dipla.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.jcah.dipla.layouts.DetalleArgolla10Activity
import com.jcah.dipla.R
import com.jcah.dipla.models.Argolla10k
import kotlinx.android.synthetic.main.item_argolla_10k.view.*

class Argolla10kAdapter(val argolla10:List<Argolla10k>):
    RecyclerView.Adapter<Argolla10kAdapter.ArgollaAdapter10>() {





    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArgollaAdapter10 {
        val layoutInflater= LayoutInflater.from(parent.context)
        return ArgollaAdapter10(layoutInflater.inflate(R.layout.item_argolla_10k,parent,false))
    }

    override fun onBindViewHolder(holder: ArgollaAdapter10, position: Int) {
       holder.render(argolla10[position])
    }

    override fun getItemCount(): Int = argolla10.size



    class ArgollaAdapter10(val view : View):RecyclerView.ViewHolder(view){

        fun render (argolla10:Argolla10k){
            view.tvcogido10k.text = argolla10.codigo10k
            view.tvdescription10k.text = argolla10.descripcion
            view.tvpesopromedio10k.text = argolla10.peso
            Glide.with(view.context).load(argolla10.imagen).into(view.img10k)

            view.setOnClickListener {
                val intent = Intent(view.context , DetalleArgolla10Activity::class.java)
                intent.putExtra("codigo",argolla10.codigo10k)
                intent.putExtra("foto",argolla10.imagen)
                view.context.startActivity(intent)
            }



        }

    }


}