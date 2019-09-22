<%@ page import="test.TestAddClassToJsp" %><%--
  Created by IntelliJ IDEA.
  User: roman
  Date: 22.09.2019
  Time: 20:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h4>Here I call my class.</h4>

<%=test.TestAddClassToJsp.testOnString()%>
<br>
Your summ is: <%=test.TestAddClassToJsp.summ(4,9)%>

</body>
</html>
