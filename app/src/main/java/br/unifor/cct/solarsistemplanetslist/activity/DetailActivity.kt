package br.unifor.cct.solarsistemplanetslist.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import br.unifor.cct.solarsistemplanetslist.R
import br.unifor.cct.solarsistemplanetslist.repository.PlanetsRepository
import kotlin.reflect.typeOf

class DetailActivity : AppCompatActivity() {

    private lateinit var mName: TextView
    private lateinit var mMass: TextView
    private lateinit var mBio: TextView
    private lateinit var mPhoto: ImageView

    private val planets = PlanetsRepository.getAllPlanets()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val id = intent.getIntExtra("id", -1)
        mName = findViewById(R.id.detailtextViewName)
        mMass = findViewById(R.id.detailtextViewMass)
        mBio = findViewById(R.id.detailtextViewBio)
        mPhoto = findViewById(R.id.detailImageView)
        
        if(id!=-1){
            mName.text = planets[id].name
            mMass.text = "Massa: " + planets[id].mass
            mBio.text = planets[id].bio
            mPhoto.setImageResource(planets[id].photo)
        }
    }
}