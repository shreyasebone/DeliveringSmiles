package com.sebone.deliveringsmiles.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;

import com.sebone.deliveringsmiles.dal.LoginDao;
import com.sebone.deliveringsmiles.dataobject.LoginTableDo;
@TestMethodOrder(OrderAnnotation.class)
class LoginTableDaoJunitTest {
	static LoginTableDo loginTableDo=null;
	
	LoginDao loginDao=null;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		loginTableDo=new LoginTableDo();
		loginTableDo.setDriverLoginId(2011); 
		loginTableDo.setDriverLoginTime(new Date(System.currentTimeMillis()));
		loginTableDo.setDriverLogoutTime(new Date(System.currentTimeMillis()));
		loginTableDo.setDriverStatus("1");
		loginTableDo.setDriverId(101);
		
		System.out.println("before"+Integer.toHexString(System.identityHashCode(loginTableDo)));
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
	void testInsertDriverLoginDetails() {
		loginDao=new LoginDao();
		assertEquals(true,loginDao.insertDriverLoginDetails(loginTableDo));
	}

	@Test
	@Order(2)
	void testSelectDriverLoginDetailsById() {
		LoginDao loginDao=new LoginDao();
		
		//loginTableDo=new LoginTableDo();
		
		//Date driverLoginTime=loginTableDo.getDriverLoginTime();
		
		//Date driverLoginTime1=loginDao.selectDriverLoginDetailsById(loginTableDo.getDriverLoginId()).getDriverLoginTime();
		
		//assertEquals(driverLoginTime,driverLoginTime1);
		System.out.println("select"+Integer.toHexString(System.identityHashCode(loginTableDo)));
		String driverStatus=loginTableDo.getDriverStatus();
		
		String driverStatus1=loginDao.selectDriverLoginDetailsById(loginTableDo.getDriverLoginId()).getDriverStatus();
		System.out.println(driverStatus);
		System.out.println(driverStatus1);
		assertEquals(driverStatus,driverStatus1);
	}

	@Test
	@Order(3)
	void testUpdateDriverLoginDetails() {
		LoginDao loginDao=new LoginDao();
//		
//		LoginTableDo loginTableDoUpdate = loginDao.selectDriverLoginDetailsById(loginTableDo.getDriverLoginId());
//		
//		loginTableDoUpdate.setDriverStatus("0");
//		boolean update=loginDao.updateDriverLoginDetails(loginTableDoUpdate);
//		assertEquals(true,update);
//		
//		loginDao.selectDriverLoginDetailsById(loginTableDo.getDriverLoginId());
//		assertEquals(1,loginTableDo.getDriverStatus());
		
		System.out.println("update"+Integer.toHexString(System.identityHashCode(loginTableDo)));
		
		loginTableDo.setDriverLoginId(loginTableDo.getDriverLoginId());
		
		System.out.println(loginTableDo.getDriverLoginId());
		
		loginTableDo.setDriverStatus("0");
		
		System.out.println(loginTableDo.getDriverStatus());
		
		boolean x= loginDao.updateDriverLoginDetails(loginTableDo);
		
		System.out.println(x);
		
		assertEquals(true,x);
	}

	@Test
	@Order(4)
	void testDeleteDriverLoginDetails() {
		LoginDao loginDao=new LoginDao();
		boolean i=loginDao.deleteDriverLoginDetails(loginTableDo.getDriverLoginId());
		
	}

}
