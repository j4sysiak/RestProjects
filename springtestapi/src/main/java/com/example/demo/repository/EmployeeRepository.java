package com.example.demo.repository;

import com.example.demo.model.Employee;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface EmployeeRepository extends  /*JpaRepository<Employee, Long>*/  PagingAndSortingRepository<Employee, Long> {

    /* pierwszy sposób*/
   // List<Employee> findByDepartmentName(String name);

    /* drugi sposób*/
    //@Query("FROM Employee WHERE department.name = :name")
    //List<Employee> getEmployeesByDeptName(String name);

    /*
    //select * from table where name = "xx"
    List<Employee> findByName(String name);


    //select * from table where name = "xx" and location = "yy";
    List<Employee> findByNameAndLocation(String name, String location);


    //SELECT * FROM springtestapi.tbl_employee where name = "Andrzej" OR location = "BER";
    @Query("FROM Employee WHERE name = :name OR location = :location")
    List<Employee> findByNameOrLocation(@Param("name") String someName, @Param("location") String someLocation);


    //select * from table where name like "%xx%"
    List<Employee> findByNameContaining(@Param("name") String name, Sort sort);

    @Transactional
    @Modifying
    @Query("DELETE FROM Employee WHERE name = :name")
    Integer deleteEmployeesByName(@Param("name") String someName);
    */

    //List<Employee> findByDepartmentName(String name);

    //@Query("FROM Employee WHERE department.name = :name")
    //List<Employee> getEmployeesByDepartmentName(String name);

//    @Query(value = "select * FROM tbl_employee", nativeQuery = true)
//    List<Employee> getEmployees();

    List<Employee> getAllRecords();
}
