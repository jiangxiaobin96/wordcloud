package com.example.asus.wordcloud;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;


public class MainActivity extends AppCompatActivity {

    WebView jqcloud;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jqcloud = (WebView) findViewById(R.id.jqcloud);
        jqcloud.getSettings().setAllowFileAccess(true);
        jqcloud.getSettings().setJavaScriptEnabled(true);
        jqcloud.loadUrl("file:///android_asset/jqcloud.html");

        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(2000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
