package com.morecrazy.myspring.domain;

import java.io.Serializable;
import java.util.Date;

public class Post implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7827834702078792660L;

	private int postId;
	private int boardId;
	private int topicId;
	private int userId;
	
	private String postType;
	private String postTitle;
	private String postText;
	
	private Topic topic;
	private User user;
	

	private byte[] postAttach;

	private Date createTime;

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public String getPostText() {
		return postText;
	}

	public void setPostText(String postText) {
		this.postText = postText;
	}

	public byte[] getPostAttach() {
		return postAttach;
	}

	public void setPostAttach(byte[] postAttach) {
		this.postAttach = postAttach;
	}

	public Date getPostTime() {
		return postTime;
	}

	public void setPostTime(Date postTime) {
		this.postTime = postTime;
	}

	public String getPostTitle() {
		return postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	public int getTopicId() {
		return topicId;
	}

	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}

	public int getBoardId() {
		return boardId;
	}

	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getPostType() {
		return postType;
	}

	public void setPostType(String postType) {
		this.postType = postType;
	}

	private Date postTime;

}
