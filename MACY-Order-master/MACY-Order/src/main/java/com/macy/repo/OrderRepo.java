package com.macy.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.macy.entity.OrderEntity;

public interface OrderRepo extends JpaRepository<OrderEntity, Integer>{

}
