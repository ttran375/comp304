package com.example.android.fragmentsexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
//

//
class ProgramFragment : Fragment() {

    val onCheckedChangeListener =
        RadioGroup.OnCheckedChangeListener { radioGroup, checkedId ->
            when (checkedId) {
                R.id.radio_sety -> {Toast.makeText(this@ProgramFragment.requireActivity(),
                    "Software Engineering Technology", Toast.LENGTH_SHORT).show()}
                R.id.radio_setn -> {}
                R.id.radio_hit -> {}
                R.id.radio_gp -> {}
                R.id.radio_ai -> {}
                R.id.radio_mapd -> {}
                else -> {}
            }
        }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmentView = inflater.inflate(R.layout.fragment_program, container, false)
        //
        /*
        val programs = resources.getStringArray(R.array.programs)
        val context = context as MainActivity
        var mListView = view.findViewById<ListView>(R.id.fragment_container_view_program.list)
        val adapter = ArrayAdapter(context, android.R.layout.simple_list_item_1, programs)
        mListView.adapter = adapter
         */
        val radioGroup = fragmentView.findViewById(R.id.radio_group) as RadioGroup
        radioGroup.setOnCheckedChangeListener(onCheckedChangeListener);
        //
        return fragmentView
    }


}