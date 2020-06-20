package com.example.my1styear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView physics = findViewById(R.id.physics_textView);
        TextView lal = findViewById(R.id.lal_textView);
        TextView itp = findViewById(R.id.itp_textView);
        TextView fee = findViewById(R.id.fee_textView);
        TextView pfc = findViewById(R.id.pfc_textView);
        TextView pom = findViewById(R.id.pom_textView);


// Set a click listener on that View
        if (physics != null) {
            physics.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, Physicsactivity.class);
                    startActivity(intent);
                }
            });
        }
        if (lal != null) {
            lal.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the phrases View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, LinearAlgebraActivity.class);
                    startActivity(intent);
                }
            });
        }
        if (itp != null) {
            itp.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the colors View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, IntroToProgrammiingActivity.class);
                    startActivity(intent);
                }
            });
        }
        if (fee != null) {
            fee.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the family View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, ElectricalAndElectronicActivity.class);
                    startActivity(intent);
                }
            });
        }
        if (pfc != null) {
            pfc.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the family View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, ProfessionaCommunicationActivity.class);
                    startActivity(intent);
                }
            });
        }
        if (pom != null) {
            pom.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the family View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, PrinciplesOfManagementActivity.class);
                    startActivity(intent);
                }
            });
        }
    }

}
