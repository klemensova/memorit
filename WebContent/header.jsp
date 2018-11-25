<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>MemorIT</title>
    <link rel="stylesheet" href="css/style.css">
  </head>
  <body>

<form action="MemoritServlet" method="get">
    <header>

      <nav>
        <ul>
          <li class="logo">MemorIT</li>
          <li class="aktivni">
            <button  name="action" value="">Úvodní stránka</button></li>
          <li class="aktivni">
             <button name="action" value="vypisSeznam">Seznam balíčků</button></li>
          <li class="aktivni">
            <button  name="action" value="vyberKarticku">Kartičky</button></li>
          <li class="aktivni">
            <button  name="action" value="vyberKarticku">Doplňování</button></li>
          <li class="aktivni">
            <button  name="action"value="vyberPetKarticek">Přiřazování</button></li>

        </ul>
      </nav>
      <p>${session.getAttribute("nazev_balicek")}</p>
    </header>
    
    
</form>
  </body>
</html>