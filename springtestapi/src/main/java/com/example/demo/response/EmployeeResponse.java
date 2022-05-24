package com.example.demo.response;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class EmployeeResponse {
    private Long id;

    private String employeeName;

    private List<String> departments;
}
