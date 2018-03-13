package com.vms.ds;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class webView extends AppCompatActivity {
    WebView webView;
   // public ProgressBar progressBar;
    public ProgressDialog progressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_web_view);

        String page_url = getIntent().getStringExtra("page_url");

        webView=findViewById(R.id.webId);

        progressDialog=new ProgressDialog(webView.this);

        //progressDialog=findViewById(R.id.progressBar2);
        progressDialog.setMessage("loading" );
        progressDialog.setCanceledOnTouchOutside(false);



        webView.setVisibility(View.INVISIBLE);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setAllowFileAccess(true);
        webView.getSettings().setAllowFileAccessFromFileURLs(true);
        webView.getSettings().setAllowContentAccess(true);
        webView.setWebViewClient(new WebViewClient(){   // it will check the loaded page
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);

                progressDialog.show();
                Toast.makeText(webView.this,"loding..",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                progressDialog.dismiss();
                webView.setVisibility(View.VISIBLE);
                Toast.makeText(webView.this,"loded..",Toast.LENGTH_SHORT).show();

            }
        });

        webView.loadUrl(page_url);






    }


}
