package com.sebone.deliveringsmiles.unittests;

import static org.junit.Assert.*;

import java.sql.Date;
import java.time.format.DateTimeFormatter;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sebone.deliveringsmiles.dal.LoginDao;
import com.sebone.deliveringsmiles.dataobject.LoginTableDo;

public class LoginTableDaoTest {
	LoginTableDo loginTableDo=null;
	LoginDao loginDao=null;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		loginTableDo=new LoginTableDo();
		loginTableDo.setDriverLoginId(2000); 
		loginTableDo.setDriverLoginTime(new Date(System.currentTimeMillis()));
		loginTableDo.setDriverLogoutTime(new Date(System.currentTimeMillis()));
		loginTableDo.setDriverStatus("1");
		loginTableDo.setDriverId(101);
	}

	@After
	public void tearDown() throws Exception {
//		loginDao=new LoginDao();
//		loginDao.deleteDriverLoginDetails(loginTableDo.getDriverId());
	}

	@Test
	public void testInsertDriverLoginDetails() {
		loginDao=new LoginDao();
		assertEquals(true,loginDao.insertDriverLoginDetails(loginTableDo));
	}
	@Test
	public void testSelectDriverLoginDetailsById() {
		LoginDao loginDao=new LoginDao();
		LoginTableDo loginTableDo=new LoginTableDo();
		Date driverLoginTime=loginTableDo.getDriverLoginTime();
		Date driverLoginTime1=loginDao.selectDriverLoginDetailsById(loginTableDo.getDriverId()).getDriverLoginTime();
		assertEquals(driverLoginTime,driverLoginTime1);
		
//		LoginTableDo doTest=loginDao.selectDriverLoginDetailsById(loginTableDo.getDriverId());
		
//		assertEquals(doTest.getDriverId(),loginTableDo.getDriverId());	
	}
	@Test
//	public void testUpdateDriverLoginById() {
//		LoginDao loginDao=new LoginDao();
//		
//		LoginTableDo loginTableDoUpdate = loginDao.selectDriverLoginDetailsById(loginTableDo.getDriverLoginId());
//		
//		loginTableDoUpdate.setDriverStatus("0");
//		boolean update=loginDao.updateDriverLoginDetails(loginTableDoUpdate);
//		assertEquals(true,update);
//		
//		loginDao.selectDriverLoginDetailsById(212);
//		assertEquals(1,loginTableDo.getDriverStatus());
//		
//	}
	public void testDeleteDriverLogin() {
		LoginDao loginDao=new LoginDao();
		boolean i=loginDao.deleteDriverLoginDetails(loginTableDo.getDriverId());
		
	}
	

}
