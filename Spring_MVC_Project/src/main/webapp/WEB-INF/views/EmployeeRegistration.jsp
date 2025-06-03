<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Details</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f4f4;
        text-align: center;
        padding: 40px;
    }

    .container {
        background: white;
        padding: 20px;
        width: 400px;
        margin: auto;
        box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.2);
        border-radius: 10px;
    }

    h2 {
        color: #333;
        margin-bottom: 20px;
    }

    p {
        font-size: 18px;
        color: #555;
        padding: 10px;
        background: #e9ecef;
        border-radius: 5px;
        margin: 8px 0;
    }

    .highlight {
        font-weight: bold;
        color: #007bff;
    }
</style>
</head>
<body>
    <div class="container">
        <h2>Employee Information</h2>
       
        <p>Employee ID: <span class="highlight">${eid}</span></p>
        <p>Employee Name: <span class="highlight">${ename}</span></p>
        <p>Employee Salary: <span class="highlight">${esalary}</span></p>
    </div>
</body>
</html>
