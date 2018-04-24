<%--
  Created by IntelliJ IDEA.
  User: ASUS-PC
  Date: 4/13/2018
  Time: 12:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registation</title>
</head>
<link rel="stylesheet" type = "text/css" href = "css/style.css">
<body>

<div class="loginbox">
    <img src="pictures/images.png" class="avatar">
    <h1>Register Here</h1>
    <form action="LoginRegister" method="post">
        <p>Username</p>
        <input type = "text" name = "username" placeholder="Enter Username">
        <p>Password</p>
        <input type = "password" name ="password1" placeholder="Enter Password">
        <p>Re-Password</p>
        <input type = "password" name = "password2" placeholder="Enter Password">

        <input type = "submit" name = "register" value="Registration">
        <a href="login.jsp">Login</a>


    </form>


</div>


</body>
</html>
