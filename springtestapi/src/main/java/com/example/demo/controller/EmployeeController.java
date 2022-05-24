package com.example.demo.controller;

import com.example.demo.dao.EmployeeDAOImplementation;
import com.example.demo.model.Department;
import com.example.demo.model.Employee;
import com.example.demo.repository.DepartmentRepository;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.request.EmployeeRequest;
import com.example.demo.response.EmployeeResponse;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

//@Controller
@RestController  // używamy tych dwóch: @Controller + @ResponseBody
//@RequestMapping("/api/v1")  // w properitasach zmienna:  server.servlet.context-path
public class EmployeeController {

//    //localhost:8080/api/v1/employees

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private EmployeeDAOImplementation employeeDAOImplementation;


    @Value("${app.name: Employee Default Value Name}")
    private String appName;

    @Value("${app.version: Employee Default Value Version}")
    private String appVersion;

    @GetMapping("/version")
    public String getAppDetails() {
        return appName + "-" + appVersion;
    }

/*
    //http://localhost:8080/employees
    @GetMapping("/employees")  //zamiast tego: @RequestMapping(value = "/employees", method = RequestMethod.GET)
    //  @ResponseBody
    public
    ResponseEntity<List<Employee>> getEmployees(@RequestParam Integer pageNumber, @RequestParam Integer pageSize) {
        return new ResponseEntity<List<Employee>>(employeeService.getEmployees(pageNumber, pageSize), HttpStatus.OK);
    }

    //http://localhost:8080/employees/2
    @GetMapping("/employees/{id}")  //zamiast tego: @RequestMapping(value = "/employees", method = RequestMethod.GET)
    //  @ResponseBody
    public
    ResponseEntity<Employee> getEmployee(@PathVariable Long id) {
        return new ResponseEntity<Employee>(employeeService.getSingleEmployee(id), HttpStatus.OK);
    }

    //http://localhost:8080/employees  in Postman Create Employee
    @PostMapping("/employees")
    public
    ResponseEntity<Employee> saveEmployee(@Valid @RequestBody Employee employee) {
        return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
    }


    //http://localhost:8080/employees/45
    @PutMapping("/employees/{id}")
    public
    ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        employee.setId(id);
        return new ResponseEntity<Employee>(employeeService.updateEmployee(employee), HttpStatus.OK);
    }

    //http://localhost:8080/employees?id=34
    @DeleteMapping("/employees")
    public
    ResponseEntity<HttpStatus> deleteEmployee(@RequestParam Long id) {
        employeeService.deleteEmployee(id);
        return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
    }

    //http://localhost:8080/employees/filterByName?name=Wacek
    @GetMapping("/employees/filterByName")
    public
    ResponseEntity<List<Employee>> getEmployeesByName(@RequestParam String name) {
        return new ResponseEntity<List<Employee>>(employeeService.getEmployeesByName(name), HttpStatus.OK);
    }

    //http://localhost:8080/employees/filterByName?name=Ali&location=Warszawa
    @GetMapping("/employees/filterByNameAndLocation")
    public
    ResponseEntity<List<Employee>> getEmployeesByNameAndLocation(@RequestParam String name, @RequestParam String location) {
        return new ResponseEntity<List<Employee>>(employeeService.getEmployeesByNameAndLocation(name, location), HttpStatus.OK);
    }

    //http://localhost:8080/employees/Andrzej/BER
    @GetMapping("/employees/{name}/{location}")
    public
    ResponseEntity<List<Employee>> getEmployeesByNameOrLocation(@PathVariable String name, @PathVariable String location) {
        return new ResponseEntity<List<Employee>>(employeeService.getEmployeesByNameOrLocation(name, location), HttpStatus.OK);
    }

    //http://localhost:8080/employees/findByNameContaining?namae=acek
    @GetMapping("/employees/findByNameContaining")
    public
    ResponseEntity<List<Employee>> getEmployeesByNameContaining(@RequestParam String name) {
        return new ResponseEntity<List<Employee>>(employeeService.getEmployeesByNameContaining(name), HttpStatus.OK);
    }

    //http://localhost:8080/employees/Andrzej
    @DeleteMapping("/employees/delete/{name}")
    public
    ResponseEntity<String> deleteEmployeesByName(@PathVariable String name) {
        return new ResponseEntity<String>(employeeService.deleteEmployeesByName(name) + "No. of records deleted", HttpStatus.OK);
    }
*/

