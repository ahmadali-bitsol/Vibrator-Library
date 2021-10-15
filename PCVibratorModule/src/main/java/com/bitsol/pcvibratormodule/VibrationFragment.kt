package com.bitsol.pcvibratormodule

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bitsol.pcvibratormodule.databinding.FragmentVibrationBinding


class VibrationFragment : Fragment() {

    private lateinit var binding : FragmentVibrationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentVibrationBinding.inflate(inflater)


        binding.tv1.setOnClickListener {
            binding.tv1.text = "Ani diya mazak a"
        }

        return binding.root
    }

}