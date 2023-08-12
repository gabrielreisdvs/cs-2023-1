package org.example._02;

class Human {
    private String name;
    private String age;
    private Address address;

    public Human(String name, String age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getFullAddress() {
        return address;
    }
}