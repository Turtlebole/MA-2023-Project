package com.example.mobilneprojekat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WeeklyLeaderboard extends AppCompatActivity {

    private Button monthly_leaderboard;

    private Button back_to_menu;

    private Button claimRewardButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_weekly_leaderboard_window);

        monthly_leaderboard = findViewById(R.id.monthly_leaderboard);
        monthly_leaderboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to the next page here
                Intent intent = new Intent(WeeklyLeaderboard.this, MonthlyLeaderboard.class);
                startActivity(intent);
            }
        });

        back_to_menu = findViewById(R.id.back_to_menu);

        back_to_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to the next page here
                Intent intent = new Intent(WeeklyLeaderboard.this, MainActivity.class);
                startActivity(intent);
            }
        });

        claimRewardButton = findViewById(R.id.claimRewardButton);
        claimRewardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to the next page here
                Intent intent = new Intent(WeeklyLeaderboard.this, Register.class);
                startActivity(intent);
            }
        });
    }
}
