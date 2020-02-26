package my.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import my.pojo.User;
import my.service.UserService;

public class UserAction extends ActionSupport {

	private User user;// 前台数据对象

	private UserService userService;
	private String repassword;

	public void validateRegister() {
		System.out.println(user.getUsername() + "||" + user.getPassword());
		if (user.getUsername() == null || "".equals(user.getUsername())) {
			super.addFieldError("user.username", "用户名不能为空");
			// super.addActionError("用户名错误");
		}
		if (user.getPassword() == null || "".equals(user.getPassword())) {
			super.addFieldError("user.password", "密码不能为空");
			// super.addActionError("密码错误");
		}
		if (!user.getPassword().equals(repassword)) {
			super.addFieldError("repassword", "两次密码不一致");
			// super.addActionError("两次密码不一致");
		}

	}

	public String register() {
		userService.addUser(user);
		System.out.println("用户名：" + user.getUsername());
		return SUCCESS;

	}

	public String login() {
		if (userService.findUser(user.getUsername(), user.getPassword())) {
			return SUCCESS;
		} else {
			return INPUT;
		}
	}
    
	public String allUser() {
		System.out.println("查询所有信息:");
		List<User> list = userService.findAll();
		System.out.println(list.size());
		for (int i = 0; i < list.size() - 1; i++) {
			System.out.println((list.get(i)).getUsername());
		}
		return SUCCESS;

	}
	
	
	
	
	
	
	
	
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String getRepassword() {
		return repassword;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}

}
