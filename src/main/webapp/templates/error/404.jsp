<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Error Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .error-container {
            text-align: center;
        }

        h1 {
            font-size: 3em;
            color: #333;
        }

        p {
            font-size: 1.2em;
            color: #666;
        }

        .button {
            display: inline-block;
            padding: 10px 20px;
            background-color: #009186;
            color: white;
            text-decoration: none;
            border: none;
            border-radius: 4px;
            font-size: 1.2em;
            margin-top: 20px;
        }

        .button:hover {
            background-color: #009186;
        }
    </style>
</head>
<body>
<div class="error-container">
    <h1>Oops!</h1>
    <p>It seems like something went wrong.</p>
    <p>Please try again later.</p>
    <a href="<c:url value="/pro" />" class="button">Go Back</a>
</div>
</body>
</html>
