package com.example.android.intentlesson;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        Button btnLight = findViewById(R.id.ButtonMaterialLight);
        Button btnDark = findViewById(R.id.ButtonMaterialDark);

        btnLight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent runLight = new Intent(MainActivity.this, Light.class);
                startActivity(runLight);
            }
        });

        btnDark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent runDark = new Intent(MainActivity.this, Dark.class);
                startActivity(runDark);
            }
        });
    }
}