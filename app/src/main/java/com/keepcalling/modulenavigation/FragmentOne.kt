package com.keepcalling.modulenavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.activity.OnBackPressedCallback
import androidx.activity.addCallback
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FragmentOne: Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val callback = object : OnBackPressedCallback(
            true
        ){
            override fun handleOnBackPressed() {
                //this@FragmentOne.findNavController().popBackStack()
                requireActivity().finish()
            }

        }
        // This callback is only called when MyFragment is at least started
        requireActivity().onBackPressedDispatcher.addCallback(this, callback)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_one_app, container, false)
        val modOneBtn : Button = view.findViewById(R.id.button)
        val modTwoBtn : Button = view.findViewById(R.id.button2)

        modOneBtn.setOnClickListener {
            this.findNavController().navigate(FragmentOneDirections.actionFragmentOneToModuleOneNav())
        }

        modTwoBtn.setOnClickListener {
            this.findNavController().navigate(FragmentOneDirections.actionFragmentOneToModuleTwoNav())
        }
        return view
    }


}