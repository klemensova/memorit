<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Kartička</title>
    <link rel="stylesheet" href="css/style.css">
  </head>
  <body>
    <%@ include file="header.jsp" %>
      <jsp:useBean id="randomKarticka" scope="request" class="cz.memorit.bean.Karticka"/>
      <% if (session.getAttribute("nazev_balicek") != null) { %>
      <p><span class="balicek"><%=session.getAttribute("nazev_balicek") %></span></p>
      <div class="celyblok">
        <div class= "canvas" id="canvas_front" width="100" height="200" style="border:2px solid #000000;">
          	<jsp:getProperty name="randomKarticka" property="front_karta"/>
        </div> 
        <div class= "canvas" id="canvas_back" width="100" height="200" style="border:2px solid #000000;">
          	 <jsp:getProperty name="randomKarticka" property="back_karta"/>
        </div>
          <form action="MemoritServlet">
            <button type="submit" name="action" value="vyberKarticku" class="button">Další</button>
          </form>
          </div>
          <% } %>
          </body>
        </html>