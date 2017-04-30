<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Show All Vacancies</title>
</head>
<body>

<jsp:include page="/jsp/common/_header.jsp"></jsp:include>
<jsp:include page="/jsp/common/_menu.jsp"></jsp:include>

<table border="1" cellpadding="7" cellspacing="1">
    <thead>
    <tr>
        <th>Vacancy ID</th>
        <th>Vacancy Company ID</th>
        <th>Vacancy Name</th>
        <th>Vacancy Requirement</th>
        <th>Vacancy Payment</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
    </thead>

    <tbody>
    <c:forEach items="${vacancies}" var="vacancy">
        <tr>
            <td><c:out value="${vacancy.vacancy_id}"/></td>
            <td><c:out value="${vacancy.company_id}"/></td>
            <td><c:out value="${vacancy.vacancy_name}"/></td>
            <td><c:out value="${vacancy.vacancy_requirement}"/></td>
            <td><c:out value="${vacancy.vacancy_payment}"/></td>

            <td>
                <form action="${pageContext.request.contextPath}/controller" method="POST">
                    <input type="hidden" name="command" value="to_update_vacancy">
                    <input type="hidden" name="vacancy_id" value="${vacancy.vacancy_id}">
                    <input value="Update" type="submit">
                </form>
            </td>


            <td>
                <form action="${pageContext.request.contextPath}/controller" method="POST">
                    <input type="hidden" name="command" value="delete_vacancy">
                    <input type="hidden" name="vacancy_id" value="${vacancy.vacancy_id}">
                    <input value="Delete" type="submit">
                </form>
            </td>

        </tr>
    </c:forEach>
    </tbody>
</table>

<form action="${pageContext.request.contextPath}/controller" method="POST">
    <input type="hidden" name="command" value="to_create_vacancy">
    <input value="Add Vacancy" type="submit">
</form>

<jsp:include page="/jsp/common/_footer.jsp"></jsp:include>

</body>
</html>
