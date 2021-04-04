package br.unifor.cct.solarsistemplanetslist.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.unifor.cct.solarsistemplanetslist.R
import br.unifor.cct.solarsistemplanetslist.model.Planet

class PlanetAdapter(val planets:List<Planet>):RecyclerView.Adapter<PlanetAdapter.PlanetViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlanetViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.planet_item_list, parent, false)
        return PlanetViewHolder(view)
    }

    override fun onBindViewHolder(holder: PlanetViewHolder, position: Int) {
        holder.iName.text = planets[position].name
        holder.iMass.text = "Massa: " + planets[position].mass
    }

    override fun getItemCount(): Int {
        return planets.size
    }

    class PlanetViewHolder(view:View):RecyclerView.ViewHolder(view){
        val iName:TextView = view.findViewById(R.id.planetItemTextViewName)
        val iMass:TextView = view.findViewById(R.id.planetItemTextViewMass)
        val iPhoto:ImageView = view.findViewById(R.id.planetImageView)
    }
}