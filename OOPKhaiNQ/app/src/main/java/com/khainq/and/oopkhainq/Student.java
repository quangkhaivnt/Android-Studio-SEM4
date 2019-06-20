package com.khainq.and.oopkhainq;

public class Student {
    private String Name;
    private String Address;
    private int Birthday;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getBirthday() {
        return Birthday;
    }

    public void setBirthday(int birthday) {
        Birthday = birthday;
    }

    public Student(String name, String address, int birthday) {
        Name = name;
        Address = address;
        Birthday = birthday;
    }
}
