package com.example.uts

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class GameAdapter(private val context: Context, private val gameList: List<Game>) :
    BaseAdapter() {

    override fun getCount(): Int = gameList.size
    override fun getItem(position: Int): Any = gameList[position]
    override fun getItemId(position: Int): Long = position.toLong()
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = LayoutInflater.from(context).inflate(R.layout.item_game, parent, false)

        val imgGame = view.findViewById<ImageView>(R.id.imgGame)
        val txtGameName = view.findViewById<TextView>(R.id.txtGameName)
        val txtGameGenre = view.findViewById<TextView>(R.id.txtGameGenre)
        val game = gameList[position]
        imgGame.setImageResource(game.imageResId)
        txtGameName.text = game.name
        txtGameGenre.text = game.genres

        return view
    }
}



