package com.example.anuradha.cal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    // Button bg,bh;
    Button b1;
    EditText e1, e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        e1 = (EditText) findViewById(R.id.e11);
        e2 = (EditText) findViewById(R.id.e22);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        String first = e1.getText().toString();
        String Second = e2.getText().toString();
        int a=Integer.parseInt(first);
        int b=Integer.parseInt(Second);
        Toast.makeText(this, "ffhtrthrthrth", Toast.LENGTH_SHORT).show();

    }


    }
}
