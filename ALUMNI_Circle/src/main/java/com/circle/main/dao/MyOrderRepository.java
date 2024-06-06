package com.circle.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.circle.main.entities.MyOrder;
import com.circle.main.entities.User;

import java.util.List;

public interface MyOrderRepository extends JpaRepository<MyOrder, Long>{
    public MyOrder findByOrderId(String orderId);
    public List<MyOrder> findByUser(User user);
}
