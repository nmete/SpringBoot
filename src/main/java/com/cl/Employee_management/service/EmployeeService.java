package com.cl.Employee_management.service;

import com.cl.Employee_management.dao.EmployeeDao;
import com.cl.Employee_management.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;
    public Employee saveEmployee(Employee employee){

        if(employee.getSalary() > 10000){
            employee.setGrade("A");
        }else{
            employee.setGrade("B");
        }


        return employeeDao.saveEmployee(employee);
    }


    public Employee updateEmployee( Employee employee){
        return employeeDao.updateEmployee(employee);
    }


    public Employee deleteEmployee(int id){
        return employeeDao.deleteEmployee(id);
    }


    public List<Employee> findAllEmployee(){
        return employeeDao.getAllEmployee();
    }


    public Employee getEmployee(int id){
        return employeeDao.getEmployeeById(id);
    }
}
