<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Failed</title>
</head>
<body>
    <h2>Login Not Successful</h2>
    <p>${errorMessage}</p>
    <br>
    <a href="login">Try Again</a> <!-- Redirect back to login form -->
</body>
</html>
