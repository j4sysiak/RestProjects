package com.example.demo.service;

import com.example.demo.entity.Address;
import com.example.demo.entity.Customer;
import com.example.demo.entity.Order;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Service
public class OrderService {
    private List<Order> orderDtoList;  // ta lista symuluje bazę danych

    public List<Order> getOrderDtoList() {
        orderDtoList = new ArrayList();

        Order order1 = new Order(
                new Customer("Anna Nowak", "AW2214"),
                new Address("Jana Pawła II", "Warszawa"));

        Order order2 = new Order(
                new Customer("Karol Przypalski", "UJ2214"),
                new Address("Lotników", "Kraków"));

        orderDtoList.add(order1);
        orderDtoList.add(order2);

        return orderDtoList;
    }
}
