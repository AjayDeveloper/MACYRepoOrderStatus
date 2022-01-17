package com.macy.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.macy.entity.FulFillmentOrderEntity;
import com.macy.exception.InvalidOrderIdException;
import com.macy.repo.OrderFulFillmentRepo;

@Service
public class OrderServiceImp implements OrderService {

	@Autowired
	OrderFulFillmentRepo fulFillmentRepo;

	@Override
	public ResponseEntity<String> updateOrderStatus(int orderId, String status) {

		Optional<FulFillmentOrderEntity> fulFillmentOrderOptional = fulFillmentRepo.findById(orderId);

		if (fulFillmentOrderOptional.isPresent()) {
			FulFillmentOrderEntity fulFillmentOrderEntity = fulFillmentOrderOptional.get();
			fulFillmentOrderEntity.setOrderStatus(status);
			fulFillmentRepo.save(fulFillmentOrderEntity);
			return new ResponseEntity<String>("Order Update Succesfull", HttpStatus.OK);
		} else {
			throw new InvalidOrderIdException("" + orderId);
		}
	}
}
