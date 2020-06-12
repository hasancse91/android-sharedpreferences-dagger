package com.hellohasan.sharedpreferencesdagger.preferences

import android.content.Context
import javax.inject.Inject

class AppPreferenceImpl @Inject constructor(context: Context): AppPreference {

    companion object {
        const val USER_NAME = "user_name"
        const val WEBSITE = "website"
    }

    private var preference = context.getSharedPreferences("dagger-pref", Context.MODE_PRIVATE)
    private var editor = preference.edit()

    override var userName: String
        get() = getString(USER_NAME)
        set(value) {
            saveString(USER_NAME, value)
        }

    override fun getWebsite(): String {
        return getString(WEBSITE)
    }

    override fun setWebsite(website: String) {
        saveString(WEBSITE, website)
    }

    private fun saveString(key: String, value: String) {
        editor.putString(key, value).apply()
    }

    private fun getString(key: String, defaultValue: String = ""): String {
        return preference.getString(key, defaultValue) ?: defaultValue
    }
}