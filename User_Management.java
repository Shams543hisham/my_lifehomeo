package com.example.my_lifehome;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class User_Management extends AppCompatActivity {
    // تعريف الثوابت
    public static final String EXTRA_NAME = "name";
    public static final String EXTRA_ROLE = "role";
    public static final String EXTRA_POSITION = "position";
    public static final String EXTRA_ID = "id"; // إضافة معرف المستخدم
    public static final int EDIT_USER_REQUEST = 1;

    private RecyclerView recyclerView;
    private UserAdapter adapter;
    private UserViewModel userViewModel; // تصحيح نوع المتغير
    private ImageView addUserBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_management);

        initViews();
        setupViewModel();
        setupRecyclerView();
        setupListeners();
    }

    private void initViews() {
        recyclerView = findViewById(R.id.user_recycler);
        addUserBtn = findViewById(R.id.add_user_btn);
    }

    private void setupViewModel() {
        userViewModel = new ViewModelProvider(this).get(UserViewModel.class); // تصحيح هنا
        userViewModel.getUsers().observe(this, users -> {
            adapter.updateUsers(users);
        });
    }

    private void setupRecyclerView() {
        adapter = new UserAdapter(new ArrayList<>(), this, user -> {
            openEditUserActivity(user);
        });

        adapter.setDeleteListener(user -> {
            showDeleteConfirmation(user);
        });

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }

    private void showDeleteConfirmation(User user) {
        new android.app.AlertDialog.Builder(this)
                .setTitle("حذف المستخدم")
                .setMessage("هل أنت متأكد من حذف " + user.getName() + "؟")
                .setPositiveButton("نعم", (dialog, which) -> {
                    userViewModel.deleteUser(user);
                })
                .setNegativeButton("لا", null)
                .show();
    }

    private void setupListeners() {
        addUserBtn.setOnClickListener(v -> {
            openEditUserActivity(null);
        });
    }

    private void openEditUserActivity(@Nullable User user) {
        Intent intent = new Intent(this, EditUserActivity.class);
        if (user != null) {
            intent.putExtra(EXTRA_ID, user.getId());
            intent.putExtra(EXTRA_NAME, user.getName());
            intent.putExtra(EXTRA_ROLE, user.getRole());
        }
        startActivityForResult(intent, EDIT_USER_REQUEST);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == EDIT_USER_REQUEST && resultCode == RESULT_OK) {
            // سيتم تحديث القائمة تلقائياً عبر الـ ViewModel
        }
    }
}