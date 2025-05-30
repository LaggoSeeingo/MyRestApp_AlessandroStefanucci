package com.example.myrestapp_alessandrostefanucci

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }*/

        var btnSearch : Button = findViewById(R.id.activity_menu__btnSearch)
        var btnWebView : Button = findViewById(R.id.activity_menu__btnWebView)
        var btnRest : Button = findViewById(R.id.activity_menu__btnRest)

        btnSearch.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)
        })

        btnWebView.setOnClickListener(View.OnClickListener {
            /*var toast = Toast.makeText(this, "Activity in via di sviluppo", Toast.LENGTH_LONG)
            toast.show()*/
            val intent = Intent(this, WebViewActivity::class.java)
            startActivity(intent)
        })

        btnRest.setOnClickListener(View.OnClickListener {
            var toast = Toast.makeText(this, "Activity in via di sviluppo", Toast.LENGTH_LONG)
            toast.show()
            /*val intent = Intent(this, RestActivity::class.java)
            startActivity(intent)*/
        })
    }
}
