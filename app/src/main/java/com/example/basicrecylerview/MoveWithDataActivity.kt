package com.example.basicrecylerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MoveWithDataActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_NAME = "extra_age"
        const val EXTRA_AUTHOR = "extra_author"
        const val EXTRA_IMG = "extra_img"
        const val EXTRA_ABOUT = "extra_about"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_data)
        val tvNameReceived: TextView = findViewById(R.id.tv_item_name)
        val tvAuthorReceived: TextView = findViewById(R.id.tv_item_author)
        val tvAboutReceived: TextView = findViewById(R.id.tv_item_about)
        val imgItemPhoto: ImageView = findViewById(R.id.image_item_photo)
        val name = intent.getStringExtra(EXTRA_NAME)
        val author= intent.getStringExtra(EXTRA_AUTHOR)
        val img = intent.getIntExtra(EXTRA_IMG, 0)
        val about = intent.getStringExtra(EXTRA_ABOUT)
        imgItemPhoto.setImageResource(img)
        tvNameReceived.text = name
        tvAuthorReceived.text = author
        tvAboutReceived.text = about



    }
}