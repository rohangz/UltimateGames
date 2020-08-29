package com.rinfinity.games.home.view.fragment

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rinfinity.games.R
import com.rinfinity.games.application.GamesApplication
import com.rinfinity.games.dagger_example.Car
import com.rinfinity.games.home.view.adapter.HomeLoadStateAdapter
import com.rinfinity.games.home.view.adapter.HomePaginateAdapter
import com.rinfinity.games.home.viewmodel.HomeViewModel
import com.rinfinity.tic_tac_toe.TicTacToeConfig
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.coroutines.flow.collectLatest

@AndroidEntryPoint
class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var mAdapter: HomePaginateAdapter
    private lateinit var mHomeViewModel: HomeViewModel
    private lateinit var mCar: Car
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mHomeViewModel = ViewModelProvider(requireActivity()).get(HomeViewModel::class.java)
        Log.d(this.javaClass.simpleName, mHomeViewModel.toString())
        initPage()
        Toast.makeText(requireContext(),
            GamesApplication.instance.networkService.hashCode().toString(),
            Toast.LENGTH_LONG
        ).show()
    }

    private fun initPage() {
        mAdapter = HomePaginateAdapter()
        mAdapter.withLoadStateHeaderAndFooter(
            header = HomeLoadStateAdapter(),
            footer = HomeLoadStateAdapter()
        )
        app_home_list.adapter = mAdapter
        app_home_list.layoutManager =
            LinearLayoutManager(requireActivity(), RecyclerView.VERTICAL, false)
        lifecycleScope.launchWhenCreated {
            mHomeViewModel.mPager.collectLatest { data ->
                mAdapter.submitData(data)
            }
        }
        TicTacToeConfig.instance.appNavigator.navigateDeepLink(requireActivity(), "Test link")
        val map = HashMap<String, String>()
        map["1234"] = "1234"
        TicTacToeConfig.instance.eventProcessor.processEvent(HashMap())
        TicTacToeConfig.instance.moduleTracker.trackModule("My Track String")
    }

}