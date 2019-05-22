package es.sdos.android.databindingwithflavors

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHistoryAdapter(private val data: List<String>) : RecyclerView.Adapter<ViewHistoryAdapter.ViewHistoryViewHolder>() {

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHistoryViewHolder {
    return ViewHistoryViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.row__main, parent, false))
  }

  override fun getItemCount(): Int {
    return data.size
  }

  override fun onBindViewHolder(holder: ViewHistoryViewHolder, position: Int) {
    holder.name.text = data[position]
  }

  class ViewHistoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val name: TextView

    init {
      name = itemView.findViewById(R.id.name)
    }
  }
}