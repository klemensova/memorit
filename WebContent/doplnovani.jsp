<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Doplnovani</title>
    <link rel="stylesheet" href="css/style.css">
  </head>
  <body>
    <%@ include file="header.jsp" %>
    <jsp:useBean id="doplnKarticku" scope="request" class="cz.memorit.bean.Karticka"/>
    <%
		if (session.getAttribute("nazev_balicek") != null) {
	%>
      
      <p><span class="balicek"><%=session.getAttribute("nazev_balicek") %></span></p>
    <div class="center" style="text-align: center;">
		<div id="canvas_front"
			style="background: #dcdddd; color:#444 ; text-align: center; margin: auto; display: inline-block; padding: 40px; border-radius: 25%;" >
			<jsp:getProperty name="doplnKarticku" property="front_karta" />
		</div>
		 <form action="MemoritServlet" method="get">
		<div id="canvas_back"
			style="background: #dcdddd; color: #444; text-align: center; margin: auto; padding: 40px; border-radius: 25%;" >
			<input type="text" name="dopln" />
		</div>
	
		<input type="hidden" name="back_karta" value="<jsp:getProperty name="doplnKarticku" property="back_karta" />"/>
       
      
          <button type="submit" name="action" value="kontrola" class="button">Kontrola</button>
          <br>
          <br>
          <button type="submit" name="action" value="doplnKarticku" class="button">Další</button>
        </form>
        <span class="cistic"></span>
        </div>
        <%
		}
        %>
        </body>
      </html>