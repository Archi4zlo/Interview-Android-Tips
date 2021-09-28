package com.archi4zlo.interviewandroidtips.ui.policy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.archi4zlo.interviewandroidtips.R
import com.archi4zlo.interviewandroidtips.databinding.FragmentHomeBinding
import com.archi4zlo.interviewandroidtips.databinding.FragmentPolicyBinding

class PolicyFragment : Fragment() {


    private var _binding: FragmentPolicyBinding? = null
    private lateinit var webView: WebView
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as AppCompatActivity).supportActionBar?.hide()
        (activity as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(false)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentPolicyBinding.inflate(inflater, container, false)
        val root: View = binding.root
        webView = binding.webviewPrivacypolicy
        webView.settings.javaScriptEnabled = true

        webView.webViewClient = object : WebViewClient(){
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                if (url != null) {
                    view?.loadUrl(url)
                }
                return true
            }
        }
        webView.loadUrl("https://sites.google.com/view/privacy-policy-interview-tips")

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}