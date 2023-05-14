package com.example.mobilneprojekat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Profile extends AppCompatActivity {

    private ImageView KoZnaZnaButton;

    private ImageView picture2;

    private ImageView picture3;

    private ImageView picture4;

    private ImageView picture5;

    private ImageView picture6;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_profile_window);

        KoZnaZnaButton = findViewById(R.id.KoZnaZnaButton);
        KoZnaZnaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to the next page here
                Intent intent = new Intent(Profile.this, KoZnaZna.class);
                startActivity(intent);
            }
        });

        picture2 = findViewById(R.id.picture2);
        picture2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to the next page here
                Intent intent = new Intent(Profile.this, Spojnice.class);
                startActivity(intent);
            }
        });

        picture3 = findViewById(R.id.picture3);
        picture3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to the next page here
                Intent intent = new Intent(Profile.this, Asocijacije.class);
                startActivity(intent);
            }
        });

        picture4 = findViewById(R.id.picture4);
        picture4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to the next page here
                Intent intent = new Intent(Profile.this, Skocko.class);
                startActivity(intent);
            }
        });

        picture5 = findViewById(R.id.picture5);
        picture5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to the next page here
                Intent intent = new Intent(Profile.this, KorakPoKorak.class);
                startActivity(intent);
            }
        });

        picture6 = findViewById(R.id.picture6);
        picture6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to the next page here
                Intent intent = new Intent(Profile.this, MojBroj.class);
                startActivity(intent);
            }
        });


    }
}
