<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Personal Information Result</title>
</head>
<body>
    <h2>Personal Information</h2>
    <!--%
        // Retrieving parameters from the form submission
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        double salary = Double.parseDouble(request.getParameter("salary"));
    %>
    <p><strong>Name:</strong> <%= request.getParameter("name")%></p>
    <p><strong>Age:</strong> <%= request.getParameter("age") %></p>
    <p><strong>Salary:</strong> <%= request.getParameter("salary") %></p-->
    <p><strong>Address:</strong> <%= request.getParameter("address") %></p>
    <p><strong>BloodGroup:</strong> <%= request.getParameter("bloodGroup") %></p>
    <p><strong>SiblingsCount:</strong> <%= request.getParameter("siblingsCount") %></p>
        <p><strong>SiblingsType:</strong> <%= request.getParameter("siblingsType") %></p>
    
</body>
</html>