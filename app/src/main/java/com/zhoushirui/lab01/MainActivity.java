package com.zhoushirui.lab01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    Button submitButton;
    Button submitButton2;
    TextView displayText;
    int counter = 0;
    int counter2 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submitButton=findViewById(R.id.clickButton);
        submitButton2=findViewById(R.id.clickButton2);
        displayText=findViewById(R.id.textBox);
        submitButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                counter++;
                displayText.setText("Thank you, very cool! x " + counter);
                Log.i("first", "number: " + counter);
            }
        });
        submitButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                counter2++;
                displayText.setText("Hey, that's pretty good x " + counter2);
                Log.i("second", "number: " + counter2);
            }
        });
    }
}
