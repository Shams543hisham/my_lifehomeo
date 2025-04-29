package com.example.my_lifehome;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity3 extends AppCompatActivity {
    ImageView v1,v3,v5,v7,v9,v13,v17,v19,v21,v23,v25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        v1=findViewById(R.id.v1);
        v3=findViewById(R.id.v3);
        v5=findViewById(R.id.v5);
        v7=findViewById(R.id.v7);
        v9=findViewById(R.id.v9);
        v13=findViewById(R.id.v13);
        v17=findViewById(R.id.v17);
        v19=findViewById(R.id.v19);
        v21=findViewById(R.id.v21);
        v23=findViewById(R.id.v23);
        v25=findViewById(R.id.v25);

        v1.setOnClickListener(view -> {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search-academy.com/assets/uploads/library/%D8%A7%D9%84%D9%86%D9%82%D8%AF%20%D8%A7%D9%84%D8%B3%D9%8A%D8%A7%D8%B3%D9%8A%20%D9%84%D8%AC%D8%AF%D9%84%D9%8A%D8%A9%20%D8%A7%D9%84%D8%AA%D9%82%D9%86%D9%8A%D8%A9%20%D9%84%D8%AF%D9%89%20%D9%81%D9%84%D8%A7%D8%B3%D9%81%D8%A9%20%D9%85%D8%AF%D8%B1%D8%B3%D8%A9%20%D9%81%D8%B1%D8%A7%D9%86%D9%83%D9%81%D9%88%D8%B1%D8%AA%20..%20%D9%85%D8%A7%D8%B1%D9%8A%D9%88%D8%B2%20%D9%88%20%D9%87%D8%A7%D8%A8%D8%B1%D9%85%D8%A7%D8%B3%20%D9%86%D9%85%D9%88%D8%B0%D8%AC%D8%A7%D9%86.pdf"));
            startActivity(browserIntent);
        });
        v3.setOnClickListener(view -> {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.harmoon.org/wp-content/uploads/2019/10/%D8%A7%D9%84%D9%86%D9%82%D8%AF-%D8%A7%D9%84%D8%B3%D9%8A%D8%A7%D8%B3%D9%8A-%D9%84%D9%84%D9%88%D8%A7%D9%82%D8%B9-%D8%A7%D9%84%D8%B9%D8%B1%D8%A8%D9%8A.pdf"));
            startActivity(browserIntent);
        });
        v5.setOnClickListener(view -> {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search-academy.com/assets/uploads/library/%D8%A7%D9%84%D9%86%D9%82%D8%AF%20%D8%A7%D9%84%D8%B3%D9%8A%D8%A7%D8%B3%D9%8A%20%D9%84%D8%AC%D8%AF%D9%84%D9%8A%D8%A9%20%D8%A7%D9%84%D8%AA%D9%82%D9%86%D9%8A%D8%A9%20%D9%84%D8%AF%D9%89%20%D9%81%D9%84%D8%A7%D8%B3%D9%81%D8%A9%20%D9%85%D8%AF%D8%B1%D8%B3%D8%A9%20%D9%81%D8%B1%D8%A7%D9%86%D9%83%D9%81%D9%88%D8%B1%D8%AA%20..%20%D9%85%D8%A7%D8%B1%D9%8A%D9%88%D8%B2%20%D9%88%20%D9%87%D8%A7%D8%A8%D8%B1%D9%85%D8%A7%D8%B3%20%D9%86%D9%85%D9%88%D8%B0%D8%AC%D8%A7%D9%86.pdf"));
            startActivity(browserIntent);
        });
        v7.setOnClickListener(view -> {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search-academy.com/assets/uploads/library/%D8%A7%D9%84%D9%86%D9%82%D8%AF%20%D8%A7%D9%84%D8%B3%D9%8A%D8%A7%D8%B3%D9%8A%20%D9%84%D8%AC%D8%AF%D9%84%D9%8A%D8%A9%20%D8%A7%D9%84%D8%AA%D9%82%D9%86%D9%8A%D8%A9%20%D9%84%D8%AF%D9%89%20%D9%81%D9%84%D8%A7%D8%B3%D9%81%D8%A9%20%D9%85%D8%AF%D8%B1%D8%B3%D8%A9%20%D9%81%D8%B1%D8%A7%D9%86%D9%83%D9%81%D9%88%D8%B1%D8%AA%20..%20%D9%85%D8%A7%D8%B1%D9%8A%D9%88%D8%B2%20%D9%88%20%D9%87%D8%A7%D8%A8%D8%B1%D9%85%D8%A7%D8%B3%20%D9%86%D9%85%D9%88%D8%B0%D8%AC%D8%A7%D9%86.pdf"));
            startActivity(browserIntent);
        });
        v9.setOnClickListener(view -> {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search-academy.com/assets/uploads/library/%D8%A7%D9%84%D9%86%D9%82%D8%AF%20%D8%A7%D9%84%D8%B3%D9%8A%D8%A7%D8%B3%D9%8A%20%D9%84%D8%AC%D8%AF%D9%84%D9%8A%D8%A9%20%D8%A7%D9%84%D8%AA%D9%82%D9%86%D9%8A%D8%A9%20%D9%84%D8%AF%D9%89%20%D9%81%D9%84%D8%A7%D8%B3%D9%81%D8%A9%20%D9%85%D8%AF%D8%B1%D8%B3%D8%A9%20%D9%81%D8%B1%D8%A7%D9%86%D9%83%D9%81%D9%88%D8%B1%D8%AA%20..%20%D9%85%D8%A7%D8%B1%D9%8A%D9%88%D8%B2%20%D9%88%20%D9%87%D8%A7%D8%A8%D8%B1%D9%85%D8%A7%D8%B3%20%D9%86%D9%85%D9%88%D8%B0%D8%AC%D8%A7%D9%86.pdf"));
            startActivity(browserIntent);
        });
        v13.setOnClickListener(view -> {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search-academy.com/assets/uploads/library/%D8%A7%D9%84%D9%86%D9%82%D8%AF%20%D8%A7%D9%84%D8%B3%D9%8A%D8%A7%D8%B3%D9%8A%20%D9%84%D8%AC%D8%AF%D9%84%D9%8A%D8%A9%20%D8%A7%D9%84%D8%AA%D9%82%D9%86%D9%8A%D8%A9%20%D9%84%D8%AF%D9%89%20%D9%81%D9%84%D8%A7%D8%B3%D9%81%D8%A9%20%D9%85%D8%AF%D8%B1%D8%B3%D8%A9%20%D9%81%D8%B1%D8%A7%D9%86%D9%83%D9%81%D9%88%D8%B1%D8%AA%20..%20%D9%85%D8%A7%D8%B1%D9%8A%D9%88%D8%B2%20%D9%88%20%D9%87%D8%A7%D8%A8%D8%B1%D9%85%D8%A7%D8%B3%20%D9%86%D9%85%D9%88%D8%B0%D8%AC%D8%A7%D9%86.pdf"));
            startActivity(browserIntent);
        });
        v17.setOnClickListener(view -> {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search-academy.com/assets/uploads/library/%D8%A7%D9%84%D9%86%D9%82%D8%AF%20%D8%A7%D9%84%D8%B3%D9%8A%D8%A7%D8%B3%D9%8A%20%D9%84%D8%AC%D8%AF%D9%84%D9%8A%D8%A9%20%D8%A7%D9%84%D8%AA%D9%82%D9%86%D9%8A%D8%A9%20%D9%84%D8%AF%D9%89%20%D9%81%D9%84%D8%A7%D8%B3%D9%81%D8%A9%20%D9%85%D8%AF%D8%B1%D8%B3%D8%A9%20%D9%81%D8%B1%D8%A7%D9%86%D9%83%D9%81%D9%88%D8%B1%D8%AA%20..%20%D9%85%D8%A7%D8%B1%D9%8A%D9%88%D8%B2%20%D9%88%20%D9%87%D8%A7%D8%A8%D8%B1%D9%85%D8%A7%D8%B3%20%D9%86%D9%85%D9%88%D8%B0%D8%AC%D8%A7%D9%86.pdf"));
            startActivity(browserIntent);
        });
        v19.setOnClickListener(view -> {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search-academy.com/assets/uploads/library/%D8%A7%D9%84%D9%86%D9%82%D8%AF%20%D8%A7%D9%84%D8%B3%D9%8A%D8%A7%D8%B3%D9%8A%20%D9%84%D8%AC%D8%AF%D9%84%D9%8A%D8%A9%20%D8%A7%D9%84%D8%AA%D9%82%D9%86%D9%8A%D8%A9%20%D9%84%D8%AF%D9%89%20%D9%81%D9%84%D8%A7%D8%B3%D9%81%D8%A9%20%D9%85%D8%AF%D8%B1%D8%B3%D8%A9%20%D9%81%D8%B1%D8%A7%D9%86%D9%83%D9%81%D9%88%D8%B1%D8%AA%20..%20%D9%85%D8%A7%D8%B1%D9%8A%D9%88%D8%B2%20%D9%88%20%D9%87%D8%A7%D8%A8%D8%B1%D9%85%D8%A7%D8%B3%20%D9%86%D9%85%D9%88%D8%B0%D8%AC%D8%A7%D9%86.pdf"));
            startActivity(browserIntent);
        });
        v21.setOnClickListener(view -> {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search-academy.com/assets/uploads/library/%D8%A7%D9%84%D9%86%D9%82%D8%AF%20%D8%A7%D9%84%D8%B3%D9%8A%D8%A7%D8%B3%D9%8A%20%D9%84%D8%AC%D8%AF%D9%84%D9%8A%D8%A9%20%D8%A7%D9%84%D8%AA%D9%82%D9%86%D9%8A%D8%A9%20%D9%84%D8%AF%D9%89%20%D9%81%D9%84%D8%A7%D8%B3%D9%81%D8%A9%20%D9%85%D8%AF%D8%B1%D8%B3%D8%A9%20%D9%81%D8%B1%D8%A7%D9%86%D9%83%D9%81%D9%88%D8%B1%D8%AA%20..%20%D9%85%D8%A7%D8%B1%D9%8A%D9%88%D8%B2%20%D9%88%20%D9%87%D8%A7%D8%A8%D8%B1%D9%85%D8%A7%D8%B3%20%D9%86%D9%85%D9%88%D8%B0%D8%AC%D8%A7%D9%86.pdf"));
            startActivity(browserIntent);
        });
        v23.setOnClickListener(view -> {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search-academy.com/assets/uploads/library/%D8%A7%D9%84%D9%86%D9%82%D8%AF%20%D8%A7%D9%84%D8%B3%D9%8A%D8%A7%D8%B3%D9%8A%20%D9%84%D8%AC%D8%AF%D9%84%D9%8A%D8%A9%20%D8%A7%D9%84%D8%AA%D9%82%D9%86%D9%8A%D8%A9%20%D9%84%D8%AF%D9%89%20%D9%81%D9%84%D8%A7%D8%B3%D9%81%D8%A9%20%D9%85%D8%AF%D8%B1%D8%B3%D8%A9%20%D9%81%D8%B1%D8%A7%D9%86%D9%83%D9%81%D9%88%D8%B1%D8%AA%20..%20%D9%85%D8%A7%D8%B1%D9%8A%D9%88%D8%B2%20%D9%88%20%D9%87%D8%A7%D8%A8%D8%B1%D9%85%D8%A7%D8%B3%20%D9%86%D9%85%D9%88%D8%B0%D8%AC%D8%A7%D9%86.pdf"));
            startActivity(browserIntent);
        });
        v25.setOnClickListener(view -> {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://search-academy.com/assets/uploads/library/%D8%A7%D9%84%D9%86%D9%82%D8%AF%20%D8%A7%D9%84%D8%B3%D9%8A%D8%A7%D8%B3%D9%8A%20%D9%84%D8%AC%D8%AF%D9%84%D9%8A%D8%A9%20%D8%A7%D9%84%D8%AA%D9%82%D9%86%D9%8A%D8%A9%20%D9%84%D8%AF%D9%89%20%D9%81%D9%84%D8%A7%D8%B3%D9%81%D8%A9%20%D9%85%D8%AF%D8%B1%D8%B3%D8%A9%20%D9%81%D8%B1%D8%A7%D9%86%D9%83%D9%81%D9%88%D8%B1%D8%AA%20..%20%D9%85%D8%A7%D8%B1%D9%8A%D9%88%D8%B2%20%D9%88%20%D9%87%D8%A7%D8%A8%D8%B1%D9%85%D8%A7%D8%B3%20%D9%86%D9%85%D9%88%D8%B0%D8%AC%D8%A7%D9%86.pdf"));
            startActivity(browserIntent);
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void back(View view) {
        Intent intent = new Intent(MainActivity3.this, MainActivity2.class);
        startActivity(intent);
    }
}