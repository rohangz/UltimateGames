package com.rinfinity.games.home.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.cachedIn
import com.rinfinity.games.TEST_PAGE_SIZE
import com.rinfinity.games.home.view.repo.HomePagingSource
import com.rinfinity.games.home.view.repo.HomeRepo

class HomeViewModel(application: Application): AndroidViewModel(application) {

    val mPager = Pager(PagingConfig(pageSize = TEST_PAGE_SIZE)) {
        HomeRepo.mHomePagingSource
    }.flow

}