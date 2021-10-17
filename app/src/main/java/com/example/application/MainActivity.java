package com.example.application;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    ImageView setting_icon_btn;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        String text = intent.getStringExtra(LoginActivity.EXTRA_TEXT);
        TextView emailtxt = (TextView) findViewById(R.id.emailtxt);

        emailtxt.setText(text);


        //Settings
        setting_icon_btn = findViewById(R.id.setting_icon_btn);

        setting_icon_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,SettingsActivity.class));
            }
        });
    }
}