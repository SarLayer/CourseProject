<%--
  Created by IntelliJ IDEA.
  User: ASUS-PC
  Date: 4/13/2018
  Time: 12:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
    <link rel="stylesheet" type = "text/css" href = "css/style.css">
<body>




        <div class="loginbox">
        <img src="pictures/images.png" class="avatar">
            <h1>Login Here</h1>
            <form action="LoginRegister" method="post">
                <p>Username</p>
                <input type = "text" name = "username" placeholder="Enter Username">
                <p>Password</p>
                <input type = "password" name = "password" placeholder="Enter Password">
                <input type = "submit" name = "login" value="Login">
                <a href="register.jsp">Registration</a>
                <h1> ${successMessage}</h1>
                <h1> ${message}</h1>

            </form>


        </div>


</body>
</html>
