package com.example.my1styear;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Objects;

public class ElectricalAndElectronicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Fundamentals of Electronic..");
        setContentView(R.layout.activity_electrical_and_electronic);
    }
}
