package com.rinfinity.games.application.moduleconfigs

import android.util.Log
import com.rinfinity.common_module.interfaces.IModuleTracker
import com.rinfinity.games.application.dagger_hilt.NAMED_MODULE_NAME
import javax.inject.Inject
import javax.inject.Named

class ModuleTrackerImpl @Inject constructor(@Named(NAMED_MODULE_NAME) private val moduleName: String): IModuleTracker {

    override fun trackModule(trackEvent: String) {
        Log.d(this.javaClass.simpleName, trackEvent + "Module $moduleName")
    }

}