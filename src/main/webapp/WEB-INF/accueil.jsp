<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!-- Le fm du prefix est une chaine que l'on choisi pour préfixer, on aurait pu mettre md ou autre -->
<%@ taglib prefix ="fm" uri ="/WEB-INF/monTaglib.tld"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Accueil</title>
</head>
<body>
	<%@ include file="menu.jsp" %>
	<p>Bienvenue</p>
	<p>
		<fm:Bonjour />
	</p>
</body>
</html>