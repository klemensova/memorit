<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Doplňování - opak</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<%@ include file="header.jsp"%>
	<jsp:useBean id="doplnKarticku" scope="session"
		class="cz.memorit.bean.Karticka" />
	<%
		if (session.getAttribute("nazev_balicek") != null) {
	%>
	
	<p>
		<span class="balicek"><%=session.getAttribute("nazev_balicek")%></span>
	</p>
	<br />
	<br />
	<div class="stranka">

	<form action="MemoritServlet" method="post">
		<!--  <div class="centrum" style="text-align: center;"> -->

		<div class="sloupec" id="front_karta"
			style="background: #dcdddd; color: #444; text-align: center; margin: 10px; display: inline-block; padding: 40px; border-radius: 25%; float: left;">
			<br /> <br />
			<jsp:getProperty name="doplnKarticku" property="back_karta" />


		</div>


		<!-- </div> -->


		<input id="back_karta" type="text" name="dopln" class="sloupec"
			style="background: #dcdddd; color: #444; text-align: center; margin: 10px; padding: 40px; border-radius: 25%; float: left;" autofocus />
		<br> <br> <input type="hidden" name="back_karta"
			value="<jsp:getProperty name="doplnKarticku" property="front_karta" />" />


		<div class="centrum">
			<button name="action" value="opakkontrola" class="button">Je tvá
				odpověď správná?</button>
			<p style="float: left; width: 300px">

				<%
					if (request.getAttribute("odpoved") != null) {
				%>

				<%
					out.println(request.getAttribute("odpoved"));
							if (request.getAttribute("odpoved").equals("ano")) {
				%>
				, pokračuj dalším slovíčkem
				<%
					} else if (request.getAttribute("odpoved").equals("ne")) {
				%>
				,  zkus to znova
				<%
					}
				%>
			</p>
			<%
				}
			%>


			<br>

			<button name="action" value="opakdoplnKarticku" class="button">Další</button>
		</div>
	</form>

	<span class="cistic"></span>
	<%
		}
	%>
</div>
</body>
</html>