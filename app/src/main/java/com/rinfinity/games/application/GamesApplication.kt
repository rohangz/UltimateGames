package com.rinfinity.games.application

import android.app.Application
import com.rinfinity.games.application.dagger_hilt.component.DaggerGamesApplicationComponent
import com.rinfinity.games.application.dagger_hilt.component.DaggerTicTacToeInitComponent
import com.rinfinity.tic_tac_toe.TicTacToeConfig
import dagger.hilt.android.HiltAndroidApp

private lateinit var gameApplicationInstance: GamesApplication

@HiltAndroidApp
class GamesApplication : Application() {
    private lateinit var mNetworkService: NetworkService

    val networkService: NetworkService
        get() = mNetworkService

    override fun onCreate() {
        super.onCreate()
        gameApplicationInstance = this
        mNetworkService = DaggerGamesApplicationComponent.create().getNetworkService()
        TicTacToeConfig.initialize(DaggerTicTacToeInitComponent.builder().moduleName("TicTacToe").build())
    }

    companion object {
        val instance: GamesApplication
            get() = gameApplicationInstance
    }
}