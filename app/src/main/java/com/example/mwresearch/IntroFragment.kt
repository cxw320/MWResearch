package com.example.mwresearch

import android.animation.ObjectAnimator
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import com.example.mwresearch.databinding.FragmentIntroBinding

class IntroFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentIntroBinding.inflate(inflater,container,false)

        binding.tutorialArrow.setOnClickListener {
            animatedTutorialArrow(binding)
        }
            return binding.root

    }

    private fun animatedTutorialArrow(binding: FragmentIntroBinding){
      val animator = ObjectAnimator.ofFloat(binding.tutorialArrow,View.TRANSLATION_Y,-50f)
        animator.setRepeatCount(Animation.INFINITE)
        animator.repeatMode = ObjectAnimator.REVERSE
        animator.setDuration(1000)
        animator.start()
    }

}