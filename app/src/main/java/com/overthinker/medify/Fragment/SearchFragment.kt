package com.overthinker.medify.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.overthinker.medify.MenuAdapter
import com.overthinker.medify.R
import com.overthinker.medify.databinding.FragmentSearchBinding

class SearchFragment : Fragment() {
    private lateinit var binding: FragmentSearchBinding
    private lateinit var adapter: MenuAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSearchBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val originalMenuFoodName = listOf(
            "Meds","Tablet","Scrup","Cough Scrup","Meds","Tablet","Cough Scrup","Tablet","Meds","Scrup","Meds","Tablet","Scrup","Cough Scrup","Meds","Tablet","Cough Scrup","Tablet","Meds","Scrup")
        val originalMenuItemPrice = listOf(
            "₹40","₹45","₹30","₹60","₹80","₹40","₹45","₹30","₹60","₹80","₹40","₹45","₹30","₹60","₹80","₹40","₹45","₹30","₹60","₹80"

        )
        val originalMenuImage = listOf(
            R.drawable.pic1,R.drawable.pic2,R.drawable.pic3,R.drawable.pic4,R.drawable.pic5,R.drawable.pic1,R.drawable.pic2,R.drawable.pic3,R.drawable.pic4,R.drawable.pic5,            R.drawable.pic1,R.drawable.pic2,R.drawable.pic3,R.drawable.pic4,R.drawable.pic5,R.drawable.pic1,R.drawable.pic2,R.drawable.pic3,R.drawable.pic4,R.drawable.pic5

        )

        adapter = MenuAdapter(originalMenuFoodName, originalMenuItemPrice, originalMenuImage, requireContext())
        binding.menuRecyclerview.layoutManager = LinearLayoutManager(requireContext())
        binding.menuRecyclerview.adapter = adapter
    }
}