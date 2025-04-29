package com.example.my_lifehome;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class UserViewModel extends ViewModel {
    private MutableLiveData<List<User>> usersLiveData = new MutableLiveData<>();
    private List<User> users = new ArrayList<>();

    public UserViewModel() {
        // بيانات أولية للاختبار
        users.add(new User("أحمد", "مالك"));
        users.add(new User("منى", "مساعدة منزلية"));
        usersLiveData.setValue(users);
    }

    public LiveData<List<User>> getUsers() {
        return usersLiveData;
    }

    public void addUser(User user) {
        users.add(user);
        usersLiveData.setValue(new ArrayList<>(users));
    }

    public void updateUser(User user) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId().equals(user.getId())) {
                users.set(i, user);
                break;
            }
        }
        usersLiveData.setValue(new ArrayList<>(users));
    }

    public void deleteUser(User user) {
        users.removeIf(u -> u.getId().equals(user.getId()));
        usersLiveData.setValue(new ArrayList<>(users));
    }
}