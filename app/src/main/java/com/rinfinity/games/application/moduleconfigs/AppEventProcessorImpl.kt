package com.rinfinity.games.application.moduleconfigs

import android.util.Log
import com.rinfinity.common_module.interfaces.IApplicationEventProcessor
import javax.inject.Inject

class AppEventProcessorImpl @Inject constructor() : IApplicationEventProcessor {
    override fun processEvent(eventParams: HashMap<String, String>) {
        Log.d(this.javaClass.simpleName, eventParams.toString())
    }

}