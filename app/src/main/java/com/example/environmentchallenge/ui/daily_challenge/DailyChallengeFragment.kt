package com.example.environmentchallenge.ui.daily_challenge

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer

import com.example.environmentchallenge.R

class DailyChallengeFragment : Fragment() {

    companion object {
        fun newInstance() = DailyChallengeFragment()
    }

    private lateinit var dailyChallengeViewModel: DailyChallengeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dailyChallengeViewModel =
            ViewModelProviders.of(this).get(DailyChallengeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_daily_challenge, container, false)
        val textView: TextView = root.findViewById(R.id.text_daily_challenge)
        dailyChallengeViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }

//    override fun onActivityCreated(savedInstanceState: Bundle?) {
//        super.onActivityCreated(savedInstanceState)
//        dailyChallengeViewModel = ViewModelProviders.of(this).get(DailyChallengeViewModel::class.java)
//        // TODO: Use the ViewModel
//
//    }


}
