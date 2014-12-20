package com.morecrazy.myspring.dao.mybatis;

import com.morecrazy.myspring.domain.Topic;

public interface TopicDao {
	public void save(Topic topic);

	public Topic get(int topicId);

	public void remove(Topic topic);

	public void update(Topic topic);
}
