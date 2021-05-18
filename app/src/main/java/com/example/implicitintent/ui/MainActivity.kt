package com.example.implicitintent.ui

import android.content.Intent
import android.view.LayoutInflater

import com.example.implicitintent.databinding.ActivityMainBinding


class MainActivity : BaseActivity<ActivityMainBinding>() {

    override val LOG_TAG: String = "MAIN_ACTIVITY"
    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding =
        ActivityMainBinding::inflate

    override fun setup() {
    }

    override fun addCallBack() {
        binding?.apply {
        openBtn.setOnClickListener {
              val intent = Intent("ali.open.ACTION")
              intent.putExtra("username", editText.text.toString());
              startActivity(intent)
            }
        }
    }
}