package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button maleButton;
    private Button femaleButton;
    private Button notToSayButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        maleButton = findViewById(R.id.maleButton);
        femaleButton = findViewById(R.id.femaleButton);
        notToSayButton = findViewById(R.id.notToSayButton);


        maleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                maleButton.setTextColor(getResources().getColor(android.R.color.white));
                femaleButton.setTextColor(getResources().getColor(R.color.custom_grey));
                notToSayButton.setTextColor(getResources().getColor(R.color.custom_grey));

                maleButton.setBackgroundResource(R.drawable.gender_button_pressed);
                femaleButton.setBackgroundResource(R.drawable.gender_button);
                notToSayButton.setBackgroundResource(R.drawable.gender_button);
            }
        });

        femaleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                femaleButton.setTextColor(getResources().getColor(android.R.color.white));
                maleButton.setTextColor(getResources().getColor(R.color.custom_grey));
                notToSayButton.setTextColor(getResources().getColor(R.color.custom_grey));

                femaleButton.setBackgroundResource(R.drawable.gender_button_pressed);
                maleButton.setBackgroundResource(R.drawable.gender_button);
                notToSayButton.setBackgroundResource(R.drawable.gender_button);
            }
        });

        notToSayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notToSayButton.setTextColor(getResources().getColor(android.R.color.white));
                maleButton.setTextColor(getResources().getColor(R.color.custom_grey));
                femaleButton.setTextColor(getResources().getColor(R.color.custom_grey));

                notToSayButton.setBackgroundResource(R.drawable.gender_button_pressed);
                maleButton.setBackgroundResource(R.drawable.gender_button);
                femaleButton.setBackgroundResource(R.drawable.gender_button);
            }
        });
    }
}
