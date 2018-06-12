<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
 
</head>
<body>
Current Locale : ${pageContext.response.locale}
<hr>

<div style="width: 400px; margin: auto; " >
<frm:form action="registerUser" modelAttribute="user">

  <div class="form-group">
    <label for=""><spring:message code="lbl.firstName" text="First Name"/> :</label>
     <frm:input cssClass="form-control" path="firstName"/>
  </div>
  <div class="form-group">
    <label for=""><spring:message code="lbl.lastName" text="Last Name"/> :</label>
   <frm:input cssClass="form-control" path="lastName"/>
  </div>
  <div class="form-group">
    <label for=""><spring:message code="lbl.password" text="Password"/> :</label>
   <frm:password cssClass="form-control" path="passWord"/>
  </div>
  <div class="form-group">
    <label for=""><spring:message code="lbl.mobileNo" text="Mobile No"/> :</label>
    <frm:input cssClass="form-control" path="address.mobileNo"/>
  </div>
  <div class="form-group">
    <label for=""><spring:message code="lbl.emailId" text="Email Id"/> :</label>
    <frm:input cssClass="form-control" path="address.email"/>
  </div>
  <div class="form-group">
    <label for=""><spring:message code="lbl.address" text="Address"/> :</label>
    <frm:textarea cssClass="form-control" path="address.physicalAddress"/> 
  </div>
  
  <button type="submit" class="btn btn-primary">Register</button> <a href="home">Login</a>
</frm:form>
</div>
</body>
</html>