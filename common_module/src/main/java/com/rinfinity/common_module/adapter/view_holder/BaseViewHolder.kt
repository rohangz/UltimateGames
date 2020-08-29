package com.rinfinity.common_module.adapter.view_holder

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder(root: View): RecyclerView.ViewHolder(root) {

    abstract fun bindData(data: Any, position: Int)
}