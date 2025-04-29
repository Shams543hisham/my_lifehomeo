package com.example.my_lifehome;

public class User {
    private String id; // معرف فريد للمستخدم
    private String name;
    private String role;
    private String imageUrl; // رابط صورة المستخدم
    private String email; // إضافة المزيد من الحقول حسب الحاجة

    public User() {
        // Constructor فارغ لاستخدامه مع Firestore
    }

    public User(String name, String role) {
        this.id = java.util.UUID.randomUUID().toString(); // إنشاء معرف فريد
        this.name = name;
        this.role = role;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id.equals(user.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}