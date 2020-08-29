package com.rinfinity.games.home.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.rinfinity.games.R
import com.rinfinity.games.home.viewmodel.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_home.*

@AndroidEntryPoint
class HomeActivity : AppCompatActivity() {
    private lateinit var mViewModel: HomeViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        NavigationUI.setupWithNavController(
            app_bottom_navigation,
            Navigation.findNavController(this, app_nav_host_fragment.id)
        )
        initDependencies()
    }


    private fun initDependencies() {
        mViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        Log.d(this.javaClass.simpleName, mViewModel.toString())
    }
}