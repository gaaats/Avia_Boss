package com.tutotoons.app.fruitsie.gameactiv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tutotoons.app.fruitsie.R

class GggggaamemeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gggggaameme)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
        onDestroy()
    }
}