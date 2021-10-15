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
<form method="post">
    <label>Kategorie</label>
    <select name="kategorie">
        <option value="1">Zahrada</option>
        <option value="2">Elektronika</option>
        <option value="3">Domácnost</option>
    </select><br><br>
    <label for="text">Popis</label>
    <input type="text" id="text" name="text"><br><br>
    <label for="cena">Cena</label>
    <input type="number" id="cena" name="cena"><br><br>
    <input type="submit" value="Vytvořit inzerát">
</form>
</body>
</html>
