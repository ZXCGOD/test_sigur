package com.example.test_sigur.data_access;


import com.example.test_sigur.data_access.DepartmentRepository;
import com.example.test_sigur.data_access.Employee;
import com.example.test_sigur.data_access.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;

@Component
@ComponentScan("com.example.test_sigur.data_access")
public class EmployeesMgr {


//    @Autowired
//    private EmployeeRepository employeeRepository;
//
//    @Autowired
//    private DepartmentRepository departmentRepository;
//
//    @Transactional
//    public void hire_employee(Date hire_date){
//        employeeRepository.save(new Employee(00000000,hire_date,new Date(2022,1,1),1));
//    }
}
