package com.example.library;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openActivity(View v){
        Toast.makeText(this, "Opening Registration Window...", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);

    }
    public void openActivity1(View v){
        Toast.makeText(this, "Opening Login Window...", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,MainActivity3.class);
        startActivity(intent);

    }
}