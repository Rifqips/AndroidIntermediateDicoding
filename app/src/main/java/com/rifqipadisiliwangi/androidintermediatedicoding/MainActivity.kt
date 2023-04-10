package com.rifqipadisiliwangi.androidintermediatedicoding

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myWebView: WebView = findViewById(R.id.webview)
        myWebView.loadUrl("http://www.dicoding.com")

        val webSettings = myWebView.settings
        webSettings.javaScriptEnabled = true
    }
}