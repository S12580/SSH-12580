<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>login</title>

</head>

<body>
	<h1>登录</h1>
	<hr>
	<s:form action="loginAction!login" method="post">
		<s:textfield label="用户名" name="user.username"></s:textfield>
		<s:textfield label="密码" name="user.password"></s:textfield>
		<s:submit value=" 提交 "></s:submit>
	</s:form>
	<hr>
	<form action="AllInfo!allUser" method="post">

		<input type="submit" value="所有信息">
	</form>
</body>
</html>
