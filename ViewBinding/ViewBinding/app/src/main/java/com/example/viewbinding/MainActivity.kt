package com.example.viewbinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // viewbinding is initialed by latenit keyword

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // Enabled the view binding by putting the below line of code in build.gradle.kts(Module:app)

//        buildFeatures{
//            viewBinding = true
//        }
       // View binding is a feature that makes it easier to write code that interacts with views.
        // Once view binding is enabled in a module, it generates a binding class for each XML layout file present in that module.

        //ViewBinding is used to remove consistent use of findViewById

        binding.button.setOnClickListener {
            val i = Intent(this,MainActivity2::class.java)
            startActivity(i)
        }
    }
}