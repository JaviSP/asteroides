package com.bsodcorp.android.asteroides;

import com.bsodcorp.android.asteroides.scores.ArrayScoresWare;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main extends Activity {

	private Button bAbout;
	private Button bScore;
	public static ArrayScoresWare scoresWare = new ArrayScoresWare();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		bAbout = (Button) findViewById(R.id.button_about);
		bAbout.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startAbout(null);
			}
		});

		bScore = (Button) findViewById(R.id.button_scores);
		bScore.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startScores(null);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true; // TRUE = el menú ya está visible
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.menu_about:
			startAbout(null);
			break;
		case R.id.menu_exit:
			startExit(null);
			break;
		case R.id.menu_settings:
			startSettings(null);
			break;
		}
		return true;
		/** true -> consumimos el item, no se propaga */

	}

	public void startAbout(View view) {
		Intent intent = new Intent(this, About.class);
		startActivity(intent);
	}

	public void startExit(View view) {
		finish();
	}

	public void startSettings(View view) {
		Intent intent = new Intent(this, Preferences.class);
		startActivity(intent);
	}

	public void startScores(View view) {
		Intent intent = new Intent(this, Scores.class);
		startActivity(intent);
	}

}
