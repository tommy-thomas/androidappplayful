package com.sandbox.phantasm;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;

public class WarOfTheWorlds extends Activity {

	WebView pointer;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_war_of_the_worlds);
		// find webView
		pointer = (WebView) findViewById(R.id.webView1);
		pointer.getSettings().setBuiltInZoomControls(true);
		// open index.html
		pointer.loadUrl("file:///android_asset/waroftheworlds/index.html");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.war_of_the_worlds, menu);
		return true;
	}

}
