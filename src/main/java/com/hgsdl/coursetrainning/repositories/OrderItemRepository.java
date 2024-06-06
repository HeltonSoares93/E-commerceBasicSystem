package com.hgsdl.coursetrainning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hgsdl.coursetrainning.entites.OrderItem;
import com.hgsdl.coursetrainning.entites.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
