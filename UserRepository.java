package com.example.my_lifehome;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private static UserRepository instance;
    private List<User> users = new ArrayList<>();

    private UserRepository() {
        // بيانات أولية للاختبار
        users.add(new User("أحمد", "مالك"));
        users.add(new User("منى", "مساعدة منزلية"));
    }

    public static synchronized UserRepository getInstance() {
        if (instance == null) {
            instance = new UserRepository();
        }
        return instance;
    }

    public List<User> getUsers() {
        return new ArrayList<>(users);
    }

    public User getUserById(String id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void updateUser(User updatedUser) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId().equals(updatedUser.getId())) {
                users.set(i, updatedUser);
                break;
            }
        }
    }

    public void deleteUser(String userId) {
        users.removeIf(user -> user.getId().equals(userId));
    }
}