package com.abdhilabs.dasboarditckotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_dashboard.*

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val strUser = intent.getStringExtra("USER")
        val strNama = intent.getStringExtra("NAMA")
        val strEmail = intent.getStringExtra("EMAIL")
        val strAsal = intent.getStringExtra("ASAL")

        setUser.text = strUser
        setNama.text = strNama
        setEmail.text = strEmail
        setAsal.text = strAsal
    }
}