<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/5/2020
  Time: 4:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Login Form</title>
</head>
<body>
<form method="post" action="LoginController">
    Username: <input type="text" name="username">
    Password: <input type="password" name="password">
    <input type="submit" value="login">
</form>
<h2>< c:out value="${param.msg}"/></h2>
</body>
</html>
