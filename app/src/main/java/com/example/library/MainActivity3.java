package com.example.library;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    private Button button3;
    private EditText email,password;
    private TextView textview2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        button3 = findViewById(R.id.button3);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        textview2 = findViewById(R.id.textView2);
        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity2.EXTRA_EMAIL);
        String Password = intent.getStringExtra(MainActivity2.EXTRA_PASSWORD);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (email.getText().toString().equals(name)&& password.getText().toString().equals(Password)){
                    Toast.makeText(MainActivity3.this, "Login successfully...", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(button3.getContext(), MainActivity4.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(MainActivity3.this, "wrong credentials", Toast.LENGTH_SHORT).show();
                }
                if(TextUtils.isEmpty(email.getText().toString())){
                    email.setError("email is compulsory");
                }

            }
        });
    }

}