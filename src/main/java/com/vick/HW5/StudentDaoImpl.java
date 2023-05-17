package com.vick.HW5;

import jakarta.persistence.NoResultException;
import org.hibernate.Session;

import java.util.List;

public class StudentDaoImpl implements StudentDao{

    private SessionFactoryUtils sessionFactoryUtils;

    public StudentDaoImpl(SessionFactoryUtils sessionFactoryUtils) {
        this.sessionFactoryUtils = sessionFactoryUtils;
    }


    @Override
    public Student findById(Long id) {
        try (Session session = sessionFactoryUtils.getSession()) {
            session.beginTransaction();
            Student student = session.get(Student.class, id);
            session.getTransaction().commit();
            return student;
        }
    }

    @Override
    public void deleteById(Long id) {
        try (Session session = sessionFactoryUtils.getSession()) {
            session.beginTransaction();
            Student student = session.get(Student.class, id);
            session.remove(student);
            session.getTransaction().commit();
        }
    }

    @Override
    public Student findByName(String name) {
        try (Session session = sessionFactoryUtils.getSession()) {
            session.beginTransaction();
            Student student = session
                    .createQuery("select student from Student student where student.name = :name", Student.class)
                    .setParameter("name", name)
                    .getSingleResult();
            session.getTransaction().commit();
            return student;
        }
    }

    @Override
        public List<Student> findAll() {
            try (Session session = sessionFactoryUtils.getSession()) {
                session.beginTransaction();
                List<Student> students = session.createQuery("select s from Student s").getResultList();
                session.getTransaction().commit();
                return students;
            }
    }

    @Override
    public Student saveOrUpdate(Student student) {
        try (Session session = sessionFactoryUtils.getSession()) {
            session.beginTransaction();
            try {
                Student oldStudent = session.createQuery("select oldStud from Student oldStud where oldStud.name = :name", Student.class)
                        .setParameter("name", student.getName())
                        .getSingleResult();
                oldStudent.setMark(student.getMark());
                session.getTransaction().commit();
                return student;
            } catch (NoResultException e) {
                session.save(student);
                session.getTransaction().commit();
                return student;
            }

        }
    }

    @Override
    public void updateNameById(Long id, String newName) {
        try (Session session = sessionFactoryUtils.getSession()) {
            session.beginTransaction();
            Student student = session.get(Student.class, id);
            student.setName(newName);
            session.getTransaction().commit();
        }
    }
}
