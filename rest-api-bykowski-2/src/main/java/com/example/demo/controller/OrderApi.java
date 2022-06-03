package com.example.demo.controller;

import com.example.demo.model.Address;
import com.example.demo.model.Customer;
import com.example.demo.dto.OrderDTO;
import com.example.demo.entity.Order;
import com.example.demo.view.OrderView;
import com.fasterxml.jackson.annotation.JsonView;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderApi {

    private List<OrderDTO> orderDtoList;

    // do DTO przekazujemy tylko tylko to co chcemy
    // tworzymy płaską lekką strukturę - łatwo czytelną dla frontu
    // dto jest wydajne

    @Autowired
    public OrderApi(ModelMapper modelMapper) {
        this.orderDtoList = new ArrayList<>();
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
    @JsonView({OrderView.Mail.class})   // wszystko będzie widoczne
   // @JsonView({OrderView.Normal.class})   // tylko data widoczna
    //@JsonView({OrderView.PackMachine.class})   //name nie będzie widoczny
    public ResponseEntity<List<OrderDTO>> getOrders() {
        return ResponseEntity.ok(orderDtoList);
    }

//    @GetMapping
//    public List<Order> getOrders() {
//        OrderService orderService = new OrderService();
//        return orderService.getOrderList();
//    }
}
