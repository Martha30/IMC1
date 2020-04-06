package com.example.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnIMC.setOnClickListener(View.OnClickListener {
            val peso = edtPeso.text.toString().toDouble() / 2.2

            val altura = edtAltura.text.toString().toDouble() /100

            val imc = peso / (altura * altura)

            var diagnostico:String =""

            if (imc < 17)
            {
                diagnostico = "Esta muy bajo de peso"
            }
            else if (imc < 18.49)
            {
                diagnostico = "Esta abajo del peso normal"
            }
            else if (imc < 24.99)
            {
                diagnostico = "Tiene un peso normal"
            }
            else if (imc < 29.99)
            {
                diagnostico = "Esta por encima del peso normal"
            }
            else
            {
                diagnostico = "Tiene Obesidad "
            }

            Toast.makeText(this, diagnostico, Toast.LENGTH_LONG).show()

        })


    }
}

