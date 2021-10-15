<%--
  Created by IntelliJ IDEA.
  User: Michal
  Date: 15.10.2021
  Time: 13:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>Nakup</title>
</head>
<body>
<h1>Nákup</h1>
<c:forEach var="i" items="${inzeraty}">
    <tr>
    <td>${i.id}</td>
    <td align="right">
    <fmt:formatNumber pattern="#,##0.00 Kč" value="${i.cena }"/>
    </td>
    <td align="center">
    ${i.kategorie }
    </td>
    <td align="right">
    ${i.text }
    </td>
    </tr>
</c:forEach>
</body>
</html>
