package com.example.alcphase1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class About extends AppCompatActivity {


    private WebView web;
    String url="http://andela.com/alc/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("About Us");

        web=(WebView)findViewById(R.id.web_view);
        web.setWebViewClient(new WebViewClient(){
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed();
            }
        });
        web.getSettings().setJavaScriptEnabled(true);
        web.loadUrl(url);
    }
}
