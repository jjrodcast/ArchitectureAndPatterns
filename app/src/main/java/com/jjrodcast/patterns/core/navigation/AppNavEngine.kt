package com.jjrodcast.patterns.core.navigation

import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Context
import android.os.Bundle
import androidx.annotation.IdRes
import androidx.navigation.NavController

internal class AppNavEngine : NavEngine {

    @Throws(Exception::class)
    override fun next(context: Context, bundle: Bundle?, viewName: String, destroy: Boolean) {
        try {
            context.startActivity(IntentUtil().build(context, bundle, viewName))
            if (destroy) (context as Activity).finish()
        } catch (exception: ActivityNotFoundException){
            throw Exception(exception.message ?: "")
        }
    }

    @Throws(Exception::class)
    override fun next(context: Context, bundle: Bundle?, activity: Class<*>, destroy: Boolean) {
        try {
            context.startActivity(IntentUtil().build(context, bundle, activity))
            if (destroy) (context as Activity).finish()
        } catch (exception: ActivityNotFoundException){
            throw Exception(exception.message ?: "")
        }
    }

    override fun next(navController: NavController, @IdRes actionId: Int, bundle: Bundle?) {
        navController.navigate(actionId, bundle)
    }

    override fun back(navController: NavController) {
        navController.popBackStack()
    }

}