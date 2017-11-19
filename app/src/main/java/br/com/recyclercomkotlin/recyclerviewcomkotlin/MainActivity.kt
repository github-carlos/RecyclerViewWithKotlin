package br.com.recyclercomkotlin.recyclerviewcomkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val teamCollection = mutableListOf<FootballTeam>()
        teamCollection.add(FootballTeam(R.drawable.barcelona, "Barcelona"))
        teamCollection.add(FootballTeam(R.drawable.real_madrid, "Real Madrid"))
        teamCollection.add(FootballTeam(R.drawable.bayern, "Bayern Munich"))
        teamCollection.add(FootballTeam(R.drawable.psg, "Paris Saint Germain"))
        teamCollection.add(FootballTeam(R.drawable.atletico_madrid, "Atlético de Madrid"))
        teamCollection.add(FootballTeam(R.drawable.borussia_dortmund, "Borussia Dortmund"))
        teamCollection.add(FootballTeam(R.drawable.corinthians, "Corinthians"))
        teamCollection.add(FootballTeam(R.drawable.flamengo, "Flamengo"))
        teamCollection.add(FootballTeam(R.drawable.gremio, "Grêmio"))
        teamCollection.add(FootballTeam(R.drawable.sao_paulo, "São Paulo"))

        val recyclerAdapter = RecyclerAdapter(teamCollection) {
            // do something here when item is clicked
        }
        val manager = LinearLayoutManager(this)
        myRecyclerView.adapter = recyclerAdapter
        myRecyclerView.layoutManager = manager
    }
}
