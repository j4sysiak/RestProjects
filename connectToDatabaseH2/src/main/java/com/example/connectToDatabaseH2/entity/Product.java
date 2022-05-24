package com.example.connectToDatabaseH2.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "tbl_product")
@Setter
@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 64)
    private String name;
    private Double price;
    private String description;
}
