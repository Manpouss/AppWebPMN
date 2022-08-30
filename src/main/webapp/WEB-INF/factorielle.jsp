<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% 
		for(int i=0; i< 10; i++){
			int j, f = 1;
		    
		    for(j=1; j <= i; j++){ 
		      f = f * j;  
		    }  
	%>
		    <p><%=i %>! = <%=f %></p>
	
	
	<%
		}
	%>
	<% 
		
	%>
	<p>Donnez une chaîne</p>
	<form name="factorielForm" id="factoriel_form" method="post">
		<input type="text" name="nb" placeholder="Entrez un nombre">
		<input type="submit" name="bsubmit" value="nombre">
	</form>
	<% if(request.getParameter("bsubmit")!=null ){ 
			String snb =  (String)request.getAttribute("nb");
			int nb = Integer.parseInt(snb);
			int f = 1;
		   
		    for(int i=1; i <= nb; i++){ 
		      f = f * i;  
		    }  
		    
	%>
		<p><%= nb%>! = <%=f %></p>
	<% } %>
	
</body>
</html>