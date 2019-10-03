<%--
  Created by IntelliJ IDEA.
  User: dieunguyen
  Date: 10/3/19
  Time: 11:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Caculator</h1>
<form method="get" action="caculator">
    <input type="text" name="firstNumber">
    <input type="text" name="secondNumber">
    <br>
    <input type="submit" name="math" value="Addition">
    <input type="submit" name="math" value="Subtraction">
    <input type="submit" name="math" value="Multiplication">
    <input type="submit" name="math" value="Division">
    <hr>
    <h2>Result: ${result}</h2>
</form>

</body>
</html>
