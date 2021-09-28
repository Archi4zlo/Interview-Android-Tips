package com.archi4zlo.interviewandroidtips.ui.selectedtip

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.archi4zlo.interviewandroidtips.databinding.FragmentSelectedTipBinding
import com.archi4zlo.interviewandroidtips.ui.tips.TipsViewModel


class SelectedTipFragment : Fragment() {


    private lateinit var selectedTipsViewModel: SelectedTipViewModel
    private var _binding: FragmentSelectedTipBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        selectedTipsViewModel =
            ViewModelProvider(this).get(SelectedTipViewModel::class.java)

        _binding = FragmentSelectedTipBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textSelectedTip

        selectedTipsViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}