package com.example.demo.controller;

import com.example.demo.dto.OrderDTO;
import com.example.demo.entity.Address;
import com.example.demo.entity.Customer;
import com.example.demo.entity.Order;
import com.example.demo.service.OrderService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/orders")   //end-point   //url:  localhost:8080/api/orders
public class OrderController {

    private List<Order> orderDtoList;  // ta lista symuluje bazę danych
    private OrderService orderService;

    public OrderController() {
    }

//    @Autowired
//    //konstruktor
//    public OrderController(/*ModelMapper modelMapper*/) {
//
//        orderDtoList = new ArrayList();
//
//        Order order1 = new Order(
//                new Customer("Anna Nowak", "AW2214"),
//                new Address("Jana Pawła II", "Warszawa"));
//
//        Order order2 = new Order(
//                new Customer("Karol Przypalski", "UJ2214"),
//                new Address("Lotników", "Kraków"));
//
//        orderDtoList.add(order1);
//        orderDtoList.add(order2);
//    }

    @GetMapping
    public List<OrderDTO> getOrders(ModelMapper modelMapper) {
//        return orderDtoList;

//        OrderService orderService = new OrderService();
//        return orderService.getOrderDtoList();

        orderService = new OrderService();
        return orderService.getOrderDtoList(modelMapper);

    }
}
