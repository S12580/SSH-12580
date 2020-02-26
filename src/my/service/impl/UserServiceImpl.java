package my.service.impl;

import java.util.List;

import my.dao.UserDao;
import my.pojo.User;
import my.service.UserService;

public class UserServiceImpl implements UserService {
    
	
	private UserDao userDao;

	@Override
	public void addUser(User user) {

		userDao.saveUser(user);
	}

	@Override
	public List<User> findAll() {

		return userDao.findAll();

	}

	@Override
	public boolean findUser(String name,String password) {
		if (userDao.findUser(name, password)!=null) {
			return true;
		} else
			return false;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
    
	
	
}
