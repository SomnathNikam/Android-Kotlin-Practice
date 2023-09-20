package com.example.optionmenubar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.option_bar,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.item1 -> Toast.makeText(this,"Search",Toast.LENGTH_LONG).show()
            R.id.item2 -> Toast.makeText(this,"Contact",Toast.LENGTH_LONG).show()
            R.id.item3 -> Toast.makeText(this,"Settings",Toast.LENGTH_LONG).show()
            R.id.item4 -> Toast.makeText(this,"Share",Toast.LENGTH_LONG).show()
        }

        return super.onOptionsItemSelected(item)
    }
}