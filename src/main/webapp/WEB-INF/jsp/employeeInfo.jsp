<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Personal Information Form</title>
</head>
<body>
    <h2>Enter Your Personal Information</h2>
    <form action="/process" method="post">
        <label for="address">Address:</label><br>
        <textarea id="address" name="address" rows="4" cols="50"></textarea><br>
       
        <label for="bloodGroup">Blood Group:</label><br>
        <select id="bloodGroup" name="bloodGroup">
            <option value="A+">A+</option>
            <option value="A-">A-</option>
            <option value="B+">B+</option>
            <option value="B-">B-</option>
            <option value="AB+">AB+</option>
            <option value="AB-">AB-</option>
            <option value="O+">O+</option>
            <option value="O-">O-</option>
        </select><br>
       
        <label for="siblingsCount">Number of Siblings:</label><br>
        <input type="number" id="siblingsCount" name="siblingsCount" min="0" value="0"><br>
       <label for="siblingsType">Type of Siblings:</label><br>
        <select id="siblingsType" name="siblingsType">
            <option value="Brother">Brother</option>
            <option value="Sister">Sister</option>
            <option value="Brother and Sister">Brother and Sister</option>
<option value="Other">Other</option>
        </select><br>
       
        <input type="submit" value="Submit">
    </form>
</body>
</html>