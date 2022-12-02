package com.jjrodcast.patterns.data.di

import com.jjrodcast.patterns.data.data_source.remote.CustomRemoteSourceImpl
import com.jjrodcast.patterns.data.data_source.remote.interfaces.CustomRemoteSource
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory

object CustomDataInjector {

    private var moshi: Moshi? = null
    private var customRemoteSource: CustomRemoteSource? = null

    private fun provideMoshi() = moshi ?: createMoshi()

    private fun createMoshi(): Moshi {
        Moshi.Builder().add(KotlinJsonAdapterFactory()).build().apply {
            moshi = this
            return this
        }
    }

    fun provideCustomRemoteDataSource() = customRemoteSource ?: createCustomDataRemoteSource()

    private fun createCustomDataRemoteSource(): CustomRemoteSource{
        CustomRemoteSourceImpl(provideMoshi(), "").apply {
            customRemoteSource = this
            return this
        }
    }

    fun destroy(){
        moshi = null
        customRemoteSource = null
    }

}