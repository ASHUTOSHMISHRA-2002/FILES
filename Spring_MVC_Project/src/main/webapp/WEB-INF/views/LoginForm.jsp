<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
    <h2>User Login</h2>

    <form action="processLogin" method="post"> <!-- Use POST for security -->
        <label for="username">Username:</label>
        <input type="text" name="username" required/>
        <br><br>

        <label for="password">Password:</label>
        <input type="password" name="password" required/>
        <br><br>

        <input type="submit" value="Login"/>
    </form>
</body>
</html>
