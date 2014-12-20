package com.morecrazy.myspring.dao.mybatis;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.unitils.UnitilsJUnit4;
import org.unitils.UnitilsJUnit4TestClassRunner;
import org.unitils.database.annotations.Transactional;
import org.unitils.dbunit.annotation.DataSet;
import org.unitils.dbunit.annotation.ExpectedDataSet;
import org.unitils.spring.annotation.SpringApplicationContext;
import org.unitils.spring.annotation.SpringBean;

import com.morecrazy.myspring.domain.User;
import com.morecrazy.myspring.service.UserService;
import com.morecrazy.myspring.test.dataset.util.XlsDataSetBeanFactory;




public class UserDaoTest extends BaseDaoTest{
	
	
	@SpringBean("userDao")
	private UserDao userDao;
	
	@Before
	public void setUp() {
		userDao = (UserDao) ctx.getBean("userDao");
	}
	
	@Test
	@DataSet("BaobaoTao.Users.xls")//准备数据 
	public void findUserByUserName() {
		if (userDao == null) { System.out.println("ok");}
		User user = userDao.getUserByUserName("jhon");

		assertNull("不存在用户名为tony的用户!", user);
		user = userDao.getUserByUserName("jan");
		assertNotNull(user);
		assertEquals("jan",user.getUserName());
		
	}

	
	// 验证数据库保存的正确性
	@Test
	@ExpectedDataSet("BaobaoTao.ExpectedSaveUser.xls")// 准备验证数据
	public void saveUser()throws Exception  {
		/**
		硬编码创建测试实体
		User u = new User();
		u.setUserId(1);
		u.setUserName("tom");
		u.setPassword("123456");
		u.setLastVisit(getDate("2011-06-06 08:00:00","yyyy-MM-dd HH:mm:ss"));
		u.setCredits(30);
		u.setLastIp("127.0.0.1");
		**/
		//通过XlsDataSetBeanFactory数据集绑定工厂创建测试实体
		User u  = XlsDataSetBeanFactory.createBean(UserDaoTest.class,"BaobaoTao.SaveUser.xls", "t_user", User.class);
		userDao.save(u);  //执行用户信息更新操作
	}
	
	//验证数据库保存的正确性
	@Test
	@ExpectedDataSet("BaobaoTao.ExpectedSaveUsers.xls")// 准备验证数据
	public void saveUsers()throws Exception  {
		List<User> users  = XlsDataSetBeanFactory.createBeans(UserDaoTest.class,"BaobaoTao.SaveUsers.xls", "t_user", User.class);
		for(User u:users){
		     userDao.save(u);
		}
	}

}
