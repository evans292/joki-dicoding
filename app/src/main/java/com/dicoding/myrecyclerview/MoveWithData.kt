package com.dicoding.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class MoveWithData : AppCompatActivity() {
    companion object {
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PHOTO = "extra_photo"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_data)



        val tvDataReceived: TextView = findViewById(R.id.tv_data_received)
        val tvDataReceived2: TextView = findViewById(R.id.tv_data_received2)
        val imgPhoto: ImageView = findViewById(R.id.detail_photo)

        val name = intent.getStringExtra(EXTRA_NAME)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val photo = intent.getIntExtra(EXTRA_PHOTO, 0)
        val text = "\t\t$name"
        val text2 = "\t\t$detail"

        tvDataReceived.text = text
        tvDataReceived2.text = text2
        Glide.with(this)
            .load(photo)
            .apply(RequestOptions().override(750, 750))
            .into(imgPhoto)
    }
}
