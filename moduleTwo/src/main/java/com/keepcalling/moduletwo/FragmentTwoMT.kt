package com.keepcalling.moduletwo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FragmentTwoMT: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_two_mt, container, false)
        val button: Button = view.findViewById(R.id.button2)
        button.setOnClickListener {
            this.findNavController().navigate(FragmentTwoMTDirections.actionFragmentTwoMTToFragmentThreeMT())
        }
        return view
    }
}