package com.rinfinity.common_module.interfaces

import android.content.Context

interface IApplicationNavigator {

    fun navigateDeepLink(context: Context, deepLink: String)

}