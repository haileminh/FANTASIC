package hailm.com.fantasic.view


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import hailm.com.fantasic.R
import hailm.com.fantasic.base.BaseFragment

class TopicDetailFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_topic_detail, container, false)
    }


}
