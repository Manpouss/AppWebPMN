<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<%@ page import="com.formation.model.Employee" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Display employee</title>
	</head>
	<body>
		<%
			Employee duchatel = (Employee)request.getAttribute("duchatel");
		%>
		Numéro Employé : <%= duchatel.getNumemp() %> <br>
		Nom : <%= duchatel.getNomemp() %> <br>
		Prénom : <%= duchatel.getPrenomemp() %> <br>
	</body>
</html>