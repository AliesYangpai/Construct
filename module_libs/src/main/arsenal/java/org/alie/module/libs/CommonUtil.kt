package org.alie.module.libs

import org.alie.libarsenal.ArsenalMgr

object CommonUtil {
    fun getLibSign():String = ArsenalMgr.getType()
}