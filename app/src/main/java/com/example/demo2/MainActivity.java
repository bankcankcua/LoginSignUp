package com.example.demo2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView txtSignIn,txtSignUp;
    Button btnSignIn,btnSignUp;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addEvents() {
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLoginActivity();
                openSignUpActivity();
            }
        });
    }

    private void openSignUpActivity() {
        Intent intent=new Intent(MainActivity.this, SignUpActivity.class);

    }

    private void openLoginActivity() {
        Intent intent=new Intent(MainActivity.this,LoginActivity.class);
    }


    private void addControls() {
        btnSignIn=findViewById(R.id.btnSignIn);
        btnSignUp=findViewById(R.id.btnSignUp);
    }
}