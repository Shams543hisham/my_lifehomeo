package com.example.my_lifehome;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdminActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    UserAdapter adapter;
    ArrayList<User> users;
    ImageView addUserBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin); // تأكد أن اسم الملف xml هو نفسه

        recyclerView = findViewById(R.id.user_recycler);
        addUserBtn = findViewById(R.id.add_user_btn);

        users = new ArrayList<>();
        users.add(new User("أحمد", "مالك"));
        users.add(new User("سارة", "مربية"));

        adapter = new UserAdapter(users, this, user -> {
            Intent intent = new Intent(AdminActivity.this, EditUserActivity.class);
            intent.putExtra("name", user.name);
            intent.putExtra("role", user.role);
            intent.putExtra("position", users.indexOf(user));
            startActivityForResult(intent, 1);
        });

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        addUserBtn.setOnClickListener(v -> {
            Intent intent = new Intent(AdminActivity.this, EditUserActivity.class);
            intent.putExtra("isNewUser", true);
            startActivityForResult(intent, 1);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == RESULT_OK && data != null) {
            String name = data.getStringExtra("name");
            String role = data.getStringExtra("role");
            int position = data.getIntExtra("position", -1);

            if (position >= 0) {
                users.set(position, new User(name, role));
            } else {
                users.add(new User(name, role));
            }
            adapter.notifyDataSetChanged();
        }
    }
}
