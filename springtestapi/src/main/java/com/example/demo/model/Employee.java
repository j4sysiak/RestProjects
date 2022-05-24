package com.example.demo.model;

//import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.fasterxml.jackson.annotation.JsonProperty;

import com.example.demo.request.EmployeeRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Setter
@Getter
@ToString
@Entity
@Table(name = "tbl_employee")
@NoArgsConstructor
//@NamedNativeQuery(name = "getAllRecords", query = "select * from tbl_employee", resultClass = Employee.class )
@NamedQuery(name="Employee.getAllRecords", query = "FROM Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "id")  // comment if the same name
    private Long id;

    //@JsonProperty("full_name")
    //@Column(name = "name")  // comment if the same name
    // @NotBlank(message = "Name should not be null, empty or blank!")
    private String name;
    private String location;

//    @OneToOne
//    @JoinColumn(name = "department_id")
//    private Department department;

//    @OneToMany(mappedBy = "employee")  // one employee assosiated to many dep's
//    private List<Department> departments;

//    public Employee(EmployeeRequest request) {
//        this.name = request.getName();
//    }

 /*
    //@JsonIgnore
    //@Column(name = "age")  // comment if the same name
    private Long age = 0L;

    //@Column(name = "location")  // comment if the same name
    private String location;

    //@Column(name = "email")  // comment if the same name
    @Email(message = "Please enter the valid email address!")
    private String email;

    //@Column(name = "department")  // comment if the same name
    @NotBlank(message = "Department should not be null, empty or blank!")

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private Date createAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private Date updateAt;
  */
}