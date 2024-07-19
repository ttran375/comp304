package com.example.android.simplecoroutineexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import com.example.android.simplecoroutineexample.databinding.ActivityMainBinding
import kotlinx.coroutines.delay


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // Launch a new coroutine without blocking the current thread and returns
        // a reference to the coroutine as a Job.
        // The coroutine is cancelled when the resulting job is cancelled.
        CoroutineScope(Dispatchers.IO).launch {
            makeApiCalls()
        }
    }
    //
    private suspend fun makeApiCalls() {
        val result1 = fetchDataFromFirstApi()
        println("Result $result1")
        val result2 = fetchDataFromSecondApi()
        println("Result $result2")

    }

    private suspend fun fetchDataFromFirstApi(): String {
        delay(1000)
        return "Result 1"
    }

    private suspend fun fetchDataFromSecondApi(): String {
        delay(2000)
        return "Result 2"
    }
}