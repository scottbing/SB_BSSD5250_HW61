package com.example.sb_bssd5250_hw61;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // make the connection to the Constraint Layout
        final ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.constraintlayout);
        constraintLayout.setBackgroundColor(Color.WHITE);

        // make the connection to the XML buttons
        Button redButton = (Button)findViewById(R.id.RedButton);
        Button greenButton = (Button)findViewById(R.id.GreenButton);
        Button blueButton = (Button)findViewById(R.id.BlueButton);

        // set up button listeners
        redButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MainActivity","button clicked");
                constraintLayout.setBackgroundColor(Color.BLUE);
                CharSequence text = "The background color is changed to Blue";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(getApplicationContext(), text, duration);
                toast.show();
            }
        });


        greenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MainActivity","button clicked");
                constraintLayout.setBackgroundColor(Color.RED);
                CharSequence text = "The background color is changed to Red";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(getApplicationContext(), text, duration);
                toast.show();
            }
        });

        blueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("MainActivity","button clicked");
                constraintLayout.setBackgroundColor(Color.GREEN);
                CharSequence text = "The background color is changed to Green";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(getApplicationContext(), text, duration);
                toast.show();
            }
        });

    }
}
