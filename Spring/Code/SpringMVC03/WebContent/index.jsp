<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>	
	<a href="test?username=张三">GET</a>
	
	<hr/>
	<form action="test" method="POST">
		username:<input type="text" name="username" />
		<input type="submit" value="添加" />
	</form>
</body>
</html>