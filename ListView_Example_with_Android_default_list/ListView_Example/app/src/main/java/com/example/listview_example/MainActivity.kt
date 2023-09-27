package com.example.listview_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import com.example.listview_example.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val taskList = arrayListOf<String>()
        taskList.add("AttendExam")
        taskList.add("Complete the App dev Projects")
        taskList.add("Do Assignment")
        taskList.add("Do Study for College Exam")
        taskList.add("Do DSA & Development" )
        taskList.add("Complte Assignment")
                taskList.add("Search for job")
//                taskList.add("Do Assignment")
//                taskList.add("Do Study for College Exam")
//                taskList.add("Do DSA & Development")



        val adapterformyListView=ArrayAdapter(this, android.R.layout.simple_list_item_1, taskList)
        binding.ListView.adapter=adapterformyListView

        binding.ListView.setOnItemClickListener { parent, view, position, id ->
            val text = "Clicked on this item " + (view as TextView).text.toString()

                Toast.makeText(this,text,Toast.LENGTH_LONG).show()

        }
    }
}