package dev.alexfranco.mtw.frutas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var frutas: ArrayList<Fruta> = ArrayList()
        frutas.add(Fruta("Manzana", R.drawable.manzana))
        frutas.add(Fruta("Durazno", R.drawable.durazno))
        frutas.add(Fruta("Plátano", R.drawable.platano))
        frutas.add(Fruta("Sandia", R.drawable.sandia))

        val adaptador = AdaptadorCustom(this, frutas)

        Lista.adapter = adaptador
        Lista.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, frutas.get(position).nombre, Toast.LENGTH_LONG).show()
        }
    }

}
