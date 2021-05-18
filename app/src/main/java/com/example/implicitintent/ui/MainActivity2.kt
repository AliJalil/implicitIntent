package com.example.implicitintent.ui;


import android.view.LayoutInflater
import com.example.implicitintent.databinding.ActivityMain2Binding

public class MainActivity2 :  BaseActivity<ActivityMain2Binding>()  {

    override val LOG_TAG: String = "MAIN_ACTIVITY2"
    override val bindingInflater: (LayoutInflater) -> ActivityMain2Binding =
        ActivityMain2Binding::inflate
    var username = ""
    override fun setup() {
        username = intent.getStringExtra("username").toString()
    }

    override fun addCallBack() {
        binding?.apply {
            helloTxt.text = "Hello I'm Second Activity \n and this passed Data: $username"
        }
    }

}