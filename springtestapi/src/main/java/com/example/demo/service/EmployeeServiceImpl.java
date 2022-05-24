package com.example.demo.service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private static List<Employee> emplList = new ArrayList<>();

//    static {
//        Employee e1 = new Employee();
//        e1.setName("Jacek");
//        e1.setAge(29L);
//        e1.setDepartment("IT");
//        e1.setEmail("ss.wp.pl");
//        e1.setLocation("Poland");
//        emplList.add(e1);
//
//        Employee e2 = new Employee();
//        e2.setName("Robert");
//        e2.setAge(44L);
//        e2.setDepartment("IT Other");
//        e2.setEmail("wweeerrr.wp.pl");
//        e2.setLocation("USA");
//        emplList.add(e2);
//    }

    @Autowired
    private EmployeeRepository employeeRepository;

/*

    @Override
    public List<Employee> getEmployees(int pageNumber, int pageSize) {
        //return emplList;
        Pageable pages = PageRequest.of(pageNumber, pageSize, Sort.Direction.DESC, "id", "name");
        return employeeRepository.findAll(pages).getContent();
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getSingleEmployee(Long id) {
        Optional <Employee> employee = employeeRepository.findById(id);
        if (employee.isPresent()) {
            return  employee.get();
        }
        throw new RuntimeException("Employee is not found for the id " + id);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getEmployeesByName(String name) {
        return employeeRepository.findByName(name);
    }

    @Override
    public List<Employee> getEmployeesByNameAndLocation(String name, String location) {
        return employeeRepository.findByNameAndLocation(name, location);
    }

    @Override
    public List<Employee> getEmployeesByNameOrLocation(String name, String location) {
        return employeeRepository.findByNameOrLocation(name, location);
    }

    @Override
    public List<Employee> getEmployeesByNameContaining(String name) {
        Sort sort = Sort.by(Sort.Direction.ASC, "id");
        return employeeRepository.findByNameContaining(name, sort);
    }

    @Override
    public
    Integer deleteEmployeesByName(String name) {
        return employeeRepository.deleteEmployeesByName(name);
    }

 */
}





























