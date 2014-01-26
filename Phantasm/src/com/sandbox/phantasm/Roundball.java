package com.sandbox.phantasm;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Roundball extends Activity {

	WebView pointer;
	WebSettings settings;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_roundball);
		// find webView
		pointer = (WebView) findViewById(R.id.webView1);
		settings = (WebSettings) pointer.getSettings();
		settings.setDomStorageEnabled(true);
		settings.setJavaScriptEnabled(true);
		pointer.loadUrl("file:///android_asset/roundball/roundball.html");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.roundball, menu);
		return true;
	}

}
