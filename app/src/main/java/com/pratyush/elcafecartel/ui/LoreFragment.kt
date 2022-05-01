package com.pratyush.elcafecartel.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.pratyush.elcafecartel.R
import com.pratyush.elcafecartel.databinding.FragmentLoreBinding


class LoreFragment : Fragment() {
    private lateinit var binding: FragmentLoreBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoreBinding.inflate(layoutInflater)
        binding.storyoneCardView.setOnClickListener {
            findNavController().navigate(LoreFragmentDirections.actionLoreFragmentToStoryLoreFragment().setStoryNumber(1))
        }
        binding.storytwoCardView.setOnClickListener {
            findNavController().navigate(LoreFragmentDirections.actionLoreFragmentToStoryLoreFragment().setStoryNumber(2))
        }
        binding.storythreeCardView.setOnClickListener {
            findNavController().navigate(LoreFragmentDirections.actionLoreFragmentToStoryLoreFragment().setStoryNumber(3))
        }
        return binding.root
    }

}
