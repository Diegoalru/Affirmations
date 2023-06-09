package com.darssolutions.affirmations

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.darssolutions.affirmations.data.Datasource
import com.darssolutions.affirmations.databinding.ActivityMainBinding

class MainActivity: AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.affirmationTextView.text = "Size: ${Datasource().loadAffirmations().size}"
    }
}