package org.alie.construct

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.alie.construct.databinding.ActivityMainBinding
import org.alie.module.ability.Utils

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ActivityMainBinding.inflate(layoutInflater).also {
            binding = it
        }.root)
        val tip = binding.tv1.text.toString()
        val newTip = tip + " "+ Utils.getErrorTip(this) +" " + Utils.getLibTip()
        binding.tv1.text = newTip
    }
}