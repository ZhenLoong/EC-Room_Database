package com.example.environmentchallenge.ui.weekly_challenge

import android.app.Application
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.ContentView
import androidx.lifecycle.Observer

import com.example.environmentchallenge.R
import kotlinx.android.synthetic.main.fragment_weekly_challenge.*

class WeeklyChallengeFragment : Fragment() {

    companion object {
        fun newInstance() = WeeklyChallengeFragment()
    }

    private lateinit var weeklyChallengeViewModel: WeeklyChallengeViewModel
    private var currentProgress: Int = 0;
    private var string:String = "Count is 0"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        weeklyChallengeViewModel = ViewModelProviders.of(this).get(WeeklyChallengeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_weekly_challenge, container, false)
        val textView: TextView = root.findViewById(R.id.text_weekly_challenge)

        var doneButton=root.findViewById<Button>(R.id.done_btn)
        var progressBar=root.findViewById<ProgressBar>(R.id.progress_bar)
        //var progressBarText=root.findViewById<TextView>(R.id.progress_bar_text)

        if(savedInstanceState!=null)
        {
            weeklyChallengeViewModel.count=savedInstanceState.getInt("MyCurrentProgress")
        }

        progressBar.setProgress(weeklyChallengeViewModel.count)
        doneButton.setOnClickListener {
            progressBar.setProgress(weeklyChallengeViewModel.addProgress())
        }

        weeklyChallengeViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root    }

    override fun onSaveInstanceState(outBundle: Bundle) {
        super.onSaveInstanceState(outBundle);

        outBundle.putInt("MyCurrentProgress",weeklyChallengeViewModel.count )

    }
}

