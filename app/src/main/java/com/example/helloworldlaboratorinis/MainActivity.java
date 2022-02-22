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


    public void onBtnMainClick(View view) {
        TextView txtMain=(TextView)findViewById(R.id.txtMain);
        txtMain.setText("Naujas tekstas");
    }
}