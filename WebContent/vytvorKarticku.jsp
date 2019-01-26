<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	 import="cz.memorit.bean.Karticka"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Vytvoř kartičku</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<%@ include file="header.jsp"%>
	<br />
	<br />
	<p>
		<span class="balicek"><%=session.getAttribute("nazev_balicek") %></span>
	</p>
	<div class="celyblok">
		<p>Vytvoř kartičku</p>
		<p>Vlož do políček slova tak, jak patří dvojice k sobě</p>
		
				<form action="MemoritServlet" method="get">
			<p>
				<label for="front_karta">Co neumím</label> 
				<input type="text" name="front_karta" value="" /> 
				<label for="back_karta">Co umím</label>
				<input type="text" name="back_karta" value="" /> 
			</p>
			
			<button type="submit" name="action" value="karticka" class="button3">Uložit</button>
		</form>

		<br /> <br /> 
		<jsp:useBean id="seznamKarticek" scope="request"
			class="cz.memorit.bean.SeznamKarticek" />
		<%
			for (Karticka karticka : seznamKarticek.getKartaList()) {
				%>
				<table>
				<tr>
				<td><%=karticka.getFront_karta() %></td>
				<td><%= karticka.getBack_karta()%></td>
				</tr>
				<br>
				</table>
				<%
			}
		%>



	</div>
</body>
</html>