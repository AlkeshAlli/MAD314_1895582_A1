package com.example.mad314_1895582_assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView t= findViewById(R.id.textView);
        TextView t1=findViewById(R.id.textView2);
        Button b1=findViewById(R.id.button2);
        Intent in=getIntent();
        String st1=in.getStringExtra("first"),st2=in.getStringExtra("second"),st3=in.getStringExtra("third");
        int x=Integer.parseInt(st1);
        int y=Integer.parseInt(st2);
        int z=Integer.parseInt(st3);
        t.setText("Sum is "+(x+y+z));
        t1.setText("Product is "+(x*y*z));
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inold=new Intent(Main2Activity.this,MainActivity.class);
                startActivity(inold);
            }
        });
    }
}
