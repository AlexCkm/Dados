package com.example.dados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.dados.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val dados =  arrayOf(
        R.drawable.dice1, //entero
        R.drawable.dice2,
        R.drawable.dice3,
        R.drawable.dice4,
        R.drawable.dice5,
        R.drawable.dice6)

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        }
    fun dados(view: View){
        val num = Random.nextInt(1,7)
        val num2 = Random.nextInt(1,7)
        binding.imageView.setImageResource(dados[num-1])
        binding.imageView2.setImageResource(dados[num2-1])
        binding.tvResultado.text = (num+num2).toString()

    }
}


