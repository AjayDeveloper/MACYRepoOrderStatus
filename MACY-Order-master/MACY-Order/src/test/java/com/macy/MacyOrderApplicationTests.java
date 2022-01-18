package com.macy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.macy.repo.OrderFulFillmentRepo;
import com.macy.service.OrderService;

@RunWith(SpringRunner.class)
@SpringBootTest
class MacyOrderApplicationTests {

	@Autowired
	OrderService orderService;
	
	@MockBean
	OrderFulFillmentRepo orderFulFillmentRepo;
	
	@Before
	public void setUp() {
	   System.out.println("Test case run");
	}
	
	@Test
	public void getOrderStatusTest() {
		
		
		
		
		
	}

}
