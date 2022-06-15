package com.example.dados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.dados.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        }
    fun dados(view: View){
        val num = Random.nextInt(1,7)
        val num2 = Random.nextInt(1,7)
        binding.imageView.setImageResource(R.drawable.dice1)
        binding.imageView2.setImageResource(R.drawable.dice2)
        val d1 = (1..6).random()
        val d2 = (1..6).random()
        val numeros = when (d1) {
            1->R.drawable.dice1
            2->R.drawable.dice2
            3->R.drawable.dice3
            4->R.drawable.dice4
            5->R.drawable.dice5
            else->R.drawable.dice6

        }
    }
}


