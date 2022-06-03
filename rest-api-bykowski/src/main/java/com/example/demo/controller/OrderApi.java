package com.example.demo.controller;

import com.example.demo.dto.OrderDTO;
import com.example.demo.entity.Address;
import com.example.demo.entity.Customer;
import com.example.demo.entity.Order;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderApi {

    private List<OrderDTO> orderDtoList;

    @Autowired
    public OrderApi(ModelMapper modelMapper) {
        orderDtoList = new ArrayList();
        Order order1 = new Order(
                new Customer("Anna Nowak", "AW2214"),
                new Address("Jana Pawła II", "Warszawa"));
        Order order2 = new Order(
                new Customer("Karol Przypalski", "UJ2214"),
                new Address("Lotników", "Kraków"));
        orderDtoList.add(modelMapper.map(order1, OrderDTO.class));
        orderDtoList.add(modelMapper.map(order2, OrderDTO.class));
    }

    @GetMapping
    public List<OrderDTO> getOrders() {
        return orderDtoList;
    }
}
