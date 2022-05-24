package com.example.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Setter
@Getter
@ToString
@Entity
@NoArgsConstructor
@Table(name = "tbl_department")   // lub @Entity(name = "tbl_department")
public  class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "id")  // comment if the same name
    private Long id;

    //@JsonProperty("full_name")
    //@Column(name = "name")  // comment if the same name
    @NotBlank(message = "Name should not be null, empty or blank!")
    private String name;

//    @OneToOne(mappedBy = "department")
//    private Employee employee;

    @ManyToOne //many dep's assosiated to single employee  (gość może mieć wiele departamentów)
    @JoinColumn(name = "employee_id")
    private Employee employee;

}
