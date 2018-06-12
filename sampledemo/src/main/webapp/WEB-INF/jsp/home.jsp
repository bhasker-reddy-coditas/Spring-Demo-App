<%@page import="org.springframework.web.context.request.RequestContextHolder"%>
<%@page import="org.springframework.web.servlet.support.RequestContext"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
</head>
<body>
<div style="width: 400px; margin: auto; " >
<frm:form action="login" modelAttribute="login">
<h3>Login </h3>
${message} <br>
User Name : <frm:input cssClass="form-control" path="username"/><br>
<br>
Password : <frm:password cssClass="form-control" path="password"/><br>
<button class="btn btn-primary">Login</button>  <a href="showRegisterForm">Register</a>

</frm:form>
</div>
</body>
</html>