package com.example.proyecto010reto5f2023

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val boton1=findViewById<Button>(R.id.button)
        val clave=findViewById<EditText>(R.id.et1)
        boton1.setOnClickListener {
            val intento1 = Intent(this, AcerdaDe::class.java)
            if(clave.text.toString()=="abc123") {
                startActivity(intento1)
                Toast.makeText(this, "introduciste la clave correcta", Toast.LENGTH_SHORT).show()
            }
            else{

                Toast.makeText(this, "No introduciste la clave correcta", Toast.LENGTH_SHORT).show()
            }

        }
    }
}