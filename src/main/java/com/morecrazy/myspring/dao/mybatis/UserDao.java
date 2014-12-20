package com.morecrazy.myspring.dao.mybatis;

import java.util.List;

import com.morecrazy.myspring.domain.User;

public interface UserDao {
	/**
	 * 根据用户名查询User对象
	 * 
	 * @param userName
	 *            用户名
	 * @return 对应userName的User对象，如果不存在，返回null。
	 */
	public User getUserByUserName(String userName);

	/**
	 * 根据用户名为模糊查询条件，查询出所有前缀匹配的User对象
	 * 
	 * @param userName
	 *            用户名查询条件
	 * @return 用户名前缀匹配的所有User对象
	 */
	public List<User> queryUserByUserName(String userName);

	public void save(User user);

	public void update(User user);
	
	public User get(int id);
	
	public List<User> loadAll();

}
