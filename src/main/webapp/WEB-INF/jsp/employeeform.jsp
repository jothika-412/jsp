<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Employee Form</title>
</head>
<body>
    <h1>Employee Form</h1>
    <form action="/submitEmployee" method="post">
        Name: <input type="text" name="name"><br>
        Age: <input type="number" name="age"><br>
        Salary: <input type="number" name="salary"><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
