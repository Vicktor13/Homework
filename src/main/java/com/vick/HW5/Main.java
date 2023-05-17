package com.vick.HW5;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SessionFactoryUtils sessionFactoryUtils = new SessionFactoryUtils();
        sessionFactoryUtils.init();
        try {
            StudentDao studentDao = new StudentDaoImpl(sessionFactoryUtils);
            List<Student> studentList = studentDao.findAll();
            System.out.println(studentList.size());
            Student newStudent = new Student();
            newStudent.setName("Lion");
            newStudent.setMark(99);
            studentDao.saveOrUpdate(newStudent);

            Student student1 = studentDao.findById(980L);
            System.out.println(student1);
            Student student2 = studentDao.findByName("Lion");
            System.out.println(student2);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessionFactoryUtils.shutdown();
        }

    }
}
