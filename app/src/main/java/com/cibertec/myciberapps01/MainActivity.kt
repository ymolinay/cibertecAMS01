package com.cibertec.myciberapps01

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {

    private val startForResult =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                val intent = result.data
                val data = intent?.getStringExtra("data_key")

                Log.d("ACTIVITY ACTIVITY ACTIVITY ", data.toString())
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextUsuario = findViewById<EditText>(R.id.editTextUsuario)
        val editTextContrasena = findViewById<EditText>(R.id.editTextContrasena)
        val buttonIniciarSesion = findViewById<Button>(R.id.buttonIniciarSesion)

        buttonIniciarSesion.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
//            startActivity(intent)

            startForResult.launch(intent)
        }
    }
}