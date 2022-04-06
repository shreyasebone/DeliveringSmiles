package com.sebone.deliveringsmiles.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import com.sebone.deliveringsmiles.dal.RegistrationDao;
import com.sebone.deliveringsmiles.dataobject.RegistrationTableDo;


@TestMethodOrder(OrderAnnotation.class)
class RegistrationTableDaoJunitTest {
	RegistrationTableDo registrationTableDo=null;
	RegistrationDao registrationDao=new RegistrationDao();

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		registrationTableDo=new RegistrationTableDo();
		
		registrationTableDo.setDriverId(106);
		registrationTableDo.setDriverName("pawan");
		registrationTableDo.setDriverContactNo("7877364699");
		registrationTableDo.setDriverEmail("pawan12388@gmail.com");
		registrationTableDo.setDriverAddress("khandwa");
		registrationTableDo.setDriverGovtId("1234 3232 4888");
		registrationTableDo.setDriverUsername("pawan");
		registrationTableDo.setDriverPassword("pawan@123");
		registrationTableDo.setDriverStatus("1");
	}

	@AfterEach
	void tearDown() throws Exception {
		RegistrationDao registrationDao=new RegistrationDao();
		registrationDao.deleteDriverDetails(1080);
		
	}

	@Test
	@Order(1)
	void testInsertDriverDetails() {
		assertEquals(true,registrationDao.insertDriverDetails(registrationTableDo));
	}

	@Test
	@Order(4)
	void testDeleteDriverDetails() {
		boolean i=registrationDao.deleteDriverDetails(registrationTableDo.getDriverId());
		assertEquals(true,i);
	}

	@Test
	@Order(2)
	void testSelectDriverDetailsById() {
		RegistrationDao registrationDao = new RegistrationDao();
		//RegistrationTableDo doTest =registrationDao.selectDriverDetailsById(1080);
		RegistrationTableDo registrationTableDo = new RegistrationTableDo();
		
		
		String driverName = registrationTableDo.getDriverName();
		String driverName2 =registrationDao.selectDriverDetailsById(registrationTableDo.getDriverId()).getDriverName();
		String driverContact = registrationTableDo.getDriverContactNo();
		String driverContact2=registrationDao.selectDriverDetailsById(registrationTableDo.getDriverId()).getDriverContactNo();
		
		assertEquals(driverName,driverName2);
		assertEquals(driverContact,driverContact2);
	}

	@Test
	@Order(3)
	void testUpdateDriverDetailsById() {
//		RegistrationDao registrationDao = new RegistrationDao();
////		registrationTableDo = new RegistrationTableDo();
////		registrationTableDo.setDriverId(106);
////		registrationTableDo.setDriverName("Priya");
////		
//		
//		RegistrationTableDo updateRegTableDo = registrationDao.selectDriverDetailsById(registrationTableDo.getDriverId());
//		updateRegTableDo.setDriverName("Pihu");
//		
//		boolean update = registrationDao.updateDriverDetailsById(updateRegTableDo);
//		assertEquals(true,update);
//		
//		registrationDao.selectDriverDetailsById(registrationTableDo.getDriverId());
//		assertEquals("Pihu",registrationTableDo.getDriverName());
		registrationTableDo.setDriverId(registrationTableDo.getDriverId());
		registrationTableDo.setDriverName("Priya");
		boolean x=registrationDao.updateDriverDetailsById(registrationTableDo);
		assertEquals(true,x);
		
	}

}
