package com.cibertec.myciberapps01

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val buttonIniciarSesion = findViewById<Button>(R.id.buttonRegresar)

        buttonIniciarSesion.setOnClickListener {
            val resultIntent = Intent()
            resultIntent.putExtra("data_key", "Hola desde SecondActivity")
            setResult(Activity.RESULT_OK, resultIntent)
            finish()
        }
    }
}