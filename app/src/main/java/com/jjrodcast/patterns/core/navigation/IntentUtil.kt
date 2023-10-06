package com.jjrodcast.patterns.core.navigation

import android.content.Context
import android.content.Intent
import android.os.Bundle

internal class IntentUtil {

    fun build(context: Context, bundle: Bundle?, viewName: String): Intent {
        val intent = Intent()
        bundle?.let{
            intent.putExtras(it)
        }
        intent.setClassName(context, viewName)
        return intent
    }

    fun build(context: Context, bundle: Bundle?, activity: Class<*>): Intent {
        val intent = Intent(context, activity)
        bundle?.let {
            intent.putExtras(it)
        }
        return intent
    }

}