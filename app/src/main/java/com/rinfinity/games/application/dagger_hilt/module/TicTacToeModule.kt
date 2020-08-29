package com.rinfinity.games.application.dagger_hilt.module

import android.app.Application
import android.content.Context
import com.rinfinity.common_module.interfaces.IApplicationEventProcessor
import com.rinfinity.common_module.interfaces.IApplicationNavigator
import com.rinfinity.common_module.interfaces.IModuleTracker
import com.rinfinity.games.application.GamesApplication
import com.rinfinity.games.application.dagger_hilt.NAMED_MODULE_NAME
import com.rinfinity.games.application.moduleconfigs.AppEventProcessorImpl
import com.rinfinity.games.application.moduleconfigs.ApplicationNavigatorImpl
import com.rinfinity.games.application.moduleconfigs.ModuleTrackerImpl
import dagger.Binds
import dagger.BindsInstance
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Named


@InstallIn(ApplicationComponent::class)
@Module
abstract class TicTacToeModule {

    companion object {
        @Provides
        fun getApplication(): Application {
            return GamesApplication.instance
        }

        @Provides
        fun getContext(): Context {
            return GamesApplication.instance
        }

    }

    @Binds
    abstract fun getAppNavigator(appNavigator: ApplicationNavigatorImpl): IApplicationNavigator

    @Binds
    abstract fun getAppEventProcessor(eventProcessorImpl: AppEventProcessorImpl): IApplicationEventProcessor

    @Binds
    abstract fun getModuleTracker(moduleTracker: ModuleTrackerImpl): IModuleTracker


}