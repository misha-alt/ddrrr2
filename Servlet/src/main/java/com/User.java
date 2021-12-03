package com;

public class User {
    private String name;
    private String countre;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountre() {
        return countre;
    }

    public void setCountre(String countre) {
        this.countre = countre;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(String name, String countre, int age) {
        this.name = name;
        this.countre = countre;
        this.age = age;
    }
}
