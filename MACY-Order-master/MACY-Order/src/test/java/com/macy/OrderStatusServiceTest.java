package com.macy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.macy.service.OrderService;
import com.macy.service.OrderServiceImp;
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderStatusServiceTest {
	
	@Mock
	OrderService orderService;
	
	@Autowired
	OrderServiceImp orderSeriveimpl;
	
	@Test
	public  void testOrderStatus() {
		OrderService orderService = mock(OrderService.class);
		when(orderService.updateOrderStatus(490048422, "CREATED")).thenReturn(new ResponseEntity<String>("Order Update Succesfully", HttpStatus.OK));
		assertEquals(HttpStatus.OK,orderSeriveimpl.updateOrderStatus(490048422, "SHIPPED").getStatusCode() );
	}

	
	@Test(expected = DataIntegrityViolationException.class)
	public  void testOrderStatusfailed() {
		OrderService orderService = mock(OrderService.class);
		when(orderService.updateOrderStatus(0, "")).thenReturn(new ResponseEntity<String>("not updated", HttpStatus.OK));
		assertEquals(HttpStatus.OK,orderSeriveimpl.updateOrderStatus(0, "").getStatusCode() );
	}

	

	

}
