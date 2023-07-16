package org.alie.module.libs

import org.alie.libmilan.MilanMgr

object CommonUtil {
    fun getLibSign():String = MilanMgr.getType()
}