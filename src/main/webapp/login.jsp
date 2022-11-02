<%--
  Created by IntelliJ IDEA.
  User: anthonys
  Date: 11/1/22
  Time: 3:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    if (request.getMethod().equalsIgnoreCase("post")) {
        if (request.getParameter("username").equals("admin") && request.getParameter("password").equals("password")) {
            response.sendRedirect("/profile.jsp");
        }else{
            response.sendRedirect("/login.jsp");
        }

    }
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%@include file="partials/nav.jsp"%>
    <form method="post" action="/login.jsp">
        <input name="username" type="text" placeholder="Username">
        <input name="password" type="password" placeholder="Password">
        <button type="submit">Submit</button>
    </form>

</body>
</html>
