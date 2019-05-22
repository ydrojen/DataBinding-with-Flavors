package es.sdos.android.databindingwithflavors

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView

object HomeBinding {

  @BindingAdapter("data")
  @JvmStatic
  fun setData(recyclerView: RecyclerView, data: List<String>?) {
    data?.let { recyclerView.adapter = ViewHistoryAdapter(it) }
  }
}