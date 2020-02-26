<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
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

<title>register.jsp</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<%-- <script type="text/javascript" src="<%=path%>/js/jquery-1.7.2.js"></script>
<script type="text/javascript">
	$(function() {

		$("#un").blur(function() {
			$.ajax({
				type : "post",
				url : "jsonAction!validateUsername",
				data : {
					username : $("#un").val()
				},
				dataType : "json",
				success : (function(data) {
					console.log(data);
					if (data == false) {
						$("#tip").html("用户名已存在！");
					}

				})

			});
		});
	});
</script> --%>

</head>

<body>
	<h2>注册</h2>
	<hr>

	<s:form action="regAction!register" method="post">
		<s:textfield label="用户名" name="user.username" id="un"></s:textfield>
		<span id="tip" style="color:red"></span>
		<s:textfield label="新密码" name="user.password"></s:textfield>
		<s:textfield label="确认密码" name="repassword"></s:textfield>
		<s:submit value=" 提交 "></s:submit>
	</s:form>

</body>
</html>
