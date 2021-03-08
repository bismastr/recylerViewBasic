package com.example.basicrecylerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var rvBooks: RecyclerView
    private var list: ArrayList<Books> = arrayListOf()
    private fun showSelectedHero(hero: Books) {
        Toast.makeText(this, "Kamu memilih " + hero.name, Toast.LENGTH_SHORT).show()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvBooks = findViewById(R.id.rv_books)
        rvBooks.setHasFixedSize(true)

        list.addAll(BooksData.listData)
        showRecyclerList()
        //About activity
        val btnMoveAbout: ImageButton = findViewById(R.id.btn_move_about)
        btnMoveAbout.setOnClickListener(this)
    }

    private fun showRecyclerList() {
        rvBooks.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListBooksAdapter(list)
        rvBooks.adapter = listHeroAdapter

        listHeroAdapter.setOnItemClickCallback(object : ListBooksAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Books) {
                val moveWithDataIntent = Intent(this@MainActivity, MoveWithDataActivity::class.java)
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, data.name)
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AUTHOR, data.author)
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_IMG, data.photo)
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_ABOUT, data.about)
                startActivity(moveWithDataIntent)
            }
        })
    }
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_move_about -> {
                val moveIntent = Intent(this@MainActivity, About::class.java)
                startActivity(moveIntent)
            }
        }
    }

}