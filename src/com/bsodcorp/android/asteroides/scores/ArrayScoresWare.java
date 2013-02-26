package com.bsodcorp.android.asteroides.scores;

import java.util.ArrayList;
import java.util.List;

public class ArrayScoresWare implements ScoresWare {

	private List<String> scores;
	
	public ArrayScoresWare() {
		scores = new ArrayList<String>();
		scores.add("5000 Master");
		scores.add("2000 Medium");
		scores.add("1500 Newbi");
	}
	
	@Override
	public void saveScore(int points, String name, long date) {
		scores.add(points+" "+name);
	}

	@Override
	public List<String> scoreList(int top) {
		return scores;
	}

}
