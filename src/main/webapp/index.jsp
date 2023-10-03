<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title> LAB#2 </title>
  <link href="css/style.css" rel="  stylesheet" type="text/css">
</head>

<body background="img/1.jpg" style="background-size: 100%; overflow: hidden">

<div id="2" class="test"> Amelchenko Dima P3232</div>
<div id="var">Variant: 883838</div>

<div id="N1" class="line">
  <canvas class="myCanvas" id = 'canvas' width="500" height="500"></canvas>
  <script type="text/javascript" src="js/myCanvas.js"></script>
  <div class="myCanvas" id="R1" class="R">R</div>
  <div class="myCanvas" id="R2" class="R">R/2</div>
  <div class="myCanvas" id="R3" class="R">R</div>
  <div class="myCanvas" id="R4" class="R">R/2</div>
</div>


<div id="N2" class="line">
  <form id="form" action="controller?action=update" method="post">
    <div id="inputs">
      <div class="in">
        <div class="text">Choose X</div>
        <div class="inp">
          <select id="x-value" name="x" class="do2selector">
            <option>-3</option>
            <option>-2</option>
            <option>-1</option>
            <option>0</option>
            <option selected="selected">1</option>
            <option>2</option>
            <option>3</option>
            <option>4</option>
            <option>5</option>
          </select>
        </div>
      </div>
      <div class="in">
        <div class="text">Choose Y</div>
        <div class="inp"><input id="yInput" name="y" class="coordInput" placeholder="(-3 ... 3)"></div>
      </div>
      <div class="in">
        <div class="text">Choose R</div>
        <div class="inp"><select id="r-value" name="r" class="do3selector">
          <option>1</option>
          <option>2</option>
          <option>3</option>
          <option>4</option>
          <option>5</option>
        </select>
        </div>
      </div>
    </div>

    <button id="goButton" class="button">GO</button>
  </form>
  <form id="form2" method="post" action="controller?action=clear">
    <button id="clear" class="button">Clear</button>
  </form>


  <jsp:useBean id="pointCollection" scope="request" type="com.example.lab2web.backend.PointCollection"/>
  <div id="table-scroll">
  <table border="1" id="mytable">
    <thead>
    <tr>
      <th>N</th>
      <th>X</th>
      <th>Y</th>
      <th>R</th>
      <th>Check</th>
      <th>Time</th>
      <th>Time script</th>
    </tr>
    </thead>

    <tbody id="tbody">
    <%
     for (int i = 0; i < pointCollection.getLength(); i++) {
       out.println("<tr>");
       out.println("<td>" + (i + 1) +"</td>");
       out.println("<td id=\"xelem\">" + pointCollection.getPoint(i).getX() +"</td>");
       out.println("<td>" + pointCollection.getPoint(i).getY() +"</td>");
       out.println("<td>" + pointCollection.getPoint(i).getR() +"</td>");
       out.println("<td>" + pointCollection.getPoint(i).getTarget() +"</td>");
       out.println("<td>" + pointCollection.getPoint(i).getDate() +"</td>");
       out.println("<td>" + pointCollection.getPoint(i).getTime() +"</td>");
       out.println("</tr>");
     }
   %>
    </tbody>
  </table>
  </div>


  <script type="text/javascript" src="js/tbody.js"></script>
  <script type="text/javascript" src="js/click.js"></script>

</div>

<script type="text/javascript" src="js/valid.js"></script>



<div class="inviz">
  <form id="form3" action="controller?action=update" method="post">
    <div id="inputs3">
      <div class="in">
        <div class="text">Изменение Y: Text</div>
        <div class="inp">
          <input id="yInput3" name="y" class="coordInput" placeholder=" from -3 to 3">
        </div>
      </div>
      <div class="in">
        <div class="text">Изменение X: Button</div>
        <div class="inp">
          <input id="r-value3" name="r" class="coordInput" placeholder="от -3 до 3">
        </div>
      </div>
      <div class="in">
        <div class="text">Изменение R: Radio</div>
        <div class="inp"><input id="x-value3" name="x" class="coordInput" placeholder="от -3 до 3"></div>
      </div>
    </div>
  </form>

</div>
</body>
</html>