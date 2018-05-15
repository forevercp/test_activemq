<%--
  Created by IntelliJ IDEA.
  User: d.cn
  Date: 2018/5/14
  Time: 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<head>
    <title>测试activeMQ</title>
</head>
<body>
    <form action="${ctx}/SendMessage" method="post">
        <input type="text" name="msg">
        <input type="submit" value="提交">
    </form>
</body>
</html>
