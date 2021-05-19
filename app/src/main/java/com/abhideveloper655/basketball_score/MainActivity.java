package com.abhideveloper655.basketball_score;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.abhideveloper655.basketball_score.R;

public class MainActivity extends AppCompatActivity {
    /*
     * @param Hey Buddy
     */
    int teamA = 0, teamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayLResult(int result) {
        TextView printResult = findViewById(R.id.leftScore);
        printResult.setText("" + result);

    }

    public void displayRResult(int result) {
        TextView printResult = findViewById(R.id.rightScore);
        printResult.setText("" + result);
    }

    //Team A methods
    public void lIncrement3(View view) {
        teamA = teamA + 3;
        //display teamA
        displayLResult(teamA);
    }

    public void lIncrement2(View view) {
        teamA = teamA + 2;
        //display teamA
        displayLResult(teamA);
    }

    public void lIncrement1(View view) {
        teamA = teamA + 1;
        //display teamA
        displayLResult(teamA);
    }


    //Team B methods
    public void rIncrement3(View view) {
        teamB = teamB + 3;
        //display teamB
        displayRResult(teamB);
    }

    public void rIncrement2(View view) {
        teamB = teamB + 2;
        //display teamB
        displayRResult(teamB);
    }

    public void rIncrement1(View view) {
        teamB = teamB + 1;
        //display teamB
        displayRResult(teamB);
    }


    public void winner(View view) {
        TextView textView = (TextView) findViewById(R.id.result);
        if (teamA > teamB) {
            textView.setText("Congratulations TEAM A");
        } else if (teamA == 0 && teamB == 0) {
            textView.setText("Opps!! Start the GAME");
        } else if (teamA == teamB) {
            textView.setText("Ohh!! it's very close..Match Ties");
        } else {
            textView.setText("Congratulations TEAM B");
        }

    }

    public void reset(View view) {
        TextView textView = (TextView) findViewById(R.id.result);
        textView.setText("Click Winner for Result");
        teamA = 0;
        teamB = 0;
        displayRResult(teamB);
        displayLResult(teamA);
    }


}