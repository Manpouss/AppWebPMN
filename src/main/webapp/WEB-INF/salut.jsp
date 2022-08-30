<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="menu.jsp" %>
	<p><c:out value="Yooooo" /></p>
	<p>Salut Tout le monde !</p>
	<p>
		<%
			String variable = (String)request.getAttribute("variable");
				out.println(variable);
		%>
	</p>
	<p>
		<%
			for (int i=0; i<5; i++){
				out.println("Je suis là");
				out.println("<br>");
			}
		%>
	</p>
</body>
</html>