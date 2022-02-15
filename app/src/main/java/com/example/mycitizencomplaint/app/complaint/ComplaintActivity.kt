package com.example.mycitizencomplaint.app.complaint

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.mycitizencomplaint.R
import com.example.mycitizencomplaint.databinding.ActivityComplaintBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class ComplaintActivity : AppCompatActivity() {
    /**
     * Injected ViewModel
     */
    private val complaintViewModel: ComplaintViewModel by viewModel()

    private lateinit var binding: ActivityComplaintBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Set databinding
        binding = DataBindingUtil.setContentView(this, R.layout.activity_complaint)
        binding.viewModel = complaintViewModel
    }
}