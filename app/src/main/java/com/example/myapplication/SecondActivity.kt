package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.random.Random
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    private lateinit var textview_random: TextView
    private lateinit var textview_label: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        textview_random = findViewById(R.id.textview_random)
        textview_label = findViewById(R.id.textview_label)
        showRandomNumber()
    }

    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    private fun showRandomNumber() {
        // Get the count from the intent extras
        val count = intent.getIntExtra(TOTAL_COUNT, 0)
        // Generate the random number
        val random = Random.Default
        val randomInt = random.nextInt(count + 1)
        // Display the random number.
        textview_random.text = randomInt.toString()
        // Substitute the max value into the string resource
        // for the heading, and update the heading
    }
}
