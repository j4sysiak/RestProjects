package com.example.demo.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class DepartmentResponse {

    private Long id;

    private String departmentName;

    private String employeeName;
}
