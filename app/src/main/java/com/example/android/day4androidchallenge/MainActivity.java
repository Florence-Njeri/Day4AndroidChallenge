package com.example.android.day4androidchallenge;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    int progress = 0;
    SeekBar seekBar;
    TextView textView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        seekBar = (SeekBar) findViewById(R.id.seekBar);
        textView = (TextView) findViewById(R.id.textView);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                progress = i;

                String val = String.valueOf(progress);//Use to return the value (Range) of the seekBar
                if((40<=progress)&&(progress<=45)){
                    textView.setText("Inside 40-45 range");
                }else{
                    textView.setText("");
                }

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
 Toast.makeText(getApplicationContext(),String.valueOf(progress), Toast.LENGTH_SHORT).show();
            }
        });




    }



    }


