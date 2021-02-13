 package com.example.mainactivityc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class hospitaldetails extends AppCompatActivity {
 WebView w;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospitaldetails);



        w = (WebView) findViewById(R.id.w);
        w.loadUrl("file:///android_asset/dd.html");
    }
}
