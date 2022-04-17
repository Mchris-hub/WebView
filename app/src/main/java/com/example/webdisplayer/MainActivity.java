package com.example.webdisplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView myWebview = (WebView) findViewById(R.id.myWebView);
        myWebview.getSettings().setJavaScriptEnabled(true);
        myWebview.setWebViewClient(new WebViewClient());
        myWebview.loadUrl("https://www.google.com/search?q=la+liga&sxsrf=APq-WBumatghCJ6l5M1LF2YU__wH8tzdtw%3A1650235901556&source=hp&ei=_ZlcYveDIJLWgQb3kpjABw&iflsig=AHkkrS4AAAAAYlyoDZeXHWEeoz6yFcxVGORT2IuDb-Ip&ved=0ahUKEwi39tLll5z3AhUSa8AKHXcJBngQ4dUDCA0&oq=&gs_lcp=Cgdnd3Mtd2l6EAEYATIHCCMQ6gIQJzIHCC4Q6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJzIHCC4Q6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJ1AAWABgqSZoBHAAeACAAQCIAQCSAQCYAQCwAQo&sclient=gws-wiz&gs_ssp=eJzj4tDP1TewTC-sMGD0Ys9JVMjJTE8EADYDBaM");
    }
}