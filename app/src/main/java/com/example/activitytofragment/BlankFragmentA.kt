package com.example.activitytofragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.activitytofragment.databinding.FragmentBlankABinding


class BlankFragmentA : Fragment() {

    private lateinit var binding:FragmentBlankABinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         binding= FragmentBlankABinding.inflate(inflater,container,false)
        val bundle=arguments
        val message=bundle!!.getString("message")
        binding.tvName.text=message
        return binding.root
    }
}