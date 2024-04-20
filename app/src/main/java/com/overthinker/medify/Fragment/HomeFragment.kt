package com.overthinker.medify.Fragment
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.interfaces.ItemClickListener
import com.denzcoskun.imageslider.models.SlideModel
import com.overthinker.medify.PopularAdaptar
import com.overthinker.medify.R
import com.overthinker.medify.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private lateinit var binding:FragmentHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentHomeBinding.inflate(inflater,container,false)

        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imageList=ArrayList<SlideModel>()
        imageList.add(SlideModel(R.drawable.poster3, ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable. poster2,ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.poster1, ScaleTypes.FIT))

        val imageSlider=binding.imageSlider
        imageSlider.setImageList(imageList)
        imageSlider.setImageList(imageList, ScaleTypes.FIT)
        imageSlider.setItemClickListener(object: ItemClickListener {
            override fun doubleClick(position: Int) {
                TODO("Not yet implemented")
            }

            override fun onItemSelected(position: Int) {
                val itemPosition=imageList[position]
                val itemMessage="Selected image $position"
                Toast.makeText(requireContext(),itemMessage, Toast.LENGTH_SHORT).show()
            }
        })
        val storeName= listOf("Gupta Chemist","Raju Drug store","Chemist","Raj Chemist ","Meds Bazar","Raju DawaKhana","Meds mart","Sharma chemist store")
        val rate = listOf("4.5★","4.2★","4.9★","5★","4★","4.1★","4.6★","4★")
        val shop =listOf(R.drawable.shop1,R.drawable.shop2,R.drawable.shop3,R.drawable.shop4 ,R.drawable.shop1,R.drawable.shop2,R.drawable.shop3,R.drawable.shop4)
        val adaptar=PopularAdaptar(storeName,rate,shop,requireContext())
        binding.recyclerView.layoutManager= LinearLayoutManager(requireContext())
        binding.recyclerView.adapter=adaptar
    }
}