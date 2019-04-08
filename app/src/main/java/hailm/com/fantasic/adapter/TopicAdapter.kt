package hailm.com.fantasic.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import hailm.com.fantasic.R
import hailm.com.fantasic.listener.OnClickTopicListener
import hailm.com.fantasic.models.Topic
import kotlinx.android.synthetic.main.item_topic.view.*

class TopicAdapter(private val topicList: ArrayList<Topic>) : RecyclerView.Adapter<TopicAdapter.ViewHolder>() {
    private var listener: OnClickTopicListener? = null

    fun setOnClickListener(onClick: OnClickTopicListener) {
        listener = onClick
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_topic, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return topicList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvName.text = topicList[position].name

        holder.itemView.setOnClickListener {
            listener?.onItemClick(topicList[position].name.toString())
        }
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvName = itemView.tvNameTopic!!
    }
}