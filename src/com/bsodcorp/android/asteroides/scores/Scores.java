package com.bsodcorp.android.asteroides.scores;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.bsodcorp.android.asteroides.Main;
import com.bsodcorp.android.asteroides.R;

public class Scores extends ListActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.scores);
//      Lista de strings (I)
//		setListAdapter(new ArrayAdapter<String>(this,
//				android.R.layout.simple_list_item_1,
//				Main.scoresWare.scoreList(10)));
		 setListAdapter(
				 new ArrayAdapter<String>(this, R.layout.score_element, R.id.tittle, Main.scoresWare.scoreList(10)));

	}
}
