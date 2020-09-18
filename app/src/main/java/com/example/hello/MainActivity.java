package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText E;
    TextView vi;
    String s;
    private Object MainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        vi = (TextView) findViewById(R.id.TextView);
        b = (Button) findViewById(R.id.hButton);
        E = (EditText) findViewById(R.id.PersonName);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = E.getText().toString();

                vi.setText("Hello : "+ s);

            }
        });
    }

}

