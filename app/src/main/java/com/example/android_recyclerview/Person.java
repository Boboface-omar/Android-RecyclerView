package com.example.android_recyclerview;

// Person.java
public class Person {
    private String name;
    private String email;
    private int profileImage;

    public Person(String name, String email, int profileImage) {
        this.name = name;
        this.email = email;
        this.profileImage = profileImage;
    }

    // Getters
    public String getName() { return name; }
    public String getEmail() { return email; }
    public int getProfileImage() { return profileImage; }

    public void setProfileImage(int profileImage) {
        this.profileImage = profileImage;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }
}
