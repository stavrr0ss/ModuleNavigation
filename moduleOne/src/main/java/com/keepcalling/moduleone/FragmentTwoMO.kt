package com.keepcalling.moduleone

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FragmentTwoMO: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_two,container, false)
        val button: Button = view.findViewById(R.id.button2)
        button.setOnClickListener {
            this.findNavController().navigate(FragmentTwoMODirections.actionFragmentTwoMOToFragmentThreeMO())
        }
        return view
    }
}