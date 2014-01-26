package com.sandbox.phantasm;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Nasa extends Activity {

	WebView pointer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_nasa);
		// find webView
		pointer = (WebView) findViewById(R.id.webView1);
		pointer.loadUrl("file:///android_asset/nasa/index.html");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.nasa, menu);
		return true;
	}

}
