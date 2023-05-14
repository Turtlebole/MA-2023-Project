package com.example.mobilneprojekat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MonthlyLeaderboard extends AppCompatActivity {

    private Button sedmicna_leaderboard;

    private Button back_to_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_weekly_leaderboard_window);

        sedmicna_leaderboard = findViewById(R.id.sedmicna_leaderboard);
        sedmicna_leaderboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to the next page here
                Intent intent = new Intent(MonthlyLeaderboard.this, WeeklyLeaderboard.class);
                startActivity(intent);
            }
        });

        back_to_menu = findViewById(R.id.back_to_menu);

        back_to_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to the next page here
                Intent intent = new Intent(MonthlyLeaderboard.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}