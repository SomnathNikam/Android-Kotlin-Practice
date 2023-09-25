package com.example.webview

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import androidx.annotation.RequiresApi
import com.example.webview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mywebview.loadUrl("https://www.google.com")
        binding.mywebview.apply {
            requestFocus()
            settings.displayZoomControls=true
            settings.javaScriptEnabled=true
            settings.allowContentAccess=true
            setNetworkAvailable(true)
            settings.allowFileAccess
           // webChromeClient.onCloseWindow(binding.mywebview)
            isSaveFromParentEnabled=true
            binding.mywebview.webViewClient.onLoadResource(binding.mywebview,"https://www.google.com")
            settings.allowFileAccess=true
            binding.mywebview.webChromeClient
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
                webViewLooper.quit()
                webViewLooper.queue.isIdle
                
            }


        }

    }

    override fun onBackPressed() {
        if(binding.mywebview.canGoBack()){
            binding.mywebview.goBack()
        }
        else
        {
            finish()
        }
    }
}