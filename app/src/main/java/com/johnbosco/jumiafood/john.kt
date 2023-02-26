package com.johnbosco.jumiafood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class john : AppCompatActivity() {
    private val webView: WebView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_john)
        //Giving a tittle
        title = "Jumia food"
        val webView = findViewById<WebView>(R.id.webview)
        webView.webViewClient = WebViewClient()
        //webViewclient is the object responsible for most the actions inside
        val webSettings = webView.settings
        webSettings.javaScriptEnabled
        webView.loadUrl("https://group.jumia.com/about/locations/uganda")
    }

    override fun onBackPressed() {
        if (webView!!.canGoBack()) {
            webView.goBack()
            //conGoBack()
            //this method specifies the WebView has a back history item.
        } else {
            super.onBackPressed()
        }
    }
}