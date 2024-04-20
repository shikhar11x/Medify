package com.overthinker.medify

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.overthinker.medify.databinding.FragmentOrderBinding

class OrderFragment : Fragment() {
    private lateinit var binding:FragmentOrderBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentOrderBinding.inflate(inflater,container, false)
        val cartFoodName= listOf("Meds","Tablet","Scrup","Cough Scrup","Meds","Tablet","Cough Scrup","Tablet","Meds","Scrup")
        val cartItemPrice= listOf("40","45","30","60","80","40","45","30","60","80")
        val cartImage= listOf(
            R.drawable.pic1,R.drawable.pic2,R.drawable.pic3,R.drawable.pic4,R.drawable.pic5,R.drawable.pic1,R.drawable.pic2,R.drawable.pic3,R.drawable.pic4,R.drawable.pic5
        )
        val adapter=cartAdaptar(ArrayList(cartFoodName),ArrayList(cartItemPrice),ArrayList(cartImage))
        binding.cartrecyclerview.layoutManager= LinearLayoutManager(requireContext())
        binding.cartrecyclerview.adapter=adapter


        return binding.root
    }

    companion object {

    }
}