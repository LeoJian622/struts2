<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
</head>
<body>
	<form action="register.action" method="post">
		user:<input type="text" name="user.name"/>
		pwd:<input type="password" name="user.pwd"/>
		age:<input type="text" name="user.age"/>
		email:<input type="text" name="user.email"/>
		<input type="submit" value="提交"/>
	</form>
</body>
</html>