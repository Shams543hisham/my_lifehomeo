package com.example.my_lifehome;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText etUsername, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        Button btnLogin = findViewById(R.id.btnLogin);
        Button btnSign = findViewById(R.id.btnSign);

        SharedPreferences preferences = getSharedPreferences("user_data", MODE_PRIVATE);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usernameInput = etUsername.getText().toString().trim();
                String passwordInput = etPassword.getText().toString().trim();

                String savedUsername = preferences.getString("username", "");
                String savedPassword = preferences.getString("password", "");

                if (usernameInput.equals(savedUsername) && passwordInput.equals(savedPassword)) {
                    Toast.makeText(MainActivity.this, "تسجيل دخول ناجح", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this, MainActivity2.class));
                    finish();
                } else {
                    Toast.makeText(MainActivity.this, "اسم المستخدم أو كلمة المرور غير صحيحة", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, sign.class));
            }
        });
    }
}
