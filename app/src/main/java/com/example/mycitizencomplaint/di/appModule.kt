package com.example.mycitizencomplaint.di

import com.example.mycitizencomplaint.app.complaint.ComplaintViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { ComplaintViewModel() }
}