package com.example.demo.controller;

import com.example.demo.model.Department;
import com.example.demo.repository.DepartmentRepository;
import com.example.demo.response.DepartmentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepository;

    /*
    //http://localhost:8080/departments  in Postman: Read Departments
    @GetMapping("/departments")
    public List<DepartmentResponse> getDepartments() {
        List<Department> departments = departmentRepository.findAll();
        List<DepartmentResponse> list = new ArrayList();
        departments.forEach(department -> {
            DepartmentResponse departmentResponse = new DepartmentResponse();
            departmentResponse.setDepartmentName(department.getName());
            departmentResponse.setId(department.getId());
            departmentResponse.setEmployeeName(department.getEmployee().getName());
            list.add(departmentResponse);
        });
        return list;
    }
    */
}
