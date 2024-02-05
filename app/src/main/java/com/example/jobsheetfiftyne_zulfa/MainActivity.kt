package com.example.jobsheetfiftyne_zulfa

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "Aplikasi berjalan", Toast.LENGTH_SHORT).show()

        val Nama = findViewById<Button>(R.id.Nama)
        val Nis = findViewById<Button>(R.id.Nis)
        val Kelas = findViewById<Button>(R.id.Kelas)


        Nama.setOnClickListener {
            Toast.makeText(this,"ISTIANA ZULFA", Toast.LENGTH_SHORT).show()
        }
        Nis.setOnClickListener {
            Toast.makeText(this,"2233293", Toast.LENGTH_SHORT).show()
        }
        Kelas.setOnClickListener {
            Toast.makeText(this,"XI PPLG 2", Toast.LENGTH_SHORT).show()
        }
    }
}