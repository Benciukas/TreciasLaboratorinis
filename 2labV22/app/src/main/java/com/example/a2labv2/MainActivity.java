package com.example.a2labv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtResult;
    Spinner spnrChoise;
    EditText edtTxtInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.txtResult = findViewById(R.id.txtResult);
        this.edtTxtInput = findViewById(R.id.edtTxtInput);
        this.spnrChoise = (Spinner) findViewById(R.id.spnrChoise);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.Choice, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.spnrChoise.setAdapter(adapter);
    }

    public void btnCalcClk(View view) {

        if (TextUtils.isEmpty(edtTxtInput.getText().toString())) {
            Toast.makeText(MainActivity.this, "Tuščias laukas neskaičiuojamas", Toast.LENGTH_SHORT).show();
        } else {
            if (this.spnrChoise.getSelectedItem().toString().equalsIgnoreCase(getResources().getStringArray(R.array.Choice)[0])) {
                int calcChar = calcWordorChar.getCharsCount(this.edtTxtInput.getText().toString());
                String calcCharFormatted = String.valueOf(calcChar);
                this.txtResult.setText(calcCharFormatted);
            } else {
                int calcWords = calcWordorChar2.getCharsCount2(this.edtTxtInput.getText().toString());
                String calcWordsFormatted = String.valueOf(calcWords);
                this.txtResult.setText(calcWordsFormatted);
            }
        }
    }
}