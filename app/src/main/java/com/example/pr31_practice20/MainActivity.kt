package com.example.pr31_practice20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var snackbar: Snackbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun click(view: View) {
        snackbar = Snackbar.make(view, "You pressed the button", Snackbar.LENGTH_LONG)
        snackbar.setAction("Next...", View.OnClickListener { Toast.makeText(this,"Gde",Toast.LENGTH_LONG).show() }).show()
    }
}