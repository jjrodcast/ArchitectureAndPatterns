package com.jjrodcast.patterns.features.splash

import android.os.Bundle
import androidx.activity.viewModels
import com.jjrodcast.patterns.core.ui.BaseActivity
import com.jjrodcast.patterns.databinding.ActivitySplashBinding
import com.jjrodcast.patterns.features.di.CustomUIInjector
import com.jjrodcast.patterns.core.extensions.createFactory


class SplashActivity : BaseActivity() {

    private val viewModel by viewModels<SplashViewModel> {
        SplashViewModel(
            customUseCases = CustomUIInjector.provideCustomUseCases()
        ).createFactory()
    }

    private lateinit var binding : ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}