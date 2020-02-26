package my.service;

import java.util.List;

import my.pojo.User;

public interface UserService {
public void addUser(User user) ;
	
	public List<User> findAll();
	
	public boolean findUser(String username,String password);

}
