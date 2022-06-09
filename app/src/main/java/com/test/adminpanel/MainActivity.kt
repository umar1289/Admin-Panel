package com.test.adminpanel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.navigation.Navigation
import com.test.adminpanel.Models.Word
import com.test.adminpanel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var list: ArrayList<String>
    lateinit var word: ArrayList<Word>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadData()

        binding.spinner.adapter =
            ArrayAdapter(this, android.R.layout.simple_spinner_item, list)

        word = ArrayList()
        binding.save.setOnClickListener {
            word.add(
                Word(
                    binding.edtUzb.text.toString(),
                    binding.edtEng.text.toString(),
                    list[binding.spinner.selectedItemPosition]
                )
            )
        }
    }

    fun loadData() {
        list = ArrayList()
        list.add("Meva")
        list.add("Sport")
        list.add("Shaxs")
        list.add("Hayvon")
    }
}