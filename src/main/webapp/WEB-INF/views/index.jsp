<%--
  Created by IntelliJ IDEA.
  User: cctcr
  Date: 11/21/2019
  Time: 8:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form method="get" action="/calculate">
    <input type="number" name="firstNumber"/>
    <input type="number" name="secondNumber"/>
    <br/>
    <input type="submit" name="operator" value="+">
    <input type="submit" name="operator" value="-">
    <input type="submit" name="operator" value="*">
    <input type="submit" name="operator" value="/">
  </form>
  ${rel}
${error}
  </body>
</html>
