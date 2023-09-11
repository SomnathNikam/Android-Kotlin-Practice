package com.example.bottom_nav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.bottom_nav.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(HomeFragm())

        binding.bottomNav.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home -> replaceFragment(HomeFragm())

                R.id.info -> replaceFragment(InfoFragment())
                R.id.trending -> replaceFragment(trendsFragment())

                R.id.trending -> replaceFragment(SettingsFragment())
                else -> {

                }

            }
            true
        }

    }
    private fun replaceFragment(fragment: Fragment){
        val FragmentManager=supportFragmentManager
        val FragmentTransaction = FragmentManager.beginTransaction()
        FragmentTransaction.replace(R.id.frameLayout,fragment)
        FragmentTransaction.commit()
    }
}