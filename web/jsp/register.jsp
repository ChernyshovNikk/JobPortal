<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Job Portal Register</title>
</head>

<body>

<jsp:include page="common/_header.jsp"></jsp:include>
<jsp:include page="common/_menu.jsp"></jsp:include>

    <form action="${pageContext.request.contextPath}/controller" method="post">
        <input type="hidden" name="command" value="register"/>
        <table>
            <tr><td>Login:</td><td><input name="login" type="text"></td></tr>
            <tr><td>Password:</td><td><input name="password" type="password"></td></tr>
            <tr><td>Email:</td><td><input name="email" type="text"></td></tr>
            <tr><td>Lastname:</td><td><input name="lastname" type="text"></td></tr>
            <tr><td>Name:</td><td><input name="name" type="text"></td></tr>

            <tr><td><input value="Join!" type="submit"></td></tr>
        </table>
    </form>

<jsp:include page="common/_footer.jsp"></jsp:include>

</body>
</html>
