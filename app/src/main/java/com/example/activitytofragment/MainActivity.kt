package com.example.activitytofragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.activitytofragment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragmentManager:FragmentManager=supportFragmentManager
        val fragmentTransaction:FragmentTransaction=fragmentManager.beginTransaction()
        val fragmentA=BlankFragmentA()
        binding.btnSend.setOnClickListener {
            val bundle=Bundle()
            bundle.putString("message",binding.etName.text.toString())
            fragmentA.arguments=bundle
            fragmentTransaction.add(R.id.frameLayout,fragmentA).commit()
        }
    }
}