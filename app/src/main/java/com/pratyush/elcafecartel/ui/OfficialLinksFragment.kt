package com.pratyush.elcafecartel.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pratyush.elcafecartel.R
import com.pratyush.elcafecartel.databinding.FragmentOfficialLinksBinding


class OfficialLinksFragment : Fragment() {
    private lateinit var binding: FragmentOfficialLinksBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOfficialLinksBinding.inflate(layoutInflater)


        binding.twitterCardView.setOnClickListener {
            openUri("https://twitter.com/ElCafeCartel")
        }
        binding.discordCardView.setOnClickListener {
            openUri("https://discord.gg/DGYGmxSz")
        }
        binding.instaCardView.setOnClickListener {
            openUri("https://instagram.com/el_cafe_cartel?igshid=YmMyMTA2M2Y=")
        }
        binding.collabCardView.setOnClickListener {
            openUri("https://docs.google.com/forms/d/e/1FAIpQLSfZnHKT4ez0kKRSGC1ACwIHGhBsjpu3cCVPbDjJJlmtkXBNuw/viewform")
        }
        binding.DevCardView.setOnClickListener {
            openUri("https://hackachain.org/")
        }

        return binding.root
    }

    fun openUri(url: String) {
        val openURL = Intent(Intent.ACTION_VIEW)
        openURL.data = Uri.parse(url)
        startActivity(openURL)
    }
}