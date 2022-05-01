package com.pratyush.elcafecartel.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.pratyush.elcafecartel.R
import com.pratyush.elcafecartel.databinding.FragmentStoryLoreBinding


class StoryLoreFragment : Fragment() {
    private lateinit var binding: FragmentStoryLoreBinding
    private val args: StoryLoreFragmentArgs by navArgs<StoryLoreFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStoryLoreBinding.inflate(layoutInflater)
        val storyNo = args.storyNumber
        if (storyNo == 1){
            binding.storyText.text = "Legend tells of six coffee farmers who set out across Chipolente in search of new fertile lands. Some say it was by luck, others claim that their famous coffee beans gave them magically heightened senses. All we know for sure is that nestled deep in the jungle between two active volcanoes they stumbled across the now famed Valle de la Muerte. The six founders agreed that their respective families would share an equal split of profits from their endeavor and for over three hundred years their descendants worked and managed the coffee farms of Valle de la Muerte. Business thrived and the six Chipolean families lived in peace and prosperity, united by their passion for coffee. Life was good...."
        }
        else if (storyNo == 2){
            binding.storyText.text = "Five years ago everything changed... \n" +
                    "\n" +
                    "After the sad death of Papa Oche Jiminez, control of the Jiminez family passed down to his ruthless son Juan Carlos. The locals named him Loco Occo, for some say his overindulgence in the local coffee had driven him to madness.  \n" +
                    "\n" +
                    "Loco Occo was no longer content to share the beautiful Valle de la Muerte. Driven by arrogance, greed and madness, he forged a war of violence against the other families for ultimate control of the valley and the surrounding coffee farms. After five hundred harmonious years, the peace was shattered...."
        }
        else{
            binding.storyText.text = "The remaining five families, worried about their business interests and the increasing level of violence from Loco Occo decided to make a stand. Only together could they protect their families, their land and the valuable coffee trade in and out of the the valley. Together they formed El Café Cartel .\n" +
                    "\n" +
                    "The newly formed cartel clashed with Loco Occo and for a time their combined might seemed to be enough to remain in control. Loco Occo however, would not lie down easily. He was cunning and well connected and had one final trick up his sleeve..."
        }

        return binding.root
    }
}