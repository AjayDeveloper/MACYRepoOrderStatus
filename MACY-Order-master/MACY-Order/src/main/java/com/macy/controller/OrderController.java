package com.macy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.macy.service.OrderService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("macy/order/")
public class OrderController {

	@Autowired
	OrderService orderService;

	@ApiOperation(value = "This Method is used to update the status of Order")
	@PutMapping(value = "update/xml", consumes = { MediaType.APPLICATION_JSON_VALUE }, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<String> updateOrder(@RequestParam(name = "orderId") int orderId,
			@RequestParam(name = "orderStatus") String orderStatus) {

		return orderService.updateOrderStatus(orderId, orderStatus);
	}
}
