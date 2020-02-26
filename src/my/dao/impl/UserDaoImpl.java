package my.dao.impl;

import java.util.Iterator;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import my.dao.UserDao;
import my.pojo.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(user);
	}

	@Override
	public List<User> findAll() {
		List<User> list = getHibernateTemplate().find(
				"from User");
		return list;
	}

	@Override
	public User findUser(String username, String password) {
		List<User> list = getHibernateTemplate().find(
				"from User u where u.username=? and u.password=?", username,
				password);
		Iterator<User> i=list.iterator();
		while(i.hasNext()){
			System.out.println("XXX");
			return (User)i.next();
		}
		return (User)null;
	}

	@Override
	public String checkLogin(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
