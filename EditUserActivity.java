package com.example.my_lifehome;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.my_lifehome.databinding.ActivityEditUserBinding;

public class EditUserActivity extends AppCompatActivity {
    private ActivityEditUserBinding binding;
    private UserViewModel userViewModel;
    private User currentUser;
    private boolean isEditMode = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEditUserBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        userViewModel = new ViewModelProvider(this).get(UserViewModel.class);
        initUserData();
        setupListeners();
    }

    private void initUserData() {
        String userId = getIntent().getStringExtra(User_Management.EXTRA_ID);
        if (userId != null) {
            isEditMode = true;
            // في تطبيق حقيقي، ستجلب البيانات من ViewModel أو Repository
            currentUser = new User(
                    getIntent().getStringExtra(User_Management.EXTRA_NAME),
                    getIntent().getStringExtra(User_Management.EXTRA_ROLE)
            );
            currentUser.setId(userId);

            binding.editName.setText(currentUser.getName());
            binding.editRole.setText(currentUser.getRole());
        }
    }

    private void setupListeners() {
        binding.saveButton.setOnClickListener(v -> saveUser());
        binding.cancelButton.setOnClickListener(v -> finish());
    }

    private void saveUser() {
        String name = binding.editName.getText().toString().trim();
        String role = binding.editRole.getText().toString().trim();

        if (name.isEmpty() || role.isEmpty()) {
            Toast.makeText(this, "يجب ملء جميع الحقول", Toast.LENGTH_SHORT).show();
            return;
        }

        if (isEditMode && currentUser != null) {
            currentUser.setName(name);
            currentUser.setRole(role);
            userViewModel.updateUser(currentUser);
        } else {
            User newUser = new User(name, role);
            userViewModel.addUser(newUser);
        }

        setResult(RESULT_OK);
        finish();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}