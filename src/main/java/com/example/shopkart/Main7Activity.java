package com.example.shopkart;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class Main7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        ImageButton b1;
        final EditText e1,e2;
        b1 = findViewById(R.id.signin);
        e1= findViewById(R.id.email);
        e2= findViewById(R.id.password);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               int num = Integer.parseInt(e1.getText().toString());
                int num1 = Integer.parseInt(e2.getText().toString());
                if(num==101){
                    if(num1 == 1234){
                Intent intent = new Intent(Main7Activity.this,Main10Activity.class);
                startActivity(intent);}}
                }
        });
    }
}
