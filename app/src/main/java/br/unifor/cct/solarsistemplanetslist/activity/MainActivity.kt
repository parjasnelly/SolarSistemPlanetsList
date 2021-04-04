package br.unifor.cct.solarsistemplanetslist.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.unifor.cct.solarsistemplanetslist.R
import br.unifor.cct.solarsistemplanetslist.adapter.PlanetAdapter
import br.unifor.cct.solarsistemplanetslist.repository.PlanetsRepository

class MainActivity : AppCompatActivity() {

    private lateinit var mList: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val planets = PlanetsRepository.getAllPlanets()
        val llm = LinearLayoutManager(this)
        val planetAdapter = PlanetAdapter(planets)
        mList = findViewById(R.id.mainRecyclerViewList)
        mList.apply {
            adapter = planetAdapter
            layoutManager = llm
            hasFixedSize()
        }
    }
}