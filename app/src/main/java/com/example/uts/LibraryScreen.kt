package com.example.uts

import android.os.Bundle
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity
import android.widget.ListView

class LibraryScreen : AppCompatActivity() {

    private lateinit var listView: ListView
    private lateinit var gameList: ArrayList<Game>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_library)

        listView = findViewById(R.id.listViewGame)

        gameList = arrayListOf(
            Game("Cyberpunk 2077", "RPG | Open World | Sci-Fi", R.drawable.game1),
            Game("Elden Ring", "RPG | Fantasy | Soulslike", R.drawable.game2),
            Game("GTA V", "Action | Open World | Crime", R.drawable.game3),
            Game("Valorant", "Shooter | FPS | Competitive", R.drawable.game4),
            Game("Minecraft", "Sandbox | Survival | Creative", R.drawable.game5)
        )

        val adapter = GameAdapter(this, gameList)
        listView.adapter = adapter
    }
}

