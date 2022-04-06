package com.sebone.deliveringsmiles.unittests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sebone.deliveringsmiles.dal.RegistrationDao;
import com.sebone.deliveringsmiles.dataobject.RegistrationTableDo;

public class RegistrationTableDaoTest {
	RegistrationTableDo registrationTableDo=null;
	RegistrationDao registrationDao=new RegistrationDao();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
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
	
	@After
	public void tearDown() throws Exception {
		RegistrationDao registrationDao=new RegistrationDao();
	//	registrationDao.deleteDriverDetails(1080);
	}

	//@Test
	public void testInsertDriverDetails() {		
//		registrationTableDo=new RegistrationTableDo();
		
		assertEquals(true,registrationDao.insertDriverDetails(registrationTableDo));
	}
	@Test
	public void testSelectDriverDetails() {
		RegistrationDao registrationDao = new RegistrationDao();
		//RegistrationTableDo doTest =registrationDao.selectDriverDetailsById(1080);
		RegistrationTableDo registrationTableDo = new RegistrationTableDo();
		
		
		String driverName = registrationTableDo.getDriverName();
		String driverName2 =registrationDao.selectDriverDetailsById(registrationTableDo.getDriverId()).getDriverName();
		String driverContact = registrationTableDo.getDriverContactNo();
		String driverContact2=registrationDao.selectDriverDetailsById(registrationTableDo.getDriverId()).getDriverContactNo();
		
		
		assertEquals(driverName,driverName2);
		assertEquals(driverContact,driverContact2);
		
		//assertEquals(doTest.getDriverContactNo(),registrationTableDo.getDriverContactNo());	
	}
	@Test
	public void testupdateDriverDetails() {
		RegistrationDao registrationDao = new RegistrationDao();
		registrationTableDo = new RegistrationTableDo();
		registrationTableDo.setDriverId(106);
		registrationTableDo.setDriverName("Priya");
		
		boolean update = registrationDao.updateDriverDetailsById(registrationTableDo);
		assertEquals(true,update);
		
		registrationDao.selectDriverDetailsById(106);
		assertEquals("Priya",registrationTableDo.getDriverName());
	}
	@Test
	public void testDeleteDriverDetails() {
		//boolean i=registrationDao.deleteDriverDetails(1080);
		//assertEquals(true,i);
		
	}
	
}
