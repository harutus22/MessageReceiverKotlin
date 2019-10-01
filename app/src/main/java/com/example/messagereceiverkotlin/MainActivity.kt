package com.example.messagereceiverkotlin

import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val CUSTOM_ACTION = "custom_action"

    private var receiver: MyMessageReceiver = MyMessageReceiver()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        registerReceiver(receiver, IntentFilter(CUSTOM_ACTION))
    }

    override fun onResume() {
        super.onResume()
        messageField.text = receiver.message
    }
}
