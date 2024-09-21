package com.example.webapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
WebView browser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        browser =(WebView) findViewById(R.id.webview);
        browser.setWebViewClient(new WebViewClient());

         browser.loadUrl("https://www.javatpoint.com/");

//        String data = "<html><body><h1>Hello, Javatpoint!</h1></body></html>";
//        browser.loadData(data, "text/html", "UTF-8");

//        String data="<html><body><h1>Kahani Suno</h1></body></html>";
//        browser.loadData(data, "text/html", "UTF-8");
//
//        browser.loadUrl("https://www.javatpoint.com/android-webview-example/");

    }
}