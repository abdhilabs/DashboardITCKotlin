package com.abdhilabs.dasboarditckotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var nama: EditText
    private lateinit var user: EditText
    private lateinit var email: EditText
    private lateinit var asal: EditText
    private lateinit var simpan: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nama = findViewById(R.id.eNama)
        user = findViewById(R.id.eUser)
        email = findViewById(R.id.eEmail)
        asal = findViewById(R.id.eAsal)

        simpan = findViewById(R.id.btnSimpan)
        simpan.setOnClickListener {
            val strNama = nama.text.toString()
            val strUser = user.text.toString()
            val strEmail = email.text.toString()
            val strAsal = asal.text.toString()

            val btnSimpan = Intent(this, DashboardActivity::class.java)
            btnSimpan.putExtra("NAMA", strNama)
            btnSimpan.putExtra("USER", strUser)
            btnSimpan.putExtra("EMAIL", strEmail)
            btnSimpan.putExtra("ASAL", strAsal)
            startActivity(btnSimpan)
        }
    }
}