package com.sajjad.bthsecurity;

import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;

public class SecurityActivity extends AppCompatActivity implements View.OnClickListener {

    private ConstraintLayout mMainConstraintLayout;
    private ConstraintLayout mARMConstraintLayout;
    private RecyclerView mRoomRecyclerView;

    private Boolean mIsArmed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_security);

        setupActionbar();
        retrieveViews();

        setupListeners();
        setupRecyclerView();
    }

    private void setupRecyclerView() {
        RoomAdapter roomAdapter = new RoomAdapter(this);
        mRoomRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRoomRecyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        mRoomRecyclerView.setAdapter(roomAdapter);
    }

    private void setupListeners() {
        mARMConstraintLayout.setOnClickListener(this);
    }

    private void retrieveViews() {
        mMainConstraintLayout = findViewById(R.id.activity_security_main_constraint_layout);
        mARMConstraintLayout = findViewById(R.id.activity_security_arm_constraint_layout);
        mRoomRecyclerView = findViewById(R.id.activity_security_rooms_recycler_view);
    }

    private void setupActionbar() {
        ActionBar actionBar = getSupportActionBar();

        if(actionBar != null) {
            actionBar.setTitle("Security");
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.activity_security_arm_constraint_layout:

                if(mIsArmed) {
                    mIsArmed = false;
                    Snackbar.make(mMainConstraintLayout, "Alarm Has Been Disarmed", Snackbar.LENGTH_SHORT).show();
                } else {
                    mIsArmed = true;
                    Snackbar.make(mMainConstraintLayout, "Alarm Has Been Armed", Snackbar.LENGTH_SHORT).show();
                }
                break;
        }
    }
}
