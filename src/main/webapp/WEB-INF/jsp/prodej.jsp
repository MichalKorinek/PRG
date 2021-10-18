<%--
  Created by IntelliJ IDEA.
  User: Michal
  Date: 15.10.2021
  Time: 17:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Vytvoření inzerátu</title>
</head>
<body>
[<a href="/">Hlavní stránka</a>]<br>
<h1>Prodej</h1>
<form action="prodej" method="post">
    <label>Kategorie</label>
    <select name="kategorie">
        <option value="Zahrada">Zahrada</option>
        <option value="Elektronika">Elektronika</option>
        <option value="Domácnost">Domácnost</option>
        <option value="Vozidla">Vozidla</option>
    </select><br><br>
    <label for="text">Popis</label>
    <input type="text" id="text" name="text"><br><br>
    <label for="cena">Cena</label>
    <input type="number" id="cena" name="cena"><br><br>
    <input type="submit" value="Vytvořit inzerát">
</form>
</body>
</html>
