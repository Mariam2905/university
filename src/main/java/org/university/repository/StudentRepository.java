package org.university.repository;

import org.university.model.address.Address;
import org.university.model.human.student.Degree;
import org.university.model.human.student.Student;

import java.util.List;

public interface StudentRepository {
    void add(Student student);

    Student deleteBy(int id);

    List<Student> deleteAll();

    List<Student> getAll();

    List<Student> getAllBy(String firstName);

    List<Student> getAllBy(String firstName, String lastName);

    List<Student> getAllBy(Degree degree);

    Student getBy(int id);

    List<Address> getAddressListBy(int id);
}
