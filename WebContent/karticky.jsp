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
<script>
        function toggleCard(){
            var canvas_front = document.getElementById('canvas_front');
            var canvas_back = document.getElementById('canvas_back');
            if(canvas_front.style.display == 'none'){
                canvas_front.style.display = 'inline-block';
                canvas_back.style.display = 'none';
            } else {
                canvas_front.style.display = 'none';
                canvas_back.style.display = 'inline-block';
            }
        }
    </script>
	<%@ include file="header.jsp"%>
	<jsp:useBean id="randomKarticka" scope="request"
		class="cz.memorit.bean.Karticka" />
	<%
		if (session.getAttribute("nazev_balicek") != null) {
	%>
	
	<p>
		<span class="balicek"><%=session.getAttribute("nazev_balicek")%></span>
	</p>
	<br/>
		<div class="stranka">
	<div class="center" style="text-align: center;">
		<div id="canvas_front"
			style="background: #dcdddd; color:#444 ; width: 200px;  text-align: center; margin: auto; display: inline-block; padding: 40px; border-radius: 25%;" onclick="toggleCard();return false;">
			<br/>
			<jsp:getProperty name="randomKarticka" property="front_karta" />
		</div>
		<div id="canvas_back"
			style="background: #dcdddd; color: #444; width: 200px; text-align: center; margin: auto; padding: 40px; border-radius: 25%;" onclick="toggleCard();return false;">
			<br/>
			<jsp:getProperty name="randomKarticka" property="back_karta" />
		</div>
	</div>

	
	<div class="cistic"></div>
	<br/>
	<form>
		<button type="submit" name="action" value="vyberKarticku"
			class="button2" >Další</button>
	</form>

	<!-- <div class="celyblok">
        <div class= "canvas" id="canvas_front" width="100" height="200" style="border:2px solid #000000;">
          	<jsp:getProperty name="randomKarticka" property="front_karta"/>
        </div> 
        <div class= "canvas" id="canvas_back" width="100" height="200" style="border:2px solid #000000;">
          	 <jsp:getProperty name="randomKarticka" property="back_karta"/>
        </div>
          <form action="MemoritServlet">
            <button type="submit" name="action" value="vyberKarticku" class="button">Další</button>
          </form>
          </div> -->
	<%
		}
	%>
	</div>
</body>
</html>