package my.dao;

import java.util.List;

import my.pojo.User;

public interface UserDao {
	public void saveUser(User user);
	
	public List<User> findAll();
	
	public User findUser(String username,String password);
	
	public String checkLogin(String username);

}
