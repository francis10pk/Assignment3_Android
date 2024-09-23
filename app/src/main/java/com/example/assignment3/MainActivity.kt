package com.example.assignment3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var buttonhome: Button
    private lateinit var buttonplaces: Button
    private lateinit var buttonhistory: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        newHomePage()
        newPlacePage()
        newHistoryPage()
    }

    private fun newHomePage(){
        buttonhome = findViewById(R.id.item_1)
        buttonhome.setOnClickListener() {
            val intent = Intent(this, HomePage::class.java)
            startActivity(intent)
        }
    }
    private fun newPlacePage(){
        buttonplaces = findViewById(R.id.item_2)
        buttonplaces.setOnClickListener() {
            val intent = Intent(this, Places::class.java)
            startActivity(intent)
        }
    }
    private fun newHistoryPage(){
        buttonhistory = findViewById(R.id.item_3)
        buttonhistory.setOnClickListener() {
            val intent = Intent(this, History::class.java)
            startActivity(intent)
        }
    }

}