<%@ page import="ru.javawebinar.basejava.model.ContactType" %>
<%@ page import="ru.javawebinar.basejava.model.Organization" %>
<%@ page import="ru.javawebinar.basejava.model.SectionType" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="ru.javawebinar.basejava.model.OrganizationSection" %>
<%@ page import="ru.javawebinar.basejava.storage.SqlStorage" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="css/style.css">
    <title>Список всех резюме</title>
</head>
<body>
<jsp:include page="fragments/header.jsp"/>
<section>
    <br>
    <table border="1" cellpadding="8" cellspacing="0" style="margin: auto">
        <tr>
            <th>Имя</th>
            <th>Email</th>
            <th>Профессия</th>
            <th><a href="resume?action=add"><img src="img/add.png" title="создать резюме"></a></th>
            <th></th>
        </tr>
        <c:forEach items="${resumes}" var="resume">
            <jsp:useBean id="resume" type="ru.javawebinar.basejava.model.Resume"/>
            <tr>
                <td><a href="resume?uuid=${resume.uuid}&action=view">${resume.fullName}</a></td>
                <td><%=ContactType.MAIL.toHtml(resume.getContact(ContactType.MAIL))%>
                </td>
                <td>
                    <c:forEach var="sectionEntry" items="${resume.sections}">
                        <jsp:useBean id="sectionEntry"
                                     type="java.util.Map.Entry<ru.javawebinar.basejava.model.SectionType, ru.javawebinar.basejava.model.AbstractSection>"/>
                        <c:set var="type" value="${sectionEntry.key}"/>
                        <c:set var="section" value="${sectionEntry.value}"/>
                        <jsp:useBean id="section" type="ru.javawebinar.basejava.model.AbstractSection"/>
                        <c:choose>
                            <c:when test="${type=='EXPERIENCE'}">
                                <c:forEach var="org" items="<%=((OrganizationSection) section).getOrganizations()%>">
                                    <c:forEach var="position" items="${org.positions}">
                                        <jsp:useBean id="position"
                                                     type="ru.javawebinar.basejava.model.Organization.Position"/>
                                        ${position.title}<br>
                                    </c:forEach>
                                </c:forEach>
                            </c:when>
                        </c:choose>
                    </c:forEach>
                </td>
                <td><a href="resume?uuid=${resume.uuid}&action=delete"><img src="img/delete.png" title="удалить резюме"></a>
                </td>
                <td><a href="resume?uuid=${resume.uuid}&action=edit"><img src="img/pencil.png"
                                                                          title="редактировать резюме"></a></td>
            </tr>
        </c:forEach>
    </table>
</section>
<jsp:include page="fragments/footer.jsp"/>
</body>
</html>