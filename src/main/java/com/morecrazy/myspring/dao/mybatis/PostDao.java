package com.morecrazy.myspring.dao.mybatis;

import com.morecrazy.myspring.domain.Post;

public interface PostDao {
	public void save(Post post);

	public void deleteTopicPosts(int topicId);

	public void update(Post post);

	public Post get(int postId);

	public void remove(Post post);
}
