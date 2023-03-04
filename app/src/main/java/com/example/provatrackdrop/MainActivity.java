package com.example.provatrackdrop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t = (TextView) findViewById(R.id.txt1);
        ImageView i = (ImageView) findViewById(R.id.image);
        Button b = (Button) findViewById(R.id.btnDrag);
        //git hub
    }
}