package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn.setOnClickListener{
            val real = binding.editNumero.text.toString().toDouble()
            val euro = String.format("%.2f", real / 6.24)
            val dolar = String.format("%.2f", real * 0.18)
            val ienes = String.format("%.2f", real * 26.08)
            binding.txtRespEuro.text = "$euro€"
            binding.txtRespDolar.text = "$dolar$"
            binding.txtRespIene.text = "$ienes¥"

        }

        }
    }
