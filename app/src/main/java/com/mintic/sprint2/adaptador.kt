package com.mintic.sprint2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.lugar.view.*

class adaptador(private val  mContext: Context, private val listaproductos: List<Producto> ) : ArrayAdapter<Producto>(mContext, 0, listaproductos) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layout = LayoutInflater.from(mContext). inflate(R.layout.lugar, parent, false)

        val producto = listaproductos[position]

        layout.nombre.text= producto.nombre
        layout.descripcion.text = producto.descripcion
        layout.imageView.setImageResource(producto.imagen)


        return layout
    }
}