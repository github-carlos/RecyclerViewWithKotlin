package br.com.recyclercomkotlin.recyclerviewcomkotlin

import android.app.Application
import android.graphics.drawable.Drawable
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.recyclerview_item.view.*

/**
 * Created by carlos on 19/11/17.
 */
class RecyclerAdapter(val teams: MutableList<FootballTeam>, val listener: (View?) -> Unit): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        // infla o layout de item no layout principal e retorna um viewHolder
        return ViewHolder(LayoutInflater.from(parent?.context).inflate(R.layout.recyclerview_item, parent, false), listener)
    }

    override fun getItemCount() = teams.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        // pega o item que vai ser instanciado
        val itemView = holder.itemView
        val team = teams[position]

        itemView.teamNameTextView.text = team.name
        itemView.descriptionTeamTextView.text = team.description
        itemView.imageTeamImageView.setImageResource(team.imageId)
    }

    class ViewHolder(val v: View, val listener: (item: View) -> Unit): RecyclerView.ViewHolder(v), View.OnClickListener {
        // funçao é ativada quando o item é clicado
        override fun onClick(item: View) {
            // chama o callback enviando o item como argumento
            listener(item)
        }

        init {
            v.setOnClickListener(this)
        }
    }
}