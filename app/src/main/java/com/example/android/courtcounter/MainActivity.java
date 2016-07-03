package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /***
     * this variable holds score for Team A
     */
    int scoreA = 0;
    /***
     * this variable holds score for Team B
     */
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
            }

    // method for reset to 0
    public void resetScoreAB(View v) {
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
    /***
     * method adds 3 points for Team A
     */
    public void plusThreeA(View v) {
        scoreA = scoreA + 3;
        displayForTeamA(scoreA);
    }

    /***
     * method adds 2 points for Team A
     */
    public void plusTwoA(View v) {
        scoreA = scoreA + 2;
        displayForTeamA(scoreA);
    }

    /***
     * method adds 1 points for Team B
     */
    public void plusOneB(View v) {
        scoreB = scoreB + 1;
        displayForTeamB(scoreB);
    }
    /***
     * method adds 3 points for Team B
     */
    public void plusThreeB(View v) {
        scoreB = scoreB + 3;
        displayForTeamB(scoreB);
    }
    /***
     * method adds 2 points for Team B
     */
    public void plusTwoB(View v) {
        scoreB = scoreB + 2;
        displayForTeamB(scoreB);
    }
    /***
     * method adds 1 points for Team A
     */
    public void plusOneA(View v) {
        scoreA = scoreA + 1;
        displayForTeamA(scoreA);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
