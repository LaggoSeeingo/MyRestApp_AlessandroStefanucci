package com.example.myrestapp_alessandrostefanucci

import android.os.Bundle
import android.text.InputType
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var txtUsername: InputType
    private lateinit var txtPassword: InputType

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
       /* ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        */


        val users = arrayOf("User1", "User2","User3")
        val pwds = arrayOf("123","456","789")

        var btnInvia : Button = findViewById(R.id.activity_main__btnInvia)

        btnInvia.setOnClickListener(View.OnClickListener {
            var toast = Toast.makeText(this, R.string.toastInvia, Toast.LENGTH_LONG)
            toast.show()
            valida()
        })

    }

    private fun valida(){

    }
}