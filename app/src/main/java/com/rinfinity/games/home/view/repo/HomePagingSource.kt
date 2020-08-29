package com.rinfinity.games.home.view.repo

import androidx.paging.PagingSource
import com.rinfinity.games.TEST_PAGE_SIZE
import com.rinfinity.games.home.view.model.HomeListModel
import kotlinx.coroutines.delay
import java.lang.Exception


const val DEFAULT_PAGE_NUM = 1

class HomePagingSource : PagingSource<Int, Any>() {
    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Any> {
        return try {
            val nextPageNumber = params.key ?: DEFAULT_PAGE_NUM
            val response = ArrayList<Any>()
            for(i in 1..TEST_PAGE_SIZE)
                response.add(HomeListModel("$i is my Index"))
            LoadResult.Page(
                data = response,
                prevKey = null,
                nextKey = if(nextPageNumber<5) nextPageNumber + 1 else null
            )
        } catch (e: Exception) {
            LoadResult.Error(e)
        }

    }
}