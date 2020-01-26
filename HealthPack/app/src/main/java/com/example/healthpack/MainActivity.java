package com.example.healthpack;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.inputmethodservice.InputMethodService;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InputMethodService ims= new InputMethodService();
        setContentView(ims.onCreateCandidatesView());

        final Button continueButton = findViewById(R.id.button);

        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, results.class), savedInstanceState); //Must be fixed
            }
        });//figure out how to do the text boxes
    }}
