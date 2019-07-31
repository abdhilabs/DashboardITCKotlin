package com.abdhilabs.dasboarditckotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSimpan.setOnClickListener {
            val strNama = eNama.text.toString()
            val strUser = eUser.text.toString()
            val strEmail = eEmail.text.toString()
            val strAsal = eAsal.text.toString()

            val intent = Intent(this, DashboardActivity::class.java)
            intent.putExtra("NAMA", strNama)
            intent.putExtra("USER", strUser)
            intent.putExtra("EMAIL", strEmail)
            intent.putExtra("ASAL", strAsal)
            startActivity(intent)
        }
    }
}