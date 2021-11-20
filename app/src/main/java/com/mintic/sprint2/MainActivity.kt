package com.mintic.sprint2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val producto = Producto ( nombre= "Mirador La Calera", descripcion= "Vas a poder obtener unas excelentes vistas \n de Bogotá además que vas a poder probar\n el famoso canelazo", R.drawable.bogota)
        val producto2 = Producto (nombre = "Parque Botero", descripcion = " Esta plaza es importante para el pueblo\n colombiano porque se encuentran expuestas\n esculturas de su pintor más reconocido a nivel\n internacional, Fernando Botero", R.drawable.medellin)
        val producto3 = Producto (nombre = "Cañon del Combeima", descripcion = "En este lugar habitan, entre otros animales, osos\n de anteojos, cóndores, zorros y águilas\n cuaresmeras; así como los frailejones, plantas \nde mora y de lulo forman parte del paisaje.", R.drawable.florencia)
        val producto4 = Producto (nombre = "Desierto de la Tatacoa", descripcion = "El Desierto de la Tatacoa es la segunda zona \n árida más extensa de Colombia después de la \n península de la Guajira", R.drawable.neiva)
        val producto5 = Producto (nombre = "Portales del Fraguita", descripcion = "Se dice que se formaron cuando el rio fraguita\n logro atravesar la roca y formo paredes de \n aproximadamente 50 metros de altura a lado \n y lado", R.drawable.portales)

        val listaProductos = listOf(producto, producto2, producto3, producto4, producto5)

        val adapter = adaptador (mContext= this, listaProductos)

        lista.adapter = adapter
    }

}