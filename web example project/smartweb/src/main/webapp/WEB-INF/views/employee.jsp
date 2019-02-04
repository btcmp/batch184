<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<form action="${pageContext.request.contextPath}/employee/save" method="POST">
			<input type="text" name="firstName" placeholder="your firstname"></br>
			<input type="text" name="lastName" placeholder="your last name"></br>
			<input type="text" name="email" placeholder="your email"></br>
			<input type="text" name="salary" placeholder="your salary"></br>
			<input type="submit" value="save"/>
		</form>
	</div>
</body>
</html>