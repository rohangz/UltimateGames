package com.rinfinity.games.home.view.adapter.viewholder

import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.paging.LoadState
import com.rinfinity.common_module.adapter.view_holder.BaseViewHolder
import kotlinx.android.synthetic.main.item_list_loader_lyt.view.*

class LoadStateVIewHolder(root: View) : BaseViewHolder(root) {
    override fun bindData(data: Any, position: Int) {
        itemView.app_loader_item.visibility =
            if (data is LoadState.Loading) View.VISIBLE else View.GONE
        val layoutParams = itemView.layoutParams as ConstraintLayout.LayoutParams
        if (data is LoadState.Loading) {
            layoutParams.width = ConstraintLayout.LayoutParams.MATCH_PARENT
            layoutParams.height = ConstraintLayout.LayoutParams.WRAP_CONTENT
        } else {
            layoutParams.width = 0
            layoutParams.height = 0
        }
    }

}