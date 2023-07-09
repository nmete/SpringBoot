package com.cl.Employee_management.controller;

import com.cl.Employee_management.dao.EmployeeDao;
import com.cl.Employee_management.dto.Employee;
import com.cl.Employee_management.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/save")
    public Employee saveEmployee(@RequestBody Employee employee){
          return employeeService.saveEmployee(employee);
    }

    @PostMapping("/update")
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/delete")
    public Employee deleteEmployee(@RequestParam int id){
        return employeeService.deleteEmployee(id);
    }

    @GetMapping("/findall")
    public List<Employee> findAllEmployee(){
        return employeeService.findAllEmployee();
    }

    @GetMapping("/getbyid/{id}")
    public Employee getEmployee(@PathVariable int id){
        return employeeService.getEmployee(id);
    }
}
