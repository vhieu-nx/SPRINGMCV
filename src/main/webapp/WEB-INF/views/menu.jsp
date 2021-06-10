<%--
  Created by IntelliJ IDEA.
  User: Mr.Nguyen
  Date: 6/10/2021
  Time: 9:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<ul>
    <c:forEach var="item" items="${menu}">
        <li>${item}</li>
    </c:forEach>
</ul>
