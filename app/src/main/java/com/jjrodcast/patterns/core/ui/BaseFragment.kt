package com.jjrodcast.patterns.core.ui

import androidx.fragment.app.Fragment
import com.jjrodcast.patterns.core.navigation.AppNavEngine
import com.jjrodcast.patterns.core.navigation.NavEngine

internal abstract class BaseFragment : Fragment() {

    protected val navigation: NavEngine by lazy{
        AppNavEngine()
    }

}