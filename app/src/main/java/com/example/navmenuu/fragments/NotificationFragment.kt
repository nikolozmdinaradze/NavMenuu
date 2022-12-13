package com.example.navmenuu.fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.navmenuu.R

class NotificationFragment: Fragment(R.layout.activity_notification_fragment) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.Textview).text =
            NotificationFragmentArgs.fromBundle(requireArguments()).amount.toString()


    }
}