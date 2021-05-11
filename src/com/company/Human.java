package com.company;

public class Human {
    private String firstName;

    private String lastName;

    private int age;

    private int password;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        assertCorrectAge(age);
        this.age = age;
    }

    private void assertCorrectAge(int age) {
        if (age < 18 || age > 130) {
            throw new IllegalArgumentException("You must be between 18 and 130 years old!");
        }
    }

    public void setPassword(int password) {
        assertCorrectPasswordLength(Integer.toString(password));
        this.password = password;
    }

    public int getAge() {
        return this.age;
    }

    public int getPassword() {
        return password;
    }

    public void assertCorrectPassword(int pass) {
        if (pass == password){
        } else {
            throw new IllegalArgumentException("Please enter valid password!");
        }
    }

    public void assertCorrectPasswordLength(String password) {
        if (password.length() < 4 || password.length() > 8) {
            throw new IllegalArgumentException("Password must be between 4-8 numbers long!");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
