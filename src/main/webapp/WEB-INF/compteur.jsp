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
	<p>Donnez une cha�ne</p>
	<form name="stringForm" id="string_form" method="post">
		<input type="text" name="sentence" placeholder="Entrez une cha�ne de caract�res">
		<input type="submit" name="bsubmit" value="nombre de caract�res">
	</form>
	<% if(request.getParameter("bsubmit")!=null ){ 
			nbchar=sentence.replace(" ","").length();
	%>
	<% } %>
		<p>
			La cha�ne  contient <%=nbchar %> caract�res !
		</p>
	
</body>
</html>