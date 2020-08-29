package com.rinfinity.games.home.view.fragment

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import com.rinfinity.games.R
import com.rinfinity.games.application.GamesApplication
import com.rinfinity.games.application.dagger_hilt.component.DaggerGamesApplicationComponent
import com.rinfinity.games.dagger_example.Car
import com.rinfinity.games.dagger_example.DaggerCarComponent
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class GamesFragment: Fragment(R.layout.fragment_games) {

    private lateinit var mCar: Car

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e(this.javaClass.simpleName, "Network Service: ${DaggerGamesApplicationComponent.create().getNetworkService().hashCode()}")
        mCar = DaggerCarComponent.builder().engineType("1234").horsePower(15000).engineCapacity(16000).build().getCar()
        mCar.drive()
        Log.e(this.javaClass.simpleName, "mCar == $mCar")
    }
}