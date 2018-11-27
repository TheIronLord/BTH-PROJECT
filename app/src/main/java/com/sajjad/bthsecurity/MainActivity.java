package com.sajjad.bthsecurity;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ConstraintLayout mSecurityConstraintLayout;
    private ConstraintLayout mLightsConstraintLayout;
    private ConstraintLayout mThermostatConstraintLayout;
    private ConstraintLayout mAppliancesConstraintLayout;
    private ConstraintLayout mInventoriesConstraintLayout;
    private ConstraintLayout mUtilitiesConstraintLayout;
    private ConstraintLayout mScheduleConstraintLayout;
    private ConstraintLayout mReminderConstraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupActionbar();
        retrieveViews();

        setupListeners();
    }

    private void setupListeners() {
        mSecurityConstraintLayout.setOnClickListener(this);
        mLightsConstraintLayout.setOnClickListener(this);
        mThermostatConstraintLayout.setOnClickListener(this);
        mAppliancesConstraintLayout.setOnClickListener(this);
        mInventoriesConstraintLayout.setOnClickListener(this);
        mUtilitiesConstraintLayout.setOnClickListener(this);
        mScheduleConstraintLayout.setOnClickListener(this);
        mReminderConstraintLayout.setOnClickListener(this);
    }

    private void retrieveViews() {
        mSecurityConstraintLayout = findViewById(R.id.activity_main_security_constraint_layout);
        mLightsConstraintLayout = findViewById(R.id.activity_main_lights_constraint_layout);
        mThermostatConstraintLayout = findViewById(R.id.activity_main_thermostat_constraint_layout);
        mAppliancesConstraintLayout = findViewById(R.id.activity_main_appliances_constraint_layout);
        mInventoriesConstraintLayout = findViewById(R.id.activity_main_inventories_constraint_layout);
        mUtilitiesConstraintLayout = findViewById(R.id.activity_main_utilities_constraint_layout);
        mScheduleConstraintLayout = findViewById(R.id.activity_main_schedules_constraint_layout);
        mReminderConstraintLayout = findViewById(R.id.activity_main_reminders_constraint_layout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main_menu, menu);
        return true;
    }

    private void setupActionbar() {
        ActionBar actionBar = getSupportActionBar();

        if(actionBar != null) {
            actionBar.setTitle("Smart Home App");
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.activity_main_menu_settings_menu_item:
                startActivity(new Intent(MainActivity.this, SettingsActivity.class));
                break;
        }
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.activity_main_security_constraint_layout:
                startActivity(new Intent(MainActivity.this, SecurityActivity.class));
                break;
            case R.id.activity_main_lights_constraint_layout:
                startActivity(new Intent(MainActivity.this, LightsActivity.class));
                break;
            case R.id.activity_main_thermostat_constraint_layout:
                startActivity(new Intent(MainActivity.this, ThermostatActivity.class));
                break;
            case R.id.activity_main_appliances_constraint_layout:
                startActivity(new Intent(MainActivity.this, AppliancesActivity.class));
                break;
            case R.id.activity_main_inventories_constraint_layout:
                startActivity(new Intent(MainActivity.this, InventoriesActivity.class));
                break;
            case R.id.activity_main_utilities_constraint_layout:
                startActivity(new Intent(MainActivity.this, UtilitiesActivity.class));
                break;
            case R.id.activity_main_schedules_constraint_layout:
                startActivity(new Intent(MainActivity.this, SchedulesActivity.class));
                break;
            case R.id.activity_main_reminders_constraint_layout:
                startActivity(new Intent(MainActivity.this, RemindersActivity.class));
        }
    }
}
