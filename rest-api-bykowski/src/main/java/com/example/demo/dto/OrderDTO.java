package com.example.demo.dto;

import java.time.LocalDate;

// służy do ograniczania rzeczy do pokazywania na zewnątrz
// wyciągamy z bazy danych obiekty i mapujemy na dto
// dlatego tworzymy obiekty dto - struktura płaska

public class OrderDTO {

    private String street;
    private String city;
    private String name;
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
