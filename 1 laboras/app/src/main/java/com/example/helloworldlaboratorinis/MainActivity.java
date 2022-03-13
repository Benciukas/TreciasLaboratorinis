package com.example.helloworldlaboratorinis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnChangeColor(View view) {
        TextView text=(TextView)findViewById(R.id.txtMain);
        text.setBackgroundColor(0xFFFF0000);

    }

    public void onBtnChangeName(View view) {
        TextView text=(TextView)findViewById(R.id.txtMain);
        text.setText("New Text");
    }
    }

