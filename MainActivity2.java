package com.example.my_lifehome;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // الذهاب إلى صفحة التواصل
        Button btnInternalTrips = findViewById(R.id.btnInternalTrips);

        btnInternalTrips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = "https://api.whatsapp.com/send?phone="+"+966544129220&text=Hi Can You Help Me?";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);

            }
        });
        // إدارة المستخدمين
        Button btnUser = findViewById(R.id.btnThailandDetails);
        btnUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, User_Management.class);
                startActivity(intent);
            }
        });

        // إدارة المهام
        Button btnTask = findViewById(R.id.btnMalaysiaDetails);
        btnTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, Task_Mangment.class);
                startActivity(intent);
            }
        });

        // التواصل الداخلي والملاحظات (ممكن تخصصها لاحقًا لو Activity خاصة)
        Button btnComm = findViewById(R.id.btnMaldivesDetails);
        btnComm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, Communication.class);
                startActivity(intent);
            }
        });

        // الذهاب إلى المكتبة
        Button go = findViewById(R.id.gorgia);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
            }
        });
    }
}
