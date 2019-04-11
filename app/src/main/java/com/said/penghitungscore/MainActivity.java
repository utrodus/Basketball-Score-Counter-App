package com.said.penghitungscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreA = 0;
    int scoreB = 0;


    // method for team a score

    public void three_points(View view) {
        scoreA = scoreA +3;
        displayForTeamA(scoreA);
    }

    public void two_points(View view) {
        scoreA = scoreA +2;
        displayForTeamA(scoreA);
    }

    public void free_throw(View view) {
        scoreA = scoreA +1;
        displayForTeamA(scoreA);
    }

    // method for team b score

    public void three_points_b(View view) {
        scoreB = scoreB + 3;
        displayForTeamB(scoreB);
    }

    public void two_points_b(View view) {
        scoreB = scoreB + 2;
        displayForTeamB(scoreB);
    }

    public void free_throw_b(View view) {
        scoreB = scoreB + 1;
        displayForTeamB(scoreB);
    }

    public void reset_button(View view){
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
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
