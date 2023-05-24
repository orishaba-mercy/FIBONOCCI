package com.example.fibonocci

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fibonocci.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val size: Int = 0
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayNumbers()
    }
    fun displayNumbers():List<Int>{
        var number= mutableListOf<Int>()
        number.add(0)
        number.add(1)
        for (i in 2..101){
            number.add(number[i-1]+number[i-2])
        }
      binding.rvNumbers.layoutManager=LinearLayoutManager(this)
        val Numbers = null
        val numberAdapter= FibonocciRVAdapter(this,)
        binding.rvNumbers.adapter=numberAdapter
        return number
    }

    operator fun get(position: Int) {

    }


}