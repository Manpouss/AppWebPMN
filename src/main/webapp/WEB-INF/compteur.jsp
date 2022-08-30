<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% int nbchar =(int)request.getAttribute("nbchar"); 
		String sentence = (String)request.getAttribute("sentence");
	%>
	<p>Donnez une chaîne</p>
	<form name="stringForm" id="string_form" method="post">
		<input type="text" name="sentence" placeholder="Entrez une chaîne de caractères">
		<input type="submit" name="bsubmit" value="nombre de caractères">
	</form>
	<% if(request.getParameter("bsubmit")!=null ){ 
			nbchar=sentence.replace(" ","").length();
	%>
	<% } %>
		<p>
			La chaîne  contient <%=nbchar %> caractères !
		</p>
	
</body>
</html>