package com.abdhilabs.dasboarditckotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var eNama: EditText
    private lateinit var eUser: EditText
    private lateinit var eEmail: EditText
    private lateinit var eAsal: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        eNama = findViewById(R.id.eNama)
        eUser = findViewById(R.id.eUser)
        eEmail = findViewById(R.id.eEmail)
        eAsal = findViewById(R.id.eAsal)
    }

    fun simpan(view: View) {
        val strNama = eNama.text.toString()
        val strUser = eUser.text.toString()
        val strEmail = eEmail.text.toString()
        val strAsal = eAsal.text.toString()

        val btnSimpan = Intent(this, DashboardActivity::class.java)
        btnSimpan.putExtra("USER", strUser)
        btnSimpan.putExtra("NAMA", strNama)
        btnSimpan.putExtra("EMAIL", strEmail)
        btnSimpan.putExtra("ASAL", strAsal)
        startActivity(btnSimpan)
    }
}