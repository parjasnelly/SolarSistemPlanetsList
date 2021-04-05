package br.unifor.cct.solarsistemplanetslist.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.unifor.cct.solarsistemplanetslist.R
import br.unifor.cct.solarsistemplanetslist.adapter.OnPlanetItemListener
import br.unifor.cct.solarsistemplanetslist.adapter.PlanetAdapter
import br.unifor.cct.solarsistemplanetslist.repository.PlanetsRepository

class MainActivity : AppCompatActivity(), OnPlanetItemListener {

    private lateinit var mList: RecyclerView
    private val planets = PlanetsRepository.getAllPlanets()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val llm = LinearLayoutManager(this)
        val planetAdapter = PlanetAdapter(planets)
        planetAdapter.setOnPlanetItemListener(this)
        mList = findViewById(R.id.mainRecyclerViewList)
        mList.apply {
            adapter = planetAdapter
            layoutManager = llm
            hasFixedSize()
        }
    }

    override fun onClick(view: View, position: Int) {
        val it = Intent(this, DetailActivity::class.java)
        it.putExtra("id", position)
        startActivity(it)
    }
}