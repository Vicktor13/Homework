package com.vick.HW1.question1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder()
                .setFirstName("Jack")
                .setLastName("Watson")
                .setMiddleName("Wait it for")
                .setCountry("Scotland")
                .setAddress("Home 1")
                .setPhone("12345678")
                .setAge(27)
                .setGender("M")
                .build();

    }
}
