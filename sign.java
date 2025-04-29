package com.example.my_lifehome;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class sign extends AppCompatActivity {
    private EditText etNewUsername, etEmail, etNewPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);

        etNewUsername = findViewById(R.id.etNewUsername);
        etEmail = findViewById(R.id.etEmail);
        etNewPassword = findViewById(R.id.etNewPassword);
        Button btnRegister = findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etNewUsername.getText().toString().trim();
                String password = etNewPassword.getText().toString().trim();

                if (username.isEmpty() || password.isEmpty()) {
                    Toast.makeText(sign.this, "يرجى إدخال جميع البيانات", Toast.LENGTH_SHORT).show();
                    return;
                }

                SharedPreferences preferences = getSharedPreferences("user_data", MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("username", username);
                editor.putString("password", password);
                editor.apply();

                Toast.makeText(sign.this, "تم التسجيل بنجاح", Toast.LENGTH_SHORT).show();

                // الانتقال إلى صفحة تسجيل الدخول
                startActivity(new Intent(sign.this, MainActivity.class));
                finish();
            }
        });
    }
}
