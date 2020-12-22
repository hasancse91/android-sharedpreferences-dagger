package com.hellohasan.sharedpreferencesdagger.di

import android.app.Application
import android.content.Context
import com.hellohasan.sharedpreferencesdagger.MainActivity
import com.hellohasan.sharedpreferencesdagger.preferences.AppPreference
import com.hellohasan.sharedpreferencesdagger.preferences.AppPreferenceImpl
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class AppModule {

    @Binds
    abstract fun bindContext(application: Application): Context

    @Binds
    abstract fun bindSharedPreferences(appPreferenceImpl: AppPreferenceImpl): AppPreference

    @ContributesAndroidInjector
    abstract fun mainActivityInjector(): MainActivity
}