package com.example.demo.service;

import com.example.demo.entity.Order;
import com.example.demo.model.Address;
import com.example.demo.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    private List<Order> orderList;

    public List<Order> getOrderList() {
        orderList = new ArrayList();
        Order order1 = new Order(
                new Customer("Anna Nowak", "AW2214"),
                new Address("Jana Pawła II", "Warszawa"));
        Order order2 = new Order(
                new Customer("Karol Przypalski", "UJ2214"),
                new Address("Lotników", "Kraków"));
        orderList.add(order1);
        orderList.add(order2);
        return orderList;
    }
}
