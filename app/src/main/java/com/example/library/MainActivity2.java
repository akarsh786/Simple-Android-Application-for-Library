package com.example.library;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private Button button4;
    private EditText names,EmailAddress,TextPassword,confirm,branch,enroll,phone;
    public static final String EXTRA_EMAIL = "com.example.library.EXTRA.EMAIL";
    public static final String EXTRA_PASSWORD = "com.example.library.EXTRA.password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button4 = findViewById(R.id.button4);
        names = findViewById(R.id.names);
        branch = findViewById(R.id.branch);
        enroll = findViewById(R.id.enroll);
        phone = findViewById(R.id.phone);
        EmailAddress = findViewById(R.id.EmailAddress);
        TextPassword = findViewById(R.id.TextPassword);
        confirm = findViewById(R.id.confirm);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(names.getText().toString())){
                    names.setError("Enter your name");
                }
                if(TextUtils.isEmpty(branch.getText().toString())){
                    branch.setError("Enter your branch");
                }
                if(TextUtils.isEmpty(enroll.getText().toString())){
                    enroll.setError("Enter your Enrollment number");
                }
                if(TextUtils.isEmpty(phone.getText().toString())){
                    phone.setError("enter your phone number");
                }
                if(TextUtils.isEmpty(EmailAddress.getText().toString())){
                    EmailAddress.setError("Email is compulsory");
                }
                else if (TextUtils.isEmpty(TextPassword.getText().toString())){
                    TextPassword.setError("Type your Password");
                }
                else if(!TextPassword.getText().toString().equals(confirm.getText().toString())){
                    confirm.setError("confirm the same password");
                }
                else if(!EmailAddress.getText().toString().contains("@gmail.com")){
                    EmailAddress.setError("invalid email");
                }
                else {
                    Intent intent = new Intent(button4.getContext(), MainActivity3.class);
                    String email = EmailAddress.getText().toString();
                    String password = TextPassword.getText().toString();
                    intent.putExtra(EXTRA_PASSWORD, password);
                    intent.putExtra(EXTRA_EMAIL, email);
                    startActivity(intent);
                }



            }
        });
    }
}