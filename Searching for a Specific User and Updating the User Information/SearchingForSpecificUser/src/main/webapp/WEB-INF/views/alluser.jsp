<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All User</title>
</head>
<body>
<h3>Complete User table</h3>
<table border="2">
<tr>
<th>Id</th>
<th>Name</th>  
<th>City</th>

</tr>
<c:forEach var="user" items="${userlist}">
<tr>
<td>${user.userId}</td>
<td>${user.userName}</td>
<td>${user.userCity}</td>

</tr>
</c:forEach>
</table>
</body>
</html>