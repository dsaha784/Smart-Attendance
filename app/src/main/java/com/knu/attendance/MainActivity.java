package com.knu.attendance;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
    private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        myWebView = new WebView(this);
        WebSettings webSettings = myWebView.getSettings();
        
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setDatabaseEnabled(true);
        
        myWebView.setWebViewClient(new WebViewClient());
        
        // 🎯 🎯 আপনার গুগল অ্যাপস স্ক্রিপ্টের ফাইনাল /exec লিংকটি নিচে বসিয়ে দিন 🎯 🎯
        myWebView.loadUrl("https://script.google.com/macros/s/AKfycbxhpXAOa_QCTao9sIVbSDMjuZGasV7ZgNJETIPuJ-c08uAgiAv2u2BWRbu1BhAU-jlIKw/exec");
        
        setContentView(myWebView);
    }

    @Override
    public void onBackPressed() {
        if (myWebView.canGoBack()) {
            myWebView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
