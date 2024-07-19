package com.example.android.kotlinflowexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.lifecycleScope
import com.example.android.kotlinflowexample.databinding.ActivityMainBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
//
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //
        val textView = findViewById(R.id.text_view_id) as TextView

        // Creates a cold flow from the given suspendable block.
        // The flow being cold means that the block is called every time
        // a terminal operator is applied to the resulting flow.
        val flow = flow<Int> {
            for (i in 1..10) {
                emit(i) // collects the value emitted by the upstream
                delay(1000L)
            }
        }
        // Launches a new coroutine without blocking the current thread
        // and returns a reference to the coroutine as a Job
        lifecycleScope.launch {
            flow.buffer().filter {
                it % 2 == 0
            }.map {
                it * it
            }.collect {
                println("debug: $it")
                textView.text = textView.text.toString() + "\n" + it.toString() + "\n"
                delay(2000L)
            }
        }
    }
}