package com.pratyush.elcafecartel.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pratyush.elcafecartel.R
import com.pratyush.elcafecartel.databinding.FragmentProjectBinding


class ProjectFragment : Fragment() {

    private lateinit var binding: FragmentProjectBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProjectBinding.inflate(layoutInflater)
        return binding.root
    }
}