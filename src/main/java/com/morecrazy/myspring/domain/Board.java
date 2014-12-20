package com.morecrazy.myspring.domain;

import java.io.Serializable;

public class Board implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6030093969052886803L;

	private int boardId;

	private String boardName;

	private String boardDesc;

	private int topicNum;

	public int getBoardId() {
		return boardId;
	}

	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}

	public String getBoardName() {
		return boardName;
	}

	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}

	public String getBoardDesc() {
		return boardDesc;
	}

	public void setBoardDesc(String boardDesc) {
		this.boardDesc = boardDesc;
	}

	public int getTopicNum() {
		return topicNum;
	}

	public void setTopicNum(int topicNum) {
		this.topicNum = topicNum;
	}

}
