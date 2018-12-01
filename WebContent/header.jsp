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

     <!--  <nav>
        <ul>
          <li class="logo">MemorIT</li>
          <li class="aktivni">
            <button class="button2"  name="action" value="uvod">Úvodní stránka</button></li>
          <li class="aktivni">
             <button class="button2"name="action" value="vypisSeznam">Seznam balíčků</button></li>
          <li class="aktivni">
            <button class="button2" name="action" value="vyberKarticku">Kartičky</button></li>
          <li class="aktivni">
            <button class="button2" name="action" value="doplnovani">Doplňování</button></li>
          <li class="aktivni">
            <button class="button2" name="action"value="vyberPetKarticek">Přiřazování</button></li>

        </ul>
      </nav> -->
      
 
      <img class=logo src="logo750.jpg">
    
    <nav>
      <ul id="ul">
        <li class="active"> <button class="button2"  name="action" value="uvod">Úvodní stránka</button> </li>
        <li> <button class="button2"name="action" value="vypisSeznam">Seznam balíčků</button></li>
        <li> <button class="button2" name="action"  value="vyberKarticku">Kartičky</button></li>
        <li> <button class="button2" name="action" value="doplnovani">Doplňování</button></li>
        <li>  <button class="button2" name="action"value="vyberPetKarticek">Přiřazování</button></li>
      </ul>
    </nav>
    <div class="main">
      <h1>
        Vítejte v aplikaci Memorit
      </h1>
        <p>Tato aplikace je určená všem, kteří se chtějí něco naučit. Dává také možnost procvičování. Zkuste ji využít třeba k učení slovíček.</p>
    </div>

      
      <!-- <p>${session.getAttribute("nazev_balicek")}</p> -->
    </header>
    
    
</form>
  </body>
</html>