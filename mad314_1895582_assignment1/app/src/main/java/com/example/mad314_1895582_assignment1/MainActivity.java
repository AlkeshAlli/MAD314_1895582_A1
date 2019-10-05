package com.example.mad314_1895582_assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText ed1=findViewById(R.id.editText);
        final EditText ed2=findViewById(R.id.editText2);
        final EditText ed3=findViewById(R.id.editText3);
        Button b= findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent in = new Intent(MainActivity.this, Main2Activity.class);
                    in.putExtra("first", ed1.getText().toString());
                    in.putExtra("second", ed2.getText().toString());
                    in.putExtra("third", ed3.getText().toString());
                    startActivity(in);
            }
        });
    }
}
