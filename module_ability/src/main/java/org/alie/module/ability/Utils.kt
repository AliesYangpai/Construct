package org.alie.module.ability

import android.content.Context
import org.alie.module.libs.CommonUtil

object Utils {
    fun getErrorTip(context:Context):String {
       return context.getString(R.string.error_tip)
    }


    fun getLibTip():String  = CommonUtil.getLibSign()
}