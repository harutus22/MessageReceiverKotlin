package com.example.messagereceiverkotlin

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class MyMessageReceiver: BroadcastReceiver() {
    private val MESSAGE = "message"

    var message: String? = null
    get() = if (field == null) "There is no message" else field

    override fun onReceive(context: Context?, intent: Intent?) {
        message = intent?.getStringExtra(MESSAGE)
    }
}