<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Prirazovani</title>
    <link rel="stylesheet" href="style.css">
  </head>
  <body>
    <%@ include file="header.jsp" %>
           
      <p><span class="balicek"><%=session.getAttribute("nazev_balicek") %></span></p>
      <div class="celyblok">
      <input class="inpucanvas"type="text" name="jmeno" size="2"> 
        <div class= "canvasd" id="canvas_front" width="100" height="200" style="border:2px solid #000000;">
          <p>neco</p> 
    </div>
      <input class="inpucanvas"type="text" name="jmeno" size="2" /> 
        <div class= "canvasd" id="canvas_front" width="100" height="200" style="border:2px solid #000000;">
          <p>neco</p> </div>
      <br>
      <input class="inpucanvas" type="text" name="jmeno" size="2" /> 
        <div class= "canvasd" id="canvas_front" width="100" height="200" style="border:2px solid #000000;">
          <p>neco</p> </div>
      
      <input class="inpucanvas" type="text" name="jmeno" size="2" /> 
        <div class= "canvasd" id="canvas_front" width="100" height="200" style="border:2px solid #000000;">
          <p>neco</p> </div>
      <br>
      <input class="inpucanvas" type="text" name="jmeno" size="2" /> 
        <div class= "canvasd" id="canvas_front" width="100" height="200" style="border:2px solid #000000;">
          <p>neco</p> </div>
      
      <input class="inpucanvas"type="text" name="jmeno" size="2" /> 
          <div class= "canvasd" id="canvas_back" width="100" height="200" style="border:2px solid #000000;">
            <p>neco</p>  </div>
      <br>
      <input class="inpucanvas"type="text" name="jmeno" size="2" /> 
        <div class= "canvasd" id="canvas_back" width="100" height="200" style="border:2px solid #000000;">
          <p>neco</p> </div>
    
      <input class="inpucanvas" type="text" name="jmeno" size="2" /> 
          <div class= "canvasd" id="canvas_back" width="100" height="200" style="border:2px solid #000000;">
            <p>neco</p> </div>
      <br>
      <input class="inpucanvas" type="text" name="jmeno" size="2" /> 
          <div class= "canvasd" id="canvas_back" width="100" height="200" style="border:2px solid #000000;">
            <p>neco</p> </div>
  
      <input class="inpucanvas" type="text" name="jmeno" size="2" /> 
          <div class= "canvasd" id="canvas_back" width="100" height="200" style="border:2px solid #000000;">
            <p>neco</p> </div>
      <br>
      
  <form>
          <button type="submit" name="action" value="insert" class="button">Kontrola</button>
          <br>
          <br>
          <button type="submit" name="action" value="insert" class="button">Další</button>
        </form>
        </div>
        </body>
      </html>