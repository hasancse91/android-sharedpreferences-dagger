package com.hellohasan.sharedpreferencesdagger

import android.os.Bundle
import android.util.Log
import com.hellohasan.sharedpreferencesdagger.preferences.AppPreference
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var appPreference: AppPreference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Show previous data in EditText. 1st time it doesn't show anything
        edtName.setText(appPreference.userName)
        edtWebsite.setText(appPreference.getWebsite())

        // Text fields show nothing when data is not available (ex: 1st time after installation)
        showDataInTextField()

        btnSave.setOnClickListener {
            // here we ignored data validation (empty check and others)
            appPreference.userName = edtName.text.toString()
            appPreference.setWebsite(edtWebsite.text.toString())

            showDataInTextField()
        }
    }

    private fun showDataInTextField() {
        tvNameValue.text = appPreference.userName
        tvWebsiteValue.text = appPreference.getWebsite()
    }
}