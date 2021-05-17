package com.example.implicitintent.ui;


import android.view.LayoutInflater
import com.example.implicitintent.databinding.ActivityMain2Binding;
import com.example.implicitintent.databinding.ActivityMainBinding

public class MainActivity2 :  BaseActivity<ActivityMain2Binding>()  {

    override val LOG_TAG: String = "MAIN_ACTIVITY2"
    override val bindingInflater: (LayoutInflater) -> ActivityMain2Binding =
        ActivityMain2Binding::inflate

    override fun setup() {

    }

    override fun addCallBack() {
        binding?.apply {
            helloTxt.text = "Hello I'm Second Activity"
        }
    }

}