package com.example.library.paging

import androidx.paging.PagedListAdapter
import android.content.Context
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * @author  : Alex
 * @date    : 2018/08/21
 * @version : V 2.0.0
 */
abstract class BasePagingAdapter<T>(diffCallback: DiffUtil.ItemCallback<T>) : PagedListAdapter<T, BasePagingAdapter<T>.ViewHolder>(diffCallback) {

    lateinit var context: Context
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        return ViewHolder(LayoutInflater.from(parent.context).inflate(getItemLayout(), parent, false))
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        bind(holder, getItem(position)!!, position)
    }

    inner class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        private val map = mutableMapOf<Int, View>()

        fun getView(id: Int): View? {
            var viewId = map[id]
            if (viewId == null) {
                viewId = view.findViewById(id)
                map[id] = viewId
            }
            return viewId
        }

        fun setText(id: Int, string: String?) {
            val textView = getView(id)
            if (textView is TextView) {
                textView.text = string
            }
        }


    }


    abstract fun bind(holder: ViewHolder, t: T, position: Int)

    abstract fun getItemLayout(): Int
}