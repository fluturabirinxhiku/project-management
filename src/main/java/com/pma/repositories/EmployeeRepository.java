package com.pma.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pma.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
