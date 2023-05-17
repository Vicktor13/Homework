package com.vick.HW5;

import java.util.List;

public interface StudentDao {
    Student findById(Long id);
    void deleteById(Long id);
    Student findByName(String name);
    List<Student> findAll();
    Student saveOrUpdate(Student student);
    void updateNameById(Long id, String newName);
}
