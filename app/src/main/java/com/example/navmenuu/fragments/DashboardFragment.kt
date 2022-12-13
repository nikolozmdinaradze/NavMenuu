package com.example.navmenuu.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.navmenuu.R


class DashboardFragment: Fragment(R.layout.activity_dashboard_fragment ) {

    private lateinit var editText: EditText
    private lateinit var button: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        editText = view.findViewById(R.id.editText)
        button = view.findViewById(R.id.button)

        button.setOnClickListener{


            val amount = editText.text.toString().toInt()

            val action = DashboardFragmentDirections.actionDashboardFragmentToNotificationFragment(amount)


            findNavController().navigate(action)
        }
    }
}