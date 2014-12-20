package com.morecrazy.myspring.dao.mybatis;

import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.unitils.dbunit.annotation.ExpectedDataSet;
import org.unitils.spring.annotation.SpringBean;

import com.morecrazy.myspring.domain.Topic;
import com.morecrazy.myspring.test.dataset.util.XlsDataSetBeanFactory;



/**
 * topic 的DAO类
 *
 */
public class TopicDaoTest extends BaseDaoTest {
	@SpringBean("topicDao")
	private TopicDao topicDao;
	
	@Before
	public void setUp() {
		topicDao = (TopicDao) ctx.getBean("topicDao");
	}
	
	@Test
	@ExpectedDataSet("BaobaoTao.ExpectedTopics.xls")
	public void addTopic()throws Exception {
	    List<Topic> topics = XlsDataSetBeanFactory.createBeans(TopicDaoTest.class,"BaobaoTao.SaveTopics.xls", "t_topic", Topic.class);
	    for(Topic topic:topics){
	    	topicDao.save(topic);
	    }
	}
}
