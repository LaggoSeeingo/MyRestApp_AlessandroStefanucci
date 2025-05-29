package com.example.myrestapp_alessandrostefanucci

import android.content.Intent
import android.os.Bundle
import android.text.InputType
import android.view.Menu
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
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
        var imgLogo: ImageView = findViewById<ImageView>(R.id.activity_main__imgLogo)

        imgLogo.setImageResource(R.drawable.cinema)

        btnInvia.setOnClickListener(View.OnClickListener {
            valida(users, pwds)
        })

    }

    private fun valida(users: Array<String>, pwds: Array<String>) {
        var user = findViewById<EditText>(R.id.activity_main__txtUsername)
        var userTXT = user.text.toString()
        var pwd = findViewById<EditText>(R.id.activity_main__txtPassword)
        var pwdTXT = pwd.text.toString()

        for(i in users.indices){
                if(users[i].contentEquals(userTXT) && pwds[i].contentEquals(pwdTXT)){
                    val intent = Intent(this, MenuActivity::class.java)
                    var toast = Toast.makeText(this, R.string.toastAccesso, Toast.LENGTH_LONG)
                    toast.show()
                    startActivity(intent)
                    return
                }
            }

            var toast = Toast.makeText(this, R.string.toastNegato, Toast.LENGTH_LONG)
            toast.show()
            user.setText("")
            pwd.setText("")
    }
}