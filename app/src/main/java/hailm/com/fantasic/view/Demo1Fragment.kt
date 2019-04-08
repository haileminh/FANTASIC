package hailm.com.fantasic.view


import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import hailm.com.fantasic.R
import hailm.com.fantasic.adapter.TopicAdapter
import hailm.com.fantasic.listener.OnClickTopicListener
import hailm.com.fantasic.models.Topic
import kotlinx.android.synthetic.main.fragment_demo1.*

class Demo1Fragment : Fragment(), OnClickTopicListener {

    private var listTopic = ArrayList<Topic>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_demo1, container, false)
    }

    @SuppressLint("WrongConstant")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rcvListTopic.layoutManager = LinearLayoutManager(context, LinearLayout.VERTICAL, false)

        for (i in 1..30) {
            listTopic.add(Topic(i, "Topic $i", ""))
        }

        val topicAdapter = TopicAdapter(listTopic)
        rcvListTopic.adapter = topicAdapter

        topicAdapter.setOnClickListener(this)


    }

    override fun onItemClick(topic: String) {
        Toast.makeText(context, topic, Toast.LENGTH_SHORT).show()
    }
}
