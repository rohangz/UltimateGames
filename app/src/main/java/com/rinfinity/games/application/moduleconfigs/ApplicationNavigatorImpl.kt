package com.rinfinity.games.application.moduleconfigs

import android.content.Context
import android.widget.Toast
import com.rinfinity.common_module.interfaces.IApplicationNavigator
import javax.inject.Inject

class ApplicationNavigatorImpl @Inject constructor() : IApplicationNavigator {


    override fun navigateDeepLink(context: Context, deepLink: String) {
        Toast.makeText(context, deepLink, Toast.LENGTH_SHORT).show()
    }

}