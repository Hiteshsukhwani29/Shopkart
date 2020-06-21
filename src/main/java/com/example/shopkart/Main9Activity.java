package com.example.shopkart;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class Main9Activity extends AppCompatActivity {
    WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        WebView myWebView = (WebView) findViewById(R.id.ww1);
        myWebView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSfqcNWL3nGYCHGa7GalpWsrWF4gVOC5k1F4S1SNypemZEjjDA/viewform");
        myWebView.setWebViewClient(new MyWebViewClient());
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            if (Uri.parse(url).getHost().equals("https://docs.google.com/forms/d/e/1FAIpQLSfqcNWL3nGYCHGa7GalpWsrWF4gVOC5k1F4S1SNypemZEjjDA/viewform")) {
                return false; }
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent); return true;
        }
    }
}

