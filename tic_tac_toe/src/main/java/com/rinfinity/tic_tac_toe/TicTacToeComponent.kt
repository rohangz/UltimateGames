package com.rinfinity.tic_tac_toe

import android.app.Application
import android.content.Context
import com.rinfinity.common_module.interfaces.IApplicationEventProcessor
import com.rinfinity.common_module.interfaces.IApplicationNavigator
import com.rinfinity.common_module.interfaces.IModuleTracker

interface TicTacToeComponent {
    fun getAppNavigator(): IApplicationNavigator
    fun getAppEventProcessor(): IApplicationEventProcessor
    fun getModuleTracker(): IModuleTracker
    fun getApplication(): Application
    fun getContext(): Context
}