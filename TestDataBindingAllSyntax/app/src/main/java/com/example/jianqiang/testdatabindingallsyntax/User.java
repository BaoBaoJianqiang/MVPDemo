package com.example.jianqiang.testdatabindingallsyntax;

/**
 * Created by jianqiang on 17/5/4.
 */

public class User {
    private final String firstName;
    private final String lastName;
    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
}
