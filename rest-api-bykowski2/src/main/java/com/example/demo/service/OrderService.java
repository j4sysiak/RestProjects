package com.example.demo.service;

import com.example.demo.dto.OrderDTO;
import com.example.demo.entity.Address;
import com.example.demo.entity.Customer;
import com.example.demo.entity.Order;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    private List<OrderDTO> orderDtoList;  // ta lista symuluje bazę danych

    public List<OrderDTO> getOrderDtoList(ModelMapper modelMapper) {
        this.orderDtoList = new ArrayList();
        Order order1 = new Order(
                new Customer("Anna Nowak", "AW2214"),
                new Address("Jana Pawła II", "Warszawa"));
        Order order2 = new Order(
                new Customer("Karol Przypalski", "UJ2214"),
                new Address("Lotników", "Kraków"));
        orderDtoList.add(modelMapper.map(order1, OrderDTO.class));
        orderDtoList.add(modelMapper.map(order2, OrderDTO.class));
        return orderDtoList;
    }
}
