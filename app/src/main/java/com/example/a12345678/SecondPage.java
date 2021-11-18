package com.example.a12345678;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.a12345678.R;

public class SecondPage extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
        Button genButton = (Button) findViewById(R.id.GenerationButton);
        genButton.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        Intent i;
        i = new Intent(this, Third_page.class);
        startActivity(i);
    }
    public void buttonOnClick(){
        EditText editKeyObj = (EditText) findViewById(R.id.KeyObjects);
        EditText editCharact = (EditText) findViewById(R.id.Characters);
        Spinner locations = (Spinner) findViewById(R.id.Locations);
        Spinner genre = (Spinner) findViewById(R.id.Genre);
        TextView result = (TextView) findViewById(R.id.result);
       Button genButton = (Button) findViewById(R.id.GenerationButton);

        genButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(editCharact.getText());
            }
        });



    }
}