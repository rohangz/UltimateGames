package com.rinfinity.games.application.dagger_hilt.module

import com.rinfinity.games.application.NetworkService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

const val BASE_URL = "https://wwww.infinity.com"

@InstallIn(ApplicationComponent::class)
@Module
class NetworkServiceModule {

    companion object {
        @Singleton
        @Provides
        @JvmStatic
        fun provideNetworkService(): NetworkService {
            return Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(NetworkService::class.java)
        }
    }


}