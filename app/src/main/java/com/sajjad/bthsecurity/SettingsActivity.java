package com.sajjad.bthsecurity;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        setupActionbar();
    }

    private void setupActionbar() {
        ActionBar actionBar = getSupportActionBar();

        if(actionBar != null) {
            actionBar.setTitle("Settings");
        }
    }
}
