<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="cz.memorit.bean.Balicek"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Seznam balíčků</title>
<link rel="stylesheet" href="css/style.css">

</head>
<body>
	<%@ include file="header.jsp"%>
	
	<p>
		<span class="balicek"><% String jmenoBalicku = (String)session.getAttribute("nazev_balicek");
	        	if (jmenoBalicku != null) {
	        		out.print(jmenoBalicku);
	        	}  else  {
	        		out.print("Název vybraného balíčku");
	        	}
	       	%></span>
	</p>

	<br />
	<br />
	
	<div class="celyblok">
		<form action="MemoritServlet" method="get">
			<p>
				<a href="vytvorBalicek.jsp">Vytvoř nový balíček</a>
			<p>


				<input type="hidden" name="action" value="vybernebovytvor" />
			<ul>
				<jsp:useBean id="seznamBalicku" scope="request"
					class="cz.memorit.bean.SeznamBalicku" />
				<%
					for (Balicek balicek : seznamBalicku.getBaliceklist()) {
				%>
				<li><%=balicek.getNazev_balicek()%>
					<button class="radekseznamu"name="smazatBalicek" value="<%=balicek.getId_balicek()%>">
						Smazat balíček</button>
					<button class="vyb_balicek" name="vytvorKarticku"
						value="<%=balicek.getId_balicek()%>">Přidej kartičky</button>
					<button class="vyb_balicek"name="vybratBalicek" value="<%=balicek.getId_balicek()%>">
						Vybrat balíček</button>
					
					</li>
				<%
					}
				%>
			</ul>
		</form>
	</div>


</body>
</html>