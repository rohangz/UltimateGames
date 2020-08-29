package com.rinfinity.tic_tac_toe

import java.lang.Exception

const val MODULE_INIT_ERROR = "TicTac Toe already Initialized"

class TicTacToeConfig private constructor(
    component: TicTacToeComponent
) {

    companion object {

        private var mInstance: TicTacToeConfig? = null

        @JvmStatic
        fun initialize(component: TicTacToeComponent) {
            if (mInstance == null)
                mInstance = TicTacToeConfig(component)
            else throw Exception(MODULE_INIT_ERROR)
        }

        val instance: TicTacToeConfig
            get() = mInstance!!
    }


    val eventProcessor = component.getAppEventProcessor()
    val appNavigator = component.getAppNavigator()
    val moduleTracker = component.getModuleTracker()
    val application = component.getApplication()
    val context = component.getContext()
}