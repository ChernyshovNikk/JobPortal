<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<div style="padding: 5px;">

    <a href="${pageContext.request.contextPath}/index.jsp">Home</a>
    |
    <a href="controller?command=view_users">Users</a>
    |
    <a href="${pageContext.request.contextPath}/jsp/register.jsp">Registration</a>
    |
    <a href="jsp/login.jsp">Login</a>
    |
    <a href="controller?command=logout">LogOut</a>

</div>