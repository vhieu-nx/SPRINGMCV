<%--
  Created by IntelliJ IDEA.
  User: Mr.Nguyen
  Date: 6/11/2021
  Time: 11:09 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglib.jsp"%>
<html>
<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>
    <meta name="description" content=""/>
    <meta name="author" content=""/>
    <title>Small Business - Start Bootstrap Template</title>
    <!-- Favicon-->
    <link rel="icon" type="image/x-icon" href="<c:url value='/template/web/assets/favicon.ico'/>"/>
    <!-- Core theme CSS (includes Bootstrap)-->
    <link href="<c:url value='/template/web/css/styles.css'/>" rel="stylesheet"/>
</head>
<body>
<!-- Responsive navbar-->
<%@include file="/common/web/header.jsp"%>
<!-- Page Content-->
<dec:body />
<!-- Footer-->
<%@include file="/common/web/footer.jsp"%>
<!-- Bootstrap core JS-->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"></script>
<!-- Core theme JS-->
<script src="<c:url value='/template/web/js/scripts.js'/>"></script>
</body>
</html>
