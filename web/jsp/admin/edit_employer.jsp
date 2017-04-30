<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Employer Info</title>
</head>
<body>

<jsp:include page="/jsp/common/_header.jsp"></jsp:include>
<jsp:include page="/jsp/common/_menu.jsp"></jsp:include>

<form action="controller" method="post">
    <c:if test="${employer != null}">
        <input type="hidden" name="command" value="update_employer"/>
    </c:if>
    <c:if test="${employer == null}">
        <input type="hidden" name="command" value="create_employer"/>
    </c:if>

    <h2 class="form-heading">
        <c:if test="${employer != null}">
            Edit Employer
        </c:if>
        <c:if test="${employer == null}">
            Add New Employer
        </c:if>
    </h2>

    <table border="1" cellpadding="7" cellspacing="1">
        <tr>
            <td>Employer ID:</td>
            <td><input name="employer_id" type="text" class="form-control"
                       value="<c:out value="${employer.employer_id}"/>" readonly="readonly"/></td>
        <tr>
        <tr>
            <td>User ID:</td>
            <td><input name="user_id" type="text" class="form-control" value="<c:out value="${employer.user_id}"/>"/>
            </td>
        <tr>
        <tr>
            <td>Employer Name:</td>
            <td><input name="employer_name" type="text" class="form-control"
                       value="<c:out value="${employer.employer_name}"/>"/></td>
        <tr>
        <tr>
            <td>Employer Information:</td>
            <td><input name="employer_information" type="text" class="form-control"
                       value="<c:out value="${employer.employer_information}"/>"/></td>
        <tr>
    </table>

    <c:if test="${employer != null}">
        <input value="Edit" type="submit">
    </c:if>
    <c:if test="${employer == null}">
        <input value="Add" type="submit">
    </c:if>
</form>

<jsp:include page="/jsp/common/_footer.jsp"></jsp:include>

</body>
</html>