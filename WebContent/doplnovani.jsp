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
      
      <p><span class="balicek">Název Balíčku</span></p>
      <div class="celyblok" class="vedle">
     
      <div class= "canvas" id="canvas_front" width="100" height="200" style="border:2px solid #000000;">
        <p>neco</p>
      </div> 
        <div class= "canvas" id="canvas_back" width="100" height="200" style="border:2px solid #000000;">
          <p>neco</p>
        </div> 
       
      <form>
          <button type="submit" name="action" value="insert" class="button">Kontrola</button>
          <br>
          <br>
          <button type="submit" name="action" value="insert" class="button">Další</button>
        </form>
        <span class="cistic"></span>
        </div>
        </body>
      </html>