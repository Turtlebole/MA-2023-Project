package com.example.mobilneprojekat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button ProfilButon;
    private Button ProfilFrendButon;
    private Button ProfilListaButon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ProfilButon = findViewById(R.id.ProfilButon);
        ProfilButon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to the next page here
                Intent intent = new Intent(MainActivity.this, Profile.class);
                startActivity(intent);
            }
        });

        ProfilFrendButon = findViewById(R.id.ProfilFrendButon);
        ProfilFrendButon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to the next page here
                Intent intent = new Intent(MainActivity.this, FriendList.class);
                startActivity(intent);
            }
        });

        ProfilListaButon = findViewById(R.id.ProfilListaButon);
        ProfilListaButon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to the next page here
                Intent intent = new Intent(MainActivity.this, WeeklyLeaderboard.class);
                startActivity(intent);
            }
        });
    }
}
