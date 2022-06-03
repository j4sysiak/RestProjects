package com.example.demo.dto;

import com.example.demo.view.OrderView;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonView;

import java.time.LocalDate;

public class OrderDTO {

    @JsonView({OrderView.PackMachine.class, OrderView.Mail.class})
    private String street;

    @JsonView({OrderView.PackMachine.class, OrderView.Mail.class})
    private String city;

    @JsonView({OrderView.Mail.class})
    private String name;

    @JsonView({OrderView.Normal.class})
    private LocalDate localDate;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }
}
