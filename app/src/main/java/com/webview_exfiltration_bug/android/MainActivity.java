package com.webview_exfiltration_bug.android;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;


public class MainActivity extends AppCompatActivity {

    private WebView wv;


    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        wv = new WebView(this);
        setContentView(wv);
        WebSettings s = wv.getSettings();
        s.setJavaScriptEnabled(true);
        s.setBlockNetworkLoads(true);

//        wv.loadUrl("https://webrtc.github.io/samples/src/content/peerconnection/trickle-ice/");
        wv.loadUrl("file:///android_asset/exfiltrate-webapp/index.html");

//        wv.getSettings().setBlockNetworkLoads(true);

    }
}

