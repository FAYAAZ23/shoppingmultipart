<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
LOGIN
<form action="login1">

<input type="submit" value="adminlogin"></form>
<c:choose>
			<c:when test="${adminloginPageClicked}">
				<c:import url="/WEB-INF/jsp/Login.jsp"></c:import>
			</c:when>
			</c:choose>
</body>
</html>