<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Vytvoř balíček</title>
    <link rel="stylesheet" href="css/style.css">

      </head>
    <body>
 <%@ include file="header.jsp" %> 
      <br/>
      <br/>
      <br/>
      <br/>
      <br/>
      <br/>
      <div class="celyblok">
        <p>Zadej název nového balíčku:</p>
        <form action="action" method="post">
          <p>
            <input type="text" name="nazev_balicek" value="" />
            <button type="submit" name="action" value="insert" class="button">Uložit</button>
          </p>
        </form>

      </div>


    </body>
    </html>