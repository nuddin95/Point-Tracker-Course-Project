package com.example.android.courtcounter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    int score_team_A = 0;
    int score_team_B = 0;
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

    public void ThreePoints(View view) {
        score_team_A = score_team_A + 3;
        displayForTeamA(score_team_A);
    }

    public void TwoPoints(View view) {
        score_team_A = score_team_A + 2;
        displayForTeamA(score_team_A);
    }

    public void OnePoint(View view) {
        score_team_A = score_team_A + 1;
        displayForTeamA(score_team_A);
    }

    public void ThreePointsB(View view) {
        score_team_B = score_team_B + 3;
        displayForTeamB(score_team_B);
    }

    public void TwoPointsB(View view) {
        score_team_B = score_team_B + 2;
        displayForTeamB(score_team_B);
    }

    public void OnePointB(View view) {
        score_team_B = score_team_B + 1;
        displayForTeamB(score_team_B);
    }

    public void Reset(View view) {
        score_team_B = 0;
        displayForTeamB(score_team_B);
        score_team_A = 0;
        displayForTeamA(score_team_A);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
