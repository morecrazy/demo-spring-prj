package com.morecrazy.myspring.dao.mybatis;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.unitils.UnitilsJUnit4;
import org.unitils.UnitilsJUnit4TestClassRunner;
import org.unitils.dbunit.annotation.DataSet;
import org.unitils.spring.annotation.SpringApplicationContext;

@RunWith(UnitilsJUnit4TestClassRunner.class)
//@ContextConfiguration(locations = {"classpath:applicationContext-mybatis.xml"})
//@SpringApplicationContext({"classpath:applicationContext-mybatis.xml"})

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath:applicationContext-mybatis.xml"})
@DataSet("BaseDao.xls")
public class BaseDaoTest {
	protected static ApplicationContext ctx;
	
	@BeforeClass
	public static void setUpBeforeClass() {
		ctx = new ClassPathXmlApplicationContext("classpath:mybatis-test.xml");
	}
	
	@Test
	public void test() {
		
	}
	
}
