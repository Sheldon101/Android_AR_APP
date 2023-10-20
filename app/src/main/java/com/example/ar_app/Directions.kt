package com.example.ar_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class Directions : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_directions, container, false)
        // set header text
        val headerTitle = rootView.findViewById<TextView>(R.id.page_header)
        headerTitle.text = "Directions"
        return rootView
    }

}