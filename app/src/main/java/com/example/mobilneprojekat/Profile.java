package com.example.mobilneprojekat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Profile extends AppCompatActivity {

    private ImageView KoZnaZnaButton;

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
    }
}
