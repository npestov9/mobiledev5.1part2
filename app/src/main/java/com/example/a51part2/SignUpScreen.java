package com.example.a51part2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SignUpScreen extends AppCompatActivity {

    private EditText fullName;
    private EditText username;
    private EditText password;
    private EditText confirmPassword;
    private Button createAccountButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        fullName = findViewById(R.id.fullName);
        username = findViewById(R.id.usernameSignUp);
        password = findViewById(R.id.passwordSignUp);
        confirmPassword = findViewById(R.id.confirmPassword);
        createAccountButton = findViewById(R.id.createAccountButton);

        createAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implement your sign-up logic here
                // Example: validate input and create user account
                startActivity(new Intent(SignUpScreen.this, HomeScreen.class));
            }
        });
    }
}
