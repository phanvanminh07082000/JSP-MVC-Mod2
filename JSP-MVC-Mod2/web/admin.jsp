<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/5/2020
  Time: 5:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <c:if test="${sessionScope.bean==null}">
        <jsp:forward page="Login.jsp"></jsp:forward>
    </c:if>
</head>
<body>
<jsp:useBean id="bean" class="com.example.model.LoginBean" scope="session"/>

<h2>Hello, ${bean.username}</h2>


<h3>Insert new product</h3>
<form method="post" action="ProductController">
    Name: <input name="name" type="text"><br>
    Description: <input type="text" name="description"><br>
    <input type="submit" value="submit">
</form>
</body>
</html>
