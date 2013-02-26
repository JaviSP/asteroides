package com.bsodcorp.android.asteroides.scores;

import java.util.List;

public interface ScoresWare {
	public void saveScore(int points, String name, long date);
	public List<String> scoreList(int top);
}
