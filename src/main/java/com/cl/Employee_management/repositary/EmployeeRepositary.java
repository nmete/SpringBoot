package com.cl.Employee_management.repositary;

import com.cl.Employee_management.dto.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  EmployeeRepositary extends JpaRepository<Employee, Integer> {

}
