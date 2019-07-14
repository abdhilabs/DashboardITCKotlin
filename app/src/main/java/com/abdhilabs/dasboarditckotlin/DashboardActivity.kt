package com.abdhilabs.dasboarditckotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class DashboardActivity : AppCompatActivity() {

    private lateinit var tvUser: TextView
    private lateinit var tvNama: TextView
    private lateinit var tvEmail: TextView
    private lateinit var tvAsal: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        tvUser = findViewById(R.id.getUser)
        tvNama = findViewById(R.id.getNama)
        tvEmail = findViewById(R.id.getEmail)
        tvAsal = findViewById(R.id.getAsal)

        val strUser = intent.getStringExtra("USER")
        val strNama = intent.getStringExtra("NAMA")
        val strEmail = intent.getStringExtra("EMAIL")
        val strAsal = intent.getStringExtra("ASAL")

        tvUser.text = strUser
        tvNama.text = strNama
        tvEmail.text = strEmail
        tvAsal.text = strAsal

    }
}