<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Vytvoř kartičku</title>
    <link rel="stylesheet" href="css/style.css">
  </head>
  <body>
    <%@ include file="header.jsp" %>
    <br/>
    <br/>
    <p><span class="balicek">Název Balíčku</span></p>
    <div class="celyblok">
      <p>Vytvoř kartičku</p>
      <p>Vlož do políček slova tak, jak patří dvojice k sobě</p>
      <form action="MemoritServlet" method="post">
      
        <p><input type="text" name="front_karta" value=""/>
        <label name="front_karta">Co neumím</label>
        
        <input type="text" name="back_karta" value=""/>
          <label name="back_karta">Co umím</label></p>
       
      <br/>
        <button type="submit" name="action" value="insertKarticka" class="button">Uložit</button>

      </form>
    
    <br/>
    <br/>
    <br/>
    <br/>
    <br/>
    
    
    </div>
  </body>
</html>