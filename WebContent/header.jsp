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

<form action="MemoritServlet" method="post">
    <header>

 
      <img class="logo" src="logo750.jpg">
    
    <nav>
      <ul id="ul">
        <li> <button  name="action" value="uvod">Úvodní stránka</button> </li>
        <li> <button name="action" value="vypisSeznam">Seznam balíčků</button></li>
        <li> <button name="action"  value="vyberKarticku">Kartičky</button></li>
        <li> <button  name="action" value="doplnKarticku">Doplňování</button></li>
        <li> <button  name="action" value="opakdoplnKarticku">Doplňování - opak</button></li> 
        <!-- <li>  <button class="button2" name="action"value="vyberPetKarticek">Přiřazování</button></li> -->
      <!--    <li class=""> 
	        
	   
	      
       	</li> -->
      </ul>
    </nav>
   

      
    
    </header>
    
    
</form>
  </body>
</html>