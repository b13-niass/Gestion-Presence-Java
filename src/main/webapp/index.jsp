<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%
    String uris = "/" + request.getAttribute("uriWithoutContextPath");
    String cssToInclude = "" + request.getAttribute("cssToInclude");
%>
<html>
<head>
    <meta charset="UTF-8"/>

    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>

    <link rel="stylesheet" type="text/css" href="<c:url value='/css/styles.css' />"/>
    <link rel="stylesheet" type="text/css" href="<c:url value='/css/${cssToInclude}.css' />"/>

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css"/>

    <script src="https://kit.fontawesome.com/f454128a6e.js" crossorigin="anonymous"></script>

    <title></title>
</head>
<body>
<div class="container">
    <jsp:include page="partials/menu_vertical.jsp" ></jsp:include>


    <div class="right">
        <jsp:include page="partials/menu_horizontal.jsp"></jsp:include>
        <jsp:include page="<%= uris %>">
            <jsp:param name="pageToInclud" value="<%= uris %>"/>
        </jsp:include>

        <jsp:include page="partials/footer.jsp"></jsp:include>
    </div>

</div>
</body>

</html>