package com.autonture.socialrutravel.WorkApi

import android.os.Handler
import android.os.Looper

object ThreadUtil {
    private val handler = Handler(Looper.getMainLooper())

    fun runOnUiThread(action: () -> Unit) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            handler.post(action)
        } else {
            action.invoke()
        }
    }
}