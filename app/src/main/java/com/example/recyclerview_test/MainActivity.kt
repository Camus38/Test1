package com.example.recyclerview_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview_test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy{ActivityMainBinding.inflate(layoutInflater)}
    lateinit var myViewmodel : MyViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        myViewmodel = ViewModelProvider(this,ViewModelProvider.NewInstanceFactory())
            .get(MyViewModel::class.java)

        val adapter = MyAdapter(myViewmodel)

        binding.recycleview.layoutManager = LinearLayoutManager(this)
        binding.recycleview.setHasFixedSize(true)
        binding.recycleview.adapter=adapter



    }


}