package com.vick.HW7.service;

import com.vick.HW7.entity.Student;
import com.vick.HW7.exceptions.ResourceNotFoundException;
import com.vick.HW7.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    public Student findById(Long id) {
        return studentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Student not found: id=" + id));
    }

    public Student saveNew(Student student) {
        return studentRepository.save(student);
    }

    @Transactional
    public Student update(Student newStudent) {
        Student student = studentRepository.findById(newStudent.getId())
                .orElseThrow(() -> new ResourceNotFoundException("Невозможно обновить данные студента с id=" + newStudent.getId()));
        student.setAge(newStudent.getAge());
        student.setName(newStudent.getName());
        return student;
    }

    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }

    public void deleteAll() {
        studentRepository.deleteAll();
    }
}
