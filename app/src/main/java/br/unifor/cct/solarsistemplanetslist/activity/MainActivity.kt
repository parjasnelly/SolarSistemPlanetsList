package br.unifor.cct.solarsistemplanetslist.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.unifor.cct.solarsistemplanetslist.R

class MainActivity : AppCompatActivity() {

    private lateinit var mList: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val llm = LinearLayoutManager(this)
        mList = findViewById(R.id.mainRecyclerViewList)
        mList.apply {
            adapter = null
            layoutManager = llm
            hasFixedSize()
        }
    }
}