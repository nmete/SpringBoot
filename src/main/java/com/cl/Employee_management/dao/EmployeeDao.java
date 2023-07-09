package com.cl.Employee_management.dao;

import com.cl.Employee_management.dto.Employee;
import com.cl.Employee_management.repositary.EmployeeRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDao {

    @Autowired
    private EmployeeRepositary employeeRepositary;

    public Employee saveEmployee(Employee employee){
        return employeeRepositary.save(employee);
    }

    public Employee updateEmployee(Employee employee){
        return employeeRepositary.save(employee);
    }
    public Employee getEmployeeById(int id){
        return employeeRepositary.findById(id).get();
    }

    public Employee deleteEmployee(int id){
        Employee emp=getEmployeeById(id);
        employeeRepositary.delete(emp);
        return emp;
    }

    public List<Employee> getAllEmployee(){
        return  employeeRepositary.findAll();
    }




}
