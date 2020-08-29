package com.rinfinity.games.dagger_example

import javax.inject.Inject

class Car @Inject constructor(val engine: Engine, val driver: Driver) {

    fun drive() {
        engine.start()
        driver.drive()
    }

}