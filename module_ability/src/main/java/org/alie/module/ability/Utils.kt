package org.alie.module.ability

import android.content.Context

object Utils {
    fun getErrorTip(context:Context):String {
       return context.getString(R.string.error_tip)
    }
}