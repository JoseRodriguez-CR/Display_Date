<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Date</title>
		<link rel="stylesheet" href="/CSS/stylesheet.css" />
		<script src="/JS/dateMessage.js"></script>
	</head>
	<body class = "mainContainer">
		<h1>Today is:</h1>
		<h3 class = "date">${date}</h3>
	</body>
</html>