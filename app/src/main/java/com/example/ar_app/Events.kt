package com.example.ar_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Events : Fragment() {

    private lateinit var eventAdapter: EventAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_events, container, false)

        // set header text
        val headerTitle = rootView.findViewById<TextView>(R.id.page_header)
        headerTitle.text = "Events"

        val recyclerView = rootView.findViewById<RecyclerView>(R.id.rvEvents)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        // test event data
        val eventData = mutableListOf<Event>()
        for (i in 1..3) {
            eventData.add(Event("ASI Meeting - October", "Sep 28", "10:00 AM"))
        }

        // initialize adapter and attach to RecyclerView
        eventAdapter = EventAdapter(eventData)
        recyclerView.adapter = eventAdapter


        return rootView
    }

}