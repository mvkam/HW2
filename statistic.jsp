<%@ page import="hw22.AnketaServlet" %><%--
  Created by IntelliJ IDEA.
  User: maxvkamkin
  Date: 09.04.20
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style>
    div div{
        font-size: 120%;
        border: 1px solid blue;
        text-align: center;
    }
</style>
<head>
    <title>Statistic</title>
</head>
<body>
<h1>Respondents: <%= AnketaServlet.counter%></h1>
<div style="display:grid; grid-template-rows: repeat(4, 30px); grid-template-columns: 100px 50px";>
    <div>Male</div>
    <div><%= AnketaServlet.maleNum%></div>
    <div>Female</div>
    <div><%= AnketaServlet.femaleNum%></div>
    <div>Dogs</div>
    <div><%= AnketaServlet.dogsNum%></div>
    <div>Cats</div>
    <div><%= AnketaServlet.catsNum%></div>
</div>
</body>
</html>
