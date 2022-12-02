package com.jjrodcast.patterns.core.navigation

import android.content.Context
import android.os.Bundle
import androidx.annotation.IdRes
import androidx.navigation.NavController

interface NavEngine {

    fun next(
        context: Context,
        bundle: Bundle?,
        viewName: String,
        destroy: Boolean = true
    )

    fun next(
        context: Context,
        bundle: Bundle?,
        activity: Class<*>,
        destroy: Boolean = true
    )

    fun next(navController: NavController, @IdRes actionId: Int, bundle: Bundle? = null)

    fun back(navController: NavController)

}