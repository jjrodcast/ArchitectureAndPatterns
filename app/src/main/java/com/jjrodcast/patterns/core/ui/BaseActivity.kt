package com.jjrodcast.patterns.core.ui

import androidx.appcompat.app.AppCompatActivity
import com.jjrodcast.patterns.core.navigation.AppNavEngine
import com.jjrodcast.patterns.core.navigation.NavEngine


abstract class BaseActivity: AppCompatActivity() {

    protected val navigation: NavEngine by lazy {
        AppNavEngine()
    }

}