package com.example.inventoryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView=findViewById(R.id.webViewId);

        WebSettings webSettings= webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        //webView.setWebViewClient(new WebViewClient());
       // webView.loadUrl("http://192.168.1.3/#/login");
        webView.getWebChromeClient("");

        Intent browserIntent= new Intent(Intent.ACTION_VIEW, Uri.parse("http://192.168.1.3/#/login"));
        startActivity(browserIntent);
    }
}