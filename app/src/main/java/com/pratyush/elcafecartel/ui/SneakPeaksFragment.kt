package com.pratyush.elcafecartel.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pratyush.elcafecartel.R
import com.pratyush.elcafecartel.databinding.FragmentSneakPeaksBinding


class SneakPeaksFragment : Fragment() {
    private lateinit var binding: FragmentSneakPeaksBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSneakPeaksBinding.inflate(layoutInflater)
        return binding.root
    }

}
