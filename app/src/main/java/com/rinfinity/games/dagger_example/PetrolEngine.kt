package com.rinfinity.games.dagger_example

import android.util.Log
import javax.annotation.Nullable
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine @Inject constructor(
    @Named(NAMED_HORSE_POWER) private val horsePower: Int,
    @Named(NAMED_ENGINE_CAPACITY) private val engineCapacity: Int,
    @Named(NAMED_ENGINE_TYPE) @Nullable private val engineType: String?
) : Engine {
    override fun start() {
        Log.d(
            this.javaClass.simpleName,
            "Petrol Engine HP: $horsePower EC: $engineCapacity EType: $engineType"
        )
    }
}