    /*
    //http://localhost:8080/employees  in Postman Create Employee
    @PostMapping("/employees")
    public
    ResponseEntity<Employee> saveEmployee(@Valid @RequestBody EmployeeRequest employeeRequest) {
        Department deptartment = new Department();
        deptartment.setName(employeeRequest.getDepartment());

        deptartment = departmentRepository.save(deptartment);

        Employee employee = new Employee(employeeRequest);
        employee.setDepartment(deptartment);

        employee = employeeRepository.save(employee);

        return new ResponseEntity<Employee>(employee, HttpStatus.CREATED);
    }

    @GetMapping("/employees/filter/{name}")
    public ResponseEntity<List<Employee>> getEmployeesByDepartment(@PathVariable String name) {
        // return new ResponseEntity<List<Employee>>  (employeeRepository.findByDepartmentName(name), HttpStatus.OK);  // pierwszy sposób
        return new ResponseEntity<List<Employee>> (employeeRepository.getEmployeesByDeptName(name), HttpStatus.OK);    // drugi sposób
    }
    */

/*
    //http://localhost:8080/employees  in Postman Create Employee
    @PostMapping("/employees")
    public
    ResponseEntity<String> saveEmployee(@Valid @RequestBody EmployeeRequest employeeRequest) {

        Employee employee = new Employee(employeeRequest);
        employee = employeeRepository.save(employee);

        for (String s : employeeRequest.getDepartment()) {
            Department d = new Department();
            d.setName(s);
            d.setEmployee(employee);

            departmentRepository.save(d);
        }

        return new ResponseEntity<String>("Record saved successfully", HttpStatus.CREATED);
    }
 */

    /*
    //http://localhost:8080/employees  in Postman Create Employee
    @PostMapping("/employees")
    public ResponseEntity<String> saveEmployee(@Valid @RequestBody EmployeeRequest employeeRequest) {


        Employee employee = new Employee(employeeRequest);
        employee = employeeRepository.save(employee);

        for (String s : employeeRequest.getDepartment()) {
            Department dep = new Department();
            dep.setName(s);
            dep.setEmployee(employee);
            departmentRepository.save(dep);
        }
        return new ResponseEntity<String>("Record saved successfully", HttpStatus.CREATED);



//        Department department = new Department();
//        department.setName(employeeRequest.getDepartment());
//
//        department = departmentRepository.save(department);
//
//        Employee employee = new Employee(employeeRequest);
//        employee.setDepartment(department);
//
//        employee = employeeRepository.save(employee);
//        return new ResponseEntity<Employee>(employee, HttpStatus.CREATED);

    }*/

    //http://localhost:8080/employees  in Postman Create Employee
    @PostMapping("/employees")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees () {
       // return employeeRepository.getEmployees();
        //return employeeDAOImplementation.getAllEmployees();
        return employeeRepository.getAllRecords();
    }

    /*
    @GetMapping("/employees")
    public ResponseEntity<List<EmployeeResponse>> getEmployees() {

        Iterable<Employee> list = employeeRepository.findAll();
        List<EmployeeResponse> responseList = new ArrayList();
        list.forEach(employee -> {
                                  List<String> depts = new ArrayList();
                                  employee.getDepartments().forEach(d -> depts.add(d.getName()));
                                  responseList.add(
                                          EmployeeResponse.builder()
                                                  .id(employee.getId())
                                                  .employeeName(employee.getName())
                                                  .departments(depts)
                                                  .build()
                                  );
                                 }
                     );


        return new ResponseEntity<List<EmployeeResponse>>(responseList, HttpStatus.OK);
    }*/

    /*
    @GetMapping("/employees/filter/{name}")
    public ResponseEntity<List<Employee>> getEmployeesByDepartment(@PathVariable String name) {
        return new ResponseEntity<List<Employee>>(employeeRepository.findByDepartmentName(name), HttpStatus.OK);
        //return new ResponseEntity<List<Employee>>(employeeRepository.getEmployeesByDepartmentName(name), HttpStatus.OK);
    }
    */
}
