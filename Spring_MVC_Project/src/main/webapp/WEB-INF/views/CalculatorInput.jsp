<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculator Form</title>
<style>
    /* General Styles */
    body {
        font-family: Arial, sans-serif;
        background: linear-gradient(135deg, #007bff, #00c6ff);
        color: white;
        text-align: center;
        padding: 40px;
    }

    /* Container Styles */
    .container {
        background: white;
        padding: 30px;
        width: 400px;
        margin: auto;
        box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.3);
        border-radius: 10px;
        color: #333;
    }

    /* Form Styles */
    h2 {
        margin-bottom: 20px;
        font-size: 24px;
        font-weight: bold;
        color: #007bff;
    }

    label {
        font-size: 18px;
        font-weight: bold;
        display: block;
        margin-top: 15px;
    }

    input[type="text"] {
        width: 90%;
        padding: 10px;
        border-radius: 5px;
        border: 1px solid #ccc;
        box-sizing: border-box;
        font-size: 16px;
        margin-top: 5px;
    }

    /* Buttons */
    .button-container {
        display: flex;
        flex-wrap: wrap;
        justify-content: center;
        gap: 10px;
        margin-top: 20px;
    }

    input[type="submit"] {
        padding: 12px 20px;
        border: none;
        font-size: 16px;
        cursor: pointer;
        border-radius: 5px;
        transition: 0.3s;
        flex: 1 1 45%;
        max-width: 180px;
    }

    input[value="Addition"] { background: #28a745; color: white; }
    input[value="Addition"]:hover { background: #218838; }

    input[value="Subtraction"] { background: #ffc107; color: black; }
    input[value="Subtraction"]:hover { background: #e0a800; }

    input[value="Multiplication"] { background: #17a2b8; color: white; }
    input[value="Multiplication"]:hover { background: #138496; }

    input[value="Division"] { background: #dc3545; color: white; }
    input[value="Division"]:hover { background: #c82333; }
</style>
</head>
<body>
    <div class="container">
        <h2>Simple Calculator Form</h2>
        
        <form action="do_calculate">
            <label for="n1">Enter No1:</label>
            <input type="text" name="n1" required/>

            <label for="n2">Enter No2:</label>
            <input type="text" name="n2" required/>

            <div class="button-container">
                <input type="submit" value="Addition" name="operation"/>
                <input type="submit" value="Subtraction" name="operation"/>
                <input type="submit" value="Multiplication" name="operation"/>
                <input type="submit" value="Division" name="operation"/>
            </div>
        </form>
    </div>
</body>
</html>
