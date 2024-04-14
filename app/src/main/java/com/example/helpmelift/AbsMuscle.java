package com.example.helpmelift;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AbsMuscle extends AppCompatActivity {

    //private ActivityAbsMusclesBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs_muscles);

        String muscleSelection = getIntent().getStringExtra("Muscle");
        ((TextView)findViewById(R.id.muscleSelected)).setText(muscleSelection);

    }



}