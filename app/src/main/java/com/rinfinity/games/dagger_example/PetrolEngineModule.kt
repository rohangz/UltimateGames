package com.rinfinity.games.dagger_example

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@InstallIn(ApplicationComponent::class)
@Module
class PetrolEngineModule {

    companion object {
        @Provides
        @JvmStatic
        fun provideEngine(engine: PetrolEngine): Engine {
            return engine
        }
    }

}