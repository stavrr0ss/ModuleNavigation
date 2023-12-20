package com.keepcalling.moduleone

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.net.toUri
import androidx.fragment.app.Fragment
import androidx.navigation.NavDeepLinkRequest
import androidx.navigation.fragment.findNavController

class FragmentThreeMO: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_three, container, false)
        val button: Button = view.findViewById(R.id.button3)

        button.setOnClickListener {
            val request = NavDeepLinkRequest.Builder
                .fromUri("android-app://com.keepcalling/fragment_one_mt".toUri())
                .build()
            findNavController().navigate(request)
        }
        return view
    }
}