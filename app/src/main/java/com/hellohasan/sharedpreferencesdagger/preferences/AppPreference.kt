package com.hellohasan.sharedpreferencesdagger.preferences

interface AppPreference {
    var userName: String
    fun getWebsite(): String
    fun setWebsite(website: String)
}