package com.lutfudolay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lutfudolay.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
