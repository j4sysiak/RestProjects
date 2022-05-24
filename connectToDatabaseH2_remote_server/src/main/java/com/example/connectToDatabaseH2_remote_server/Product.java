package com.example.connectToDatabaseH2_remote_server;

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
    private Long id;

    @Column(nullable = false, length = 64)
    private String name;

    @Column(nullable = false, length = 444)
    private String description;

    private Double price;
}
