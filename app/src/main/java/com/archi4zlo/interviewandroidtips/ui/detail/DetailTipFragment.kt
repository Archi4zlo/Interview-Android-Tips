package com.archi4zlo.interviewandroidtips.ui.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.archi4zlo.interviewandroidtips.R
import com.archi4zlo.interviewandroidtips.databinding.FragmentDetailTipBinding
import com.archi4zlo.interviewandroidtips.databinding.FragmentFavouriteBinding
import com.archi4zlo.interviewandroidtips.ui.favourite.FavouriteViewModel

class DetailTipFragment : Fragment() {

    private lateinit var detailTipViewModel: FavouriteViewModel
    private var _binding: FragmentDetailTipBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        detailTipViewModel =
            ViewModelProvider(this).get(FavouriteViewModel::class.java)

        _binding = FragmentDetailTipBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textDetailTip
        detailTipViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}