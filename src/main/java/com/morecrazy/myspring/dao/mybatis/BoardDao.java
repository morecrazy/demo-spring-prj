package com.morecrazy.myspring.dao.mybatis;

import java.util.List;

import com.morecrazy.myspring.domain.Board;

public interface BoardDao {
	public Board get(int id);

	public void save(Board board);

	public void remove(Board board);

	public List<Board> loadAll();
}
