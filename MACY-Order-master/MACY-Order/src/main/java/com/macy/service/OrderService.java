package com.macy.service;

import org.springframework.http.ResponseEntity;

public interface OrderService {

	public ResponseEntity<String> updateOrderStatus(int orderId, String status);
}
