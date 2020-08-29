package com.rinfinity.games.home.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.LoadState
import androidx.paging.LoadStateAdapter
import com.rinfinity.common_module.adapter.view_holder.BaseViewHolder
import com.rinfinity.games.R
import com.rinfinity.games.home.view.adapter.viewholder.LoadStateVIewHolder

class HomeLoadStateAdapter: LoadStateAdapter<BaseViewHolder>() {
    override fun onBindViewHolder(holder: BaseViewHolder, loadState: LoadState) {
        holder.bindData(loadState, holder.adapterPosition)
    }

    override fun onCreateViewHolder(parent: ViewGroup, loadState: LoadState): BaseViewHolder {
        val root = LayoutInflater.from(parent.context).inflate(R.layout.item_list_loader_lyt, parent, false)
        return LoadStateVIewHolder(root)
    }
}