package com.example.my_lifehome;

import java.util.ArrayList;

public class UserManager {

    private static UserManager instance;
    private ArrayList<User> users;

    private UserManager() {
        users = new ArrayList<>();
    }

    public static UserManager getInstance() {
        if (instance == null) {
            instance = new UserManager();
        }
        return instance;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void updateUser(int index, User user) {
        users.set(index, user);
    }
}
