package com.rinfinity.games.application.dagger_hilt.component

import com.rinfinity.games.application.NetworkService
import com.rinfinity.games.application.dagger_hilt.module.NetworkServiceModule
import dagger.Component
import dagger.Module
import javax.inject.Singleton


@Singleton
@Component(modules = [NetworkServiceModule::class])
interface GamesApplicationComponent {
    fun getNetworkService(): NetworkService
}