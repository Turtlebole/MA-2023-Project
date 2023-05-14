package com.example.mobilneprojekat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FriendList extends AppCompatActivity {

    private Button ButtonMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_friend_list_window);

        ButtonMenu = findViewById(R.id.ButtonMenu);
        ButtonMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to the next page here
                Intent intent = new Intent(FriendList.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}