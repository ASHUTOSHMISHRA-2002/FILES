<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="CalculatorInput.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculation Result</title>
<style>
    /* General Styles */
    body {
        font-family: Arial, sans-serif;
        background: linear-gradient(135deg, #6a11cb, #2575fc);
        color: white;
        text-align: center;
        padding: 40px;
    }

    /* Container Styles */
    .result-container {
        background: white;
        padding: 30px;
        width: 400px;
        margin: auto;
        box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.3);
        border-radius: 10px;
        color: #333;
    }

    h2 {
        margin-bottom: 20px;
        font-size: 24px;
        font-weight: bold;
        color: #2575fc;
    }

    .result-text {
        font-size: 20px;
        font-weight: bold;
        color: #007bff;
        background: #e9ecef;
        padding: 15px;
        border-radius: 5px;
        margin-top: 15px;
    }

    /* Back Link */
    .back-link {
        display: inline-block;
        margin-top: 20px;
        padding: 10px 20px;
        background: #007bff;
        color: white;
        border-radius: 5px;
        text-decoration: none;
        font-size: 16px;
        transition: 0.3s;
    }

    .back-link:hover {
        background: #0056b3;
    }
</style>
</head>
<body>
    <div class="result-container">
        <h2>Calculation Result</h2>
        <p class="result-text">${operation} of ${input1} and ${input2} is: ${result}</p>
        <a href="CalculatorInput.jsp" class="back-link">Go Back</a>
    </div>
</body>
</html>
