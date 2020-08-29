package com.rinfinity.games.dagger_example

import dagger.BindsInstance
import dagger.Component
import javax.inject.Named
import javax.inject.Singleton

@Singleton
@Component(modules = [PetrolEngineModule::class])
interface CarComponent {

    fun getCar(): Car

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun horsePower(@Named(NAMED_HORSE_POWER) horsePower: Int): Builder

        @BindsInstance
        fun engineCapacity(@Named(NAMED_ENGINE_CAPACITY) engineCapacity: Int): Builder

        @BindsInstance
        fun engineType(@Named(NAMED_ENGINE_TYPE) engineType: String): Builder

        fun build(): CarComponent
    }
}