package com.sebone.deliveringsmiles.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import com.sebone.deliveringsmiles.dal.OrderDao;
import com.sebone.deliveringsmiles.dataobject.OrderTableDo;

@TestMethodOrder(OrderAnnotation.class)

class OrderTableDaoJunitTest {
	static OrderTableDo orderTableDo=null;
	OrderDao orderDao=null;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		orderTableDo=new OrderTableDo();
		System.out.println("starting"+Integer.toHexString(System.identityHashCode(orderTableDo)));
		orderTableDo.setOrderId(315);
		orderTableDo.setCompanyId("abc");
		orderTableDo.setOrderTime(new Date(System.currentTimeMillis()));
		orderTableDo.setOrderSource("abdhhjdh");
		orderTableDo.setOrderDestination("nfjkjhdjf");
		orderTableDo.setPaymentMode("online");
		orderTableDo.setOrderStatus("1");
		orderTableDo.setEstimatedTime(new Date(System.currentTimeMillis()));
		orderTableDo.setEstimatedPrice(182);
		orderTableDo.setDriverId(102);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
			
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@Order(1)
	void testInsertOrderDetails() {
		//System.out.println("select"+Integer.toHexString(System.identityHashCode(orderTableDo)));
		orderDao=new OrderDao();
		//assertEquals(true,orderDao.insertOrderDetails(orderTableDo));
	}
	@Test
	@Order(2)
	void testSelectOrderDetails() {
		orderDao=new OrderDao();
		
//		System.out.println("select"+Integer.toHexString(System.identityHashCode(orderTableDo)));
		String companyId=orderTableDo.getCompanyId();
//		System.out.println(orderTableDo.getOrderId());
//		System.out.println("newobj"+Integer.toHexString(System.identityHashCode(orderDao.selectOrderDetailsById(orderTableDo.getOrderId()))));
		String companyId1=orderDao.selectOrderDetailsById(orderTableDo.getOrderId()).getCompanyId();
		
//		System.out.println(companyId);
//		System.out.println(companyId1);
		
		assertEquals(companyId,companyId1);
	}
	@Test
	@Order(3)
	void testUpdateOrderDetails() {
		orderDao=new OrderDao();
		boolean x=orderDao.updateOrderDetails(orderTableDo);
		assertEquals(true,x);
	}
	@Test
	@Order(4)
	void testDeleteOrderDetails() {
		orderDao=new OrderDao();
		//boolean i=orderDao.deleteOrderDetails(orderTableDo.getOrderId());
	}

}
