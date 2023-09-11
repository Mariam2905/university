package org.university.repository;

import org.university.model.address.Address;
import org.university.model.human.professor.Degree;
import org.university.model.human.professor.Professor;

import java.util.List;

public interface ProfessorRepository {void add(Professor professor);

    Professor deleteBy(int id);

    List<Professor> deleteAll();

    List<Professor> getAll();

    List<Professor> getAllBy(String firstName);

    List<Professor> getAllBy(String firstName, String lastName);

    List<Professor> getAllBy(Degree degree);

    Professor getBy(int id);

    List<Address> getAddressListBy(int id);

    double getSalaryBy(int id);

    double getTotalSalary();
}
