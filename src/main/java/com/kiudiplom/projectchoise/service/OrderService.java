//package com.kiudiplom.projectchoise.service;
//
//import com.kiudiplom.projectchoise.entity.Clothes;
//import com.kiudiplom.projectchoise.entity.Order;
//import com.kiudiplom.projectchoise.repository.OrderRepository;
//import org.springframework.stereotype.Service;
//
//@Service
//public class OrderService {
//    private final OrderRepository orderRepository;
//
//    public OrderService(OrderRepository orderRepository) {
//        this.orderRepository = orderRepository;
//    }
//
//    public void addProduct(Clothes clothes){
//        orderRepository.save(clothes);
//    }
//    public Iterable<Order> findAll(){
//        return orderRepository.findAll();
//    }
//}
