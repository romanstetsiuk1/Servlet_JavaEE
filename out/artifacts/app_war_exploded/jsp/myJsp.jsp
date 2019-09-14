<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: roman
  Date: 14.09.2019
  Time: 13:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--Declaration type--%>
<%! int i = 5;%>
<%! private void doJob() {
    System.out.println("Hello word");
}%>

<%--Expresion type --%>
<%= "Hello word!"%>
<br>
<%= i + 1 + 2%>
<br>
<%= new Date()%>
<br>

</body>
</html>
