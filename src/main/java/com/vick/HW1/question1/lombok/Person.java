package com.vick.HW1.question1.lombok;

import lombok.Builder;
import lombok.Data;


/*Сделал используя Lombok*/
@Data
@Builder
public class Person {
    String firstName;
    String lastName;
    String middleName;
    String country;
    String address;
    String phone;
    int age;
    String gender;

}
