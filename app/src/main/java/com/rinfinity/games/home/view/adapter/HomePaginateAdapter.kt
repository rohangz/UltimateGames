package com.rinfinity.games.home.view.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.paging.PagedList
import androidx.paging.PagedListAdapter
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import com.rinfinity.common_module.adapter.view_holder.BaseViewHolder
import com.rinfinity.games.R
import com.rinfinity.games.home.view.model.HomeListModel
import kotlinx.android.synthetic.main.item_home_lyt.view.*

class HomePaginateAdapter : PagingDataAdapter<Any, BaseViewHolder>(DIFF_CALLBACK) {

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Any>() {
            override fun areItemsTheSame(oldItem: Any, newItem: Any): Boolean {
                return oldItem == newItem
            }

            @SuppressLint("DiffUtilEquals")
            override fun areContentsTheSame(oldItem: Any, newItem: Any): Boolean {
                return oldItem.hashCode() == newItem.hashCode()
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewxType: Int): BaseViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_home_lyt, parent, false)
        return ItemHomeViewHolder(view)
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) =
        holder.bindData(getItem(position)!!, position)

    inner class ItemHomeViewHolder(root: View): BaseViewHolder(root) {

        override fun bindData(data: Any, position: Int) {
            itemView.item_home_data.text = (data as HomeListModel).text
        }

    }
}