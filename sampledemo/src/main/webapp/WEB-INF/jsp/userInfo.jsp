<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Details</title>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
</head>
<body>
<h2>Registration Successful.</h2>


User Details
<hr>
<div style="width: 200px; margin:align-content: ; " > 
<label for=""><spring:message code="lbl.firstName" text="First Name"/> :</label><span>${user.firstName}</span> <br>
<label for=""><spring:message code="lbl.lastName" text="Last Name"/> :</label><span>${user.lastName}</span> <br>

<label for=""><spring:message code="lbl.mobileNo" text="Mobile No"/> :</label><span>${user.address.mobileNo}</span> <br>

<label for=""><spring:message code="lbl.emailId" text="Email Id"/> :</label><span>${user.address.email}</span> <br>

<label for=""><spring:message code="lbl.address" text="Address"/> :</label><span>${user.address.physicalAddress}</span> <br>

</div>

</body>
</html>