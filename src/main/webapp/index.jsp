<%@ page import="cn.webrx.tools.User" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <title>webrx</title>
</head>
<body>
${2*3}
<hr>
<%
//ffffffffffffffffffffff
    User u = new User();
    out.print(u.getPf(14));
%>
<hr>
<c:forEach begin="1" end="10" var="i">
    <h3>hello - ${i} - ${i*i} </h3>
</c:forEach>
</body>
</html>