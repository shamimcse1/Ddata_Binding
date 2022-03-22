package com.codercamp.ddatabinding.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.codercamp.ddatabinding.R
import com.codercamp.ddatabinding.databinding.ActivityMainBinding
import com.codercamp.ddatabinding.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {




    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ):
            View? {

        val binding = DataBindingUtil.inflate<FragmentHomeBinding>(
            inflater,
            R.layout.fragment_home,
            container,
            false
        )

        return binding.root
    }


}