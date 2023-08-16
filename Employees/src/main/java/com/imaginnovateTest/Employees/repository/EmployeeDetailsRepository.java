package com.imaginnovateTest.Employees.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imaginnovateTest.Employees.model.Employee;


/**
 * @author durga
 *
 */
public interface EmployeeDetailsRepository extends JpaRepository<Employee, Long> {

}
