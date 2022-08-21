<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit user details </title>
</head>
<body>
<h3>  Edit user details</h3>
    <form action="edit"  modelAttribute="user">
      User Id <input type="number" name="userid" /><br>
      User Name<input type="text" name="username"><br>
      User City<input type="text" name="usercity"><br>
    <input type="submit" value="save">
    </form>
</body>
</html>