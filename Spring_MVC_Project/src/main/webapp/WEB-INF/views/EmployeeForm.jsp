<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Information Form</title>
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

    label {
        font-weight: bold;
        display: block;
        margin-top: 10px;
    }

    input[type="text"], input[type="number"] {
        width: 90%;
        padding: 8px;
        margin-top: 5px;
        border-radius: 5px;
        border: 1px solid #ccc;
        box-sizing: border-box;
    }

    input[type="submit"] {
        margin-top: 15px;
        padding: 10px 20px;
        border: none;
        background-color: #007bff;
        color: white;
        font-size: 16px;
        cursor: pointer;
        border-radius: 5px;
        width: 100%;
    }

    input[type="submit"]:hover {
        background-color: #0056b3;
    }
</style>
</head>
<body>
    <div class="container">
        <h2>Enter Employee Details</h2>
        
        <form action="processEmployee" method="post">
            <label for="eid">Employee ID:</label>
            <input type="number" name="eid" required/>
            
            <label for="ename">Employee Name:</label>
            <input type="text" name="ename" required/>
            
            <label for="esalary">Employee Salary:</label>
            <input type="number" name="esalary" required/>
            
            <input type="submit" value="Submit Employee Details"/>
        </form>
    </div>
</body>
</html>
