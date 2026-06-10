package com.modularhub.feature.home.standalone

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.modularhub.feature.home.HomeFeature

class StandaloneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(android.R.id.content, HomeFeature.createFragment())
                .commit()
        }
    }
}
