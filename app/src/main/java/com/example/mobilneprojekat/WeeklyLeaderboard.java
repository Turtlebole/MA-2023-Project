package com.example.mobilneprojekat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WeeklyLeaderboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_weekly_leaderboard_window);

        Button monthly_leaderboard = findViewById(R.id.monthly_leaderboard);
        monthly_leaderboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the next page
                Intent intent = new Intent(WeeklyLeaderboard.this, MonthlyLeaderboard.class);
                startActivity(intent);
            }
        });
    }

}
