package com.mahesaiqbal.scoreboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Global variable
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void addThreeForTeamA(View view) {
        /*
        Mengakses global variabel dengan menjumlahkannya
        Lalu hasilnya disimpan kedalam variabel
        */
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    public void addTwoForTeamA(View view) {
        /*
        Mengakses global variabel dengan menjumlahkannya
        Lalu hasilnya disimpan kedalam variabel
        */
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    public void addOneForTeamA(View view) {
        /*
        Mengakses global variabel dengan menjumlahkannya
        Lalu hasilnya disimpan kedalam variabel
        */
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void addThreeForTeamB(View view) {
        /*
        Mengakses global variabel dengan menjumlahkannya
        Lalu hasilnya disimpan kedalam variabel
        */
        scoreTeamB = scoreTeamB + 3;
        displayForTeamA(scoreTeamB);
    }

    public void addTwoForTeamB(View view) {
        /*
        Mengakses global variabel dengan menjumlahkannya
        Lalu hasilnya disimpan kedalam variabel
        */
        scoreTeamB = scoreTeamB + 2;
        displayForTeamA(scoreTeamB);
    }

    public void addOneForTeamB(View view) {
        /*
        Mengakses global variabel dengan menjumlahkannya
        Lalu hasilnya disimpan kedalam variabel
        */
        scoreTeamB = scoreTeamB + 1;
        displayForTeamA(scoreTeamB);
    }

    public void displayForTeamA(int score) {
        TextView scoreViewA = (TextView) findViewById(R.id.team_a_score);
        scoreViewA.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreViewB = (TextView) findViewById(R.id.team_b_score);
        scoreViewB.setText(String.valueOf(score));
    }
}
