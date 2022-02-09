package com.example.t3f

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<MaterialButton>(R.id.Linear).setOnClickListener {
            Intent(this, Linear::class.java).also {
                startActivity(it)
            }
        }

        findViewById<MaterialButton>(R.id.Grid).setOnClickListener {
            Intent(this, Grid::class.java).also {
                startActivity(it)
            }
        }

        findViewById<MaterialButton>(R.id.Table).setOnClickListener {
            Intent(this, Table::class.java).also {
                startActivity(it)
            }
        }

        findViewById<MaterialButton>(R.id.Relative).setOnClickListener {
            Intent(this, Relative::class.java).also {
                startActivity(it)
            }
        }


    }
}