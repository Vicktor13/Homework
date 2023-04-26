package com.vick.HW1.question1.lombok;

public class Test {
    public static void main(String[] args) {
        Person person = Person.builder()
                .firstName("Jack")
                .lastName("Watson")
                .middleName("Wait it for")
                .country("Scotland")
                .address("Home 1")
                .phone("12345678")
                .age(27)
                .gender("M")
                .build();
        System.out.println(person);
    }
}
