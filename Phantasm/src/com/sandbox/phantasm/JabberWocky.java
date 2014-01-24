package com.sandbox.phantasm;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.LinearLayout;

public class JabberWocky extends Activity {

	MediaPlayer mp;
	WebView pointer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_jabber_wocky);
		// find webView
		pointer = (WebView) findViewById(R.id.webView1);
		pointer.getSettings().setBuiltInZoomControls(true);
		// open index.html
		pointer.loadUrl("file:///android_asset/jabberwocky/index.html");
	}

	protected void onResume() {
		Log.e("Phantasm", "onResume");
		mp = MediaPlayer.create(this, R.raw.phantasm_flying_lotus);
		mp.start();
		mp.setLooping(true);
		super.onResume();
	}

	protected void onPause() {
		Log.e("Phantasm", "onPause");
		mp.stop();
		mp.release();
		super.onPause();
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// Check if the key event was the Back button and if there's history
		if ((keyCode == KeyEvent.KEYCODE_BACK) && pointer.canGoBack()) {
			pointer.goBack();
			return true;
		}
		// If it wasn't the Back key or there's no web page history, bubble up
		// to the default
		// system behavior (probably exit the activity)
		return super.onKeyDown(keyCode, event);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.jabber_wocky, menu);
		return true;
	}

}
