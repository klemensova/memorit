<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
     
      <p><span class="balicek">Název Balíčku</span></p>
      <div class="celyblok">
        <div class= "canvas" id="canvas_front" width="100" height="200" style="border:2px solid #000000;">
          <p>neco</p>
        </div> 
        <div class= "canvas" id="canvas_back" width="100" height="200" style="border:2px solid #000000;">
          <p>neco</p>
        </div>
          <form>
            <button type="submit" name="action" value="insert" class="button">Další</button>
          </form>
          </div>
          </body>
        </html